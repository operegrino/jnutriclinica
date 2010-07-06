package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import JNutriClinica.Pessoa;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class DataBase {

	private static DataBase instanciaUnica = new DataBase();
	private static final String path = "dataXML/NewFile.xml";
	private static File USUARIOS_BD = new File(path);
	private String xml;
	private ArrayList<Pessoa> usuarios = new ArrayList<Pessoa>();
	private XStream xstream = new XStream(new DomDriver());

	private DataBase() {

	}

	public synchronized static DataBase getInstance(){
		return instanciaUnica;
	}

	/**
	 * atualiza as informações de acordo com o Banco de Dados
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void atualiza() throws FileNotFoundException, IOException, ClassNotFoundException{
		xml = retornaDoBd();
		usuarios = xmlParaObjeto(xml);
	}

	/**
	 * Atualiza o Banco de Dados com novas informações
	 * @param lista
	 * @throws IOException
	 */
	public void atualizaBD(ArrayList<Pessoa> lista) throws IOException{
		usuarios = lista;
		xml = objetoParaXML(usuarios);
		guardaNoBD(xml);

	}

	/**
	 * limpa o Banco de Dados
	 * @throws IOException 
	 */
	public void clear() throws IOException {
		ArrayList<Pessoa> vazio = new ArrayList<Pessoa>();
		atualizaBD(vazio);
	}

	/**
	 * passa um objeto para xml
	 * @param lista
	 * @return
	 */
	private String objetoParaXML(ArrayList<Pessoa> lista) {
		String inXML = xstream.toXML(lista);
		return inXML;
	}

	/**
	 * Passa do formato xml para o objeto
	 * @param inXML
	 * @return
	 */

	private ArrayList<Pessoa> xmlParaObjeto(String inXML){
		ArrayList<Pessoa> users = (ArrayList<Pessoa>) xstream.fromXML(inXML);
		return users;
	}

	/**
	 * Retorna o array de Usuarios do Banco de DAdos
	 * @return usuarios
	 */
	public ArrayList<Pessoa> getUsuarios(){
		return this.usuarios;
	}
	/**
	 * Guarda objeto no Banco de Ddados
	 * @param xml2
	 * @throws IOException
	 */
	private void guardaNoBD(String xml2) throws IOException {
		saveObject(USUARIOS_BD, xml2);
	}
	/**
	 * Retorna em formato xml o Banco de Dados
	 * @return inXML
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private String retornaDoBd() throws FileNotFoundException, IOException, ClassNotFoundException{
		String inXML = (String) recoverObject(USUARIOS_BD);
		return inXML;
	}

	/**
	 * Salva o objeto no BD
	 * @param file
	 * @param usuarios
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void saveObject(File file, Object usuarios) throws FileNotFoundException, IOException {

		if (usuarios == null) {
			throw new NullPointerException("Objeto passado é nulo");
		}

		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;


		try {
			fileOut = new FileOutputStream(file.getPath());                    
			objOut = new ObjectOutputStream(fileOut);

			objOut.writeObject(usuarios);

		} 
		catch (FileNotFoundException e) {
			throw new FileNotFoundException("O arquivo não pode ser encontrado");
		} 
		catch (IOException e) {
			throw new IOException("Erro de entrada e saída");
		}
		finally {
			if (fileOut != null) {
				fileOut.close();
			}

			if (objOut != null) {
				objOut.close();
			}
		}

	}


	/**
	 * Recupera o objeto do BD
	 * @param file
	 * @return obj
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Object recoverObject(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
		Object obj = null;

		if (file == null) {
			throw new NullPointerException("Objeto FILE é Nulo.");
		}

		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;

		try {
			fileIn = new FileInputStream(file);
			objIn = new ObjectInputStream(fileIn);

			obj = objIn.readObject();
		}
		catch (FileNotFoundException e) {
			throw new FileNotFoundException("Arquivo não encontrado");
		}
		catch (IOException e) {
			throw new IOException("Erro de entrada e saída");
		}
		catch (ClassNotFoundException e) {
			throw new ClassNotFoundException("Erro ao recuperar objeto do arquivo");
		}
		finally {
			if (fileIn != null) {
				fileIn.close();
			}

			if (objIn != null) {
				objIn.close();
			}
		}

		return obj;
	}

}
