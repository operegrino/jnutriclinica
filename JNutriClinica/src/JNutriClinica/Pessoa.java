package JNutriClinica;

import java.util.Calendar;

/**
 * 
 * Classe Pessoa.
 * 
 * @author Antônio Ricardo e Laércio Vitorino
 * 
 * @version 1.2
 * 
 */

public class Pessoa {

	private String nome;
	protected int idade;
	private String cpf;
	private String endereco;
	private Calendar dataDeNascimento;
	private String telefone;
	protected Anamnese anamnese;
	private final int IDADE_ADULTA_JOVEM = 18;
	private final int IDADE_ADULTA = 30;
	private final int MAIOR_IDADE = 65;
	
	/**
	 * Construtor. Cria uma pessoa a partir dos atributos passados como parâmetros.
	 * 
	 * @param nome
	 * 			O nome da pessoa.
	 * @param idade
	 * 			A idade da pessoa.
	 * @param cpf
	 * 			O CPF da pessoa.
	 * @param endereco
	 * 			O endereço da pessoa.
	 * @param dataDeNascimento
	 * 			A data de nascimento da pessoa.
	 * @param telefone
	 * 			O telefone da pessoa.
	 * @param anamnese
	 * 			A anamnese da pessoa.
	 * @throws Exception
	 * 			Lança exceção caso algum dos valores passados como parâmetros sejam nulos ou vazios.
	 */
	public Pessoa(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone, Anamnese anamnese) throws Exception{
		
		setNome(nome);
		setIdade(idade);
		setCpf(cpf);
		setEndereco(endereco);
		setDataDeNascimento(dataDeNascimento);
		setTelefone(telefone);
		setAnamnese(anamnese);			

	}
	
	/**
	 * Recupera o nome da pessoa.
	 *  
	 * @return O nome da pessoa.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Recupera o CPF da pessoa.
	 * 
	 * @return O CPF da pessoa.
	 */
	public String getCpf() {
		return cpf;
	}
	
	/**
	 * Recupera a data de nascimento da pessoa.
	 * 
	 * @return A data de nascimento da pessoa.
	 */
	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	/**
	 * Recupera o endereço da pessoa.
	 * 
	 * @return O endereço da pessoa.
	 */
	public String getEndereco() {
		return endereco;
	}
	
	/**
	 * Recupera a idade da pessoa.
	 * 
	 * @return A idade da pessoa.
	 */
	public int getIdade() {
		return idade;
	}
	
	/**
	 * Recupera o telefone da pessoa.
	 * 
	 * @return O telefone da pessoa.
	 */
	public String getTelefone() {
		return telefone;

	}
	
	/**
	 * Seta o nome da pessoa.
	 * 
	 * @param novoNome
	 * 			O nome da pessoa.
	 * @throws Exception
	 * 			Lança uma exceção caso o nome passado como parâmetro seja nulo ou vazio.
	 */
	public void setNome(String novoNome)throws Exception {
		if (novoNome == null || novoNome.equals("")) 
			throw new Exception("Nome invalido.");
		
		this.nome = novoNome;
	}
	
	/**
	 * Seta a idade da pessoa.
	 * 
	 * @param novaIdade
	 * 			A idade da pessoa.
	 * @throws Exception
	 * 			Lança uma exceção caso a idade passada como parâmetro seja negativa.
	 */
	public void setIdade(int novaIdade) throws Exception {
		if (novaIdade < 0) 
			throw new Exception("Idade invalida.");
		
		this.idade = novaIdade;
	}
	
	/**
	 * Seta o CPF da pessoa.
	 * 
	 * @param novoCpf
	 * 			O CPF da pessoa.
	 * @throws Exception
	 * 			Lança uma exceção caso o CPF passado como parâmetro seja nulo, vazio, se seu tamanho for menor ou maior que 11 ou se seu
	 * 			formato não bater com o formato padrão de CPF.
	 */
	public void setCpf(String novoCpf) throws Exception {
		if (novoCpf == null || novoCpf == "" || novoCpf.length() > 11 || novoCpf.length() < 11 || !novoCpf.matches("^[0-9]*$"))
			throw new Exception("CPF invalido.");
		
		this.cpf = formataCpf(novoCpf);
	}
	
	/**
	 * Seta o endereço da pessoa.
	 * 
	 * @param novoEndereco
	 * 			O endereço da pessoa.
	 * @throws Exception
	 * 			Lança uma exceção caso o endereço passado como parâmetro seja nulo ou vazio.
	 */
	public void setEndereco(String novoEndereco) throws Exception {
		if (novoEndereco == null || novoEndereco == "") 
			throw new Exception("Endereco invalido.");
		
		this.endereco = novoEndereco;
	}
	
	/**
	 * Seta a data de nascimento da pessoa.
	 * 
	 * @param novaData
	 * 			A data de nascimento da pessoa.
	 * @throws Exception
	 * 			Lança uma exceção caso a data passada como parâmetro seja nula.
	 */
	public void setDataDeNascimento(Calendar novaData) throws Exception {
		if (novaData == null)
			throw new Exception("Data invalida");
		
		this.dataDeNascimento = novaData;
	}
	
	/**
	 * Seta o número de telefone da pessoa.
	 * 
	 * @param novoTelefone
	 * 			O número de telefone da pessoa.
	 * @throws Exception
	 * 			Lança uma exceção caso o número de telefone passado como parâmetro seja nulo, vazio, ou se possuir mais que ou menos que
	 * 			8 dígitos.
	 */
	public void setTelefone(String novoTelefone) throws Exception {
		if (novoTelefone == null || novoTelefone.equals("") || novoTelefone.length() < 8 || novoTelefone.length() > 8)
			throw new Exception("Numero de telefone invalido.");
		
		this.telefone = formataTelefone(novoTelefone);
	}
	
	/**
	 * Transforma o CPF da pessoa para o formato: XXX.XXX.XXX-XX. 
	 * 
	 * @param cpf
	 * 		O CPF da pessoa.
	 * @return O CPF da pessoa no formato: XXX.XXX.XXX-XX
	 * @throws Exception
	 * 			Lança uma exceção caso o CPF passado como parâmetro seja nulo, vazio, se seu tamanho for menor ou maior que 11 ou se seu
	 * 			formato não bater com o formato padrão de CPF. 
	 */
	private String formataCpf(String cpf) throws Exception {
		if (cpf == null || cpf == "" || cpf.length() > 11 || cpf.length() < 11 || !cpf.matches("^[0-9]*$"))
			throw new Exception("CPF Invalido");
		
		return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	}
	
	/**
	 * Transforma o número do telefone da pessoa para o formato: XXXX-XXXX.
	 * 
	 * @param telefone
	 * 			O número do telefone da pessoa.
	 * @return O número do telefone da pessoa no formato: XXXX-XXXX.
	 */
	private String formataTelefone(String telefone) {
		return (telefone.substring(0, 4) + "-" + telefone.substring(4, 8));
	}

	/**
	 * Verifica se a pessoa é considerada Criança.
	 * 
	 * @return True caso a pessoa seja considerada criança, False caso contrário.
	 */
	public boolean isCrianca() {
		if (idade < IDADE_ADULTA_JOVEM)
			return true;
		
		return false;
	}

	/**
	 * Verifica se a pessoa é considerada Idosa.
	 * 
	 * @return True caso a pessoa seja considerada idosa, False caso contrário.
	 */
	public boolean isIdoso() {
		if (idade >= MAIOR_IDADE)
			return true;
		
		return false;

	}

	/**
	 * Verifica se a pessoa é considerada Adulta/Jovem.
	 * 
	 * @return True caso a pessoa seja considerada Adulta/Jovem, False caso contrário.
	 */
	public boolean isAdultoJovem() {
		if (IDADE_ADULTA_JOVEM <= idade && idade < IDADE_ADULTA) {
			return true;
		}
		return false;
	}

	/**
	 * Verifica se pessoa é considerada Adulta.
	 * 
	 * @return True caso a pessoa seja considerada Adulta, False caso contrário.
	 */
	public boolean isAdulto() {
		if (IDADE_ADULTA <= idade && idade < MAIOR_IDADE) {
			return true;
		}
		return false;
	}

	/**
	 * Seta a anamnese para uma pessoa.
	 * 
	 * @param anamnese
	 *            A anamnese da pessoa.
	 */
	public void setAnamnese(Anamnese anamnese) throws Exception {
		if (anamnese == null)
			throw new Exception("Anamnese invalida");
		
		this.anamnese = anamnese;
	}

	/**
	 * Recupera a anamnese da pessoa.
	 * 
	 * @return A anamnese da pessoa.
	 */
	public Anamnese getAnamnese() {
		return anamnese;
	}
}