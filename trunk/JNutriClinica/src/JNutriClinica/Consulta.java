package JNutriClinica;

import java.util.Calendar;

import JNutriClinica.Anamnese.atividadeFisica;
import JNutriClinica.Anamnese.patologiaChave;

/**
 * Classe Consulta
 * 
 * @author Antonio Ricardo e Laercio Vitorino
 * 
 * @version 1.2
 *
 */

public class Consulta {
	private Pessoa pessoa;
	private Anamnese anamnese;
	private String fatorAtividade;
	private String motivoDaConsulta;
	private Calendar dataDaConsulta;
	private Calendar dataDeRetorno;
	
	
	/**
	 * @param fatorAtividade
	 * @param motivoDaConsulta
	 * @param dataDaConsulta
	 * @param dataDeRetorno
	 */
	public Consulta(Pessoa pessoa, String fatorAtividade, String motivoDaConsulta, 
			Calendar dataDaConsulta, Calendar dataDeRetorno){
		try{
		setPessoa(pessoa);
		setFatorAtividade(fatorAtividade);
		setMotivoDaConsulta(motivoDaConsulta);
		setDataDaConsulta(dataDaConsulta);
		setDataDeRetorno(dataDeRetorno);
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}


	/**
	 * Altera a Anamnese para uma nova Anamnese.
	 * 
	 * @param anamnese
	 */
	public void setAnamnese(Anamnese anamnese)throws Exception {
		if(anamnese ==null){
			throw new IllegalArgumentException("Anamnese Invalida");
		}
		this.anamnese = anamnese;
	}


	/**
	 * Acessa a Anamnese desta consulta.
	 * 
	 * @return a anamnese.
	 */
	public Anamnese getAnamnese() {
		return anamnese;
	}


	/**
	 * @param fatorAtividade the fatorAtividade to set
	 */
	public void setFatorAtividade(String fatorAtividade)throws Exception {
		if(fatorAtividade == null || fatorAtividade == ""){
			throw new IllegalArgumentException("Campo nulo ou vazio");
		}
		this.fatorAtividade = fatorAtividade;
	}


	/**
	 * @return the fatorAtividade
	 */
	public String getFatorAtividade() {
		return fatorAtividade;
	}


	/**
	 * @param motivoDaConsulta the motivoDaConsulta to set
	 */
	public void setMotivoDaConsulta(String motivoDaConsulta)throws Exception {
		if(motivoDaConsulta == null || motivoDaConsulta == ""){
			throw new IllegalArgumentException("Campo nulo ou vazio");
		}
		this.motivoDaConsulta = motivoDaConsulta;
	}


	/**
	 * @return the motivoDaConsulta
	 */
	public String getMotivoDaConsulta() {
		return motivoDaConsulta;
	}


	/**
	 * @param dataDaConsulta the dataDaConsulta to set
	 */
	public void setDataDaConsulta(Calendar dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}


	/**
	 * @return the dataDaConsulta
	 */
	public Calendar getDataDaConsulta() {
		return dataDaConsulta;
	}


	/**
	 * @param dataDeRetorno the dataDeRetorno to set
	 */
	public void setDataDeRetorno(Calendar dataDeRetorno) {
		this.dataDeRetorno = dataDeRetorno;
	}


	/**
	 * @return the dataDeRetorno
	 */
	public Calendar getDataDeRetorno() {
		return dataDeRetorno;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public Diagnostico geraDiagnostico(Pessoa pessoa)throws Exception{
		if(pessoa.getAnamnese() == null){
			throw new Exception("Pessoa nao possui Anamnese");
		}
		
		return null;
		
	}
	
	
	/**
	 * Cria uma Anamnese para a Pessoa.
	 * 
	 * @param pessoa
	 * @param pesoUsual
	 * @param altura
	 * @param perdeuPeso
	 * @param cintura
	 * @param quadril
	 * @param sintomasGI
	 * @param patologiaChave
	 * @param tomaMedicamentos
	 * @param medicacoesPorDia
	 * @param atividadeFisica
	 * @throws Exception
	 */
	public void geraAnamnese(Pessoa pessoa,double pesoUsual,double altura, boolean perdeuPeso,
			double cintura, double quadril, String sintomasGI,
			patologiaChave patologiaChave, boolean tomaMedicamentos,
			int medicacoesPorDia, atividadeFisica atividadeFisica) throws Exception{
		
		Anamnese anamnese = new Anamnese(pesoUsual, altura, perdeuPeso, cintura,quadril,sintomasGI,
			patologiaChave,tomaMedicamentos,
			medicacoesPorDia, atividadeFisica);
		
		pessoa.setAnamnese(anamnese);
		
	}
	
	

}
