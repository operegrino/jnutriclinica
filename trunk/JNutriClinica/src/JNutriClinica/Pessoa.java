package JNutriClinica;

import java.util.Calendar;

/**
 * 
 * Classe Pessoa
 * 
 * @author Antonio Ricardo
 * 
 * @version 1.1
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

	public Pessoa(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone, Anamnese anamnese)
			 {
		try{
		setNome(nome);
		setIdade(idade);
		setCpf(formataCpf(cpf));
		setEndereco(endereco);
		setDataDeNascimento(dataDeNascimento);
		setTelefone(formataTelefone(telefone));
		setAnamnese(anamnese);
		}catch(Exception e){
			e.getMessage();
			
		}

	}

	public String getCpf() {
		return cpf;
	}

	public Calendar getDataDeNascimento() {

		return dataDeNascimento;
	}

	public String getEndereco() {

		return endereco;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {

		return nome;
	}

	public String getTelefone() {
		return telefone;

	}

	public void setCpf(String novoCpf) throws Exception {
		if (cpf == null || cpf == "" || cpf.length() > 11 || cpf.length() < 11
				|| !cpf.matches("^[0-9]*$"))
			throw new IllegalArgumentException("CPF Invalido");
		this.cpf = novoCpf;

	}

	// tratar excecao para este metodo.
	public void setDataDeNascimento(Calendar novaData) {

		this.dataDeNascimento = novaData;

	}

	/**
	 * Altera o endereco deste Paciente para um novoEndereco.
	 * 
	 * @param novoEndereco
	 * 
	 * @throws IllegalArgumentException
	 */
	public void setEndereco(String novoEndereco) throws Exception {
		if (endereco == null || endereco == "") {
			throw new IllegalArgumentException("endereco invalido.");
		}
		this.endereco = novoEndereco;

	}

	/**
	 * Altera a idade deste Paciente para uma nova Idade.
	 * 
	 * @param novaIdade
	 * 
	 * @throws IllegalArgumentException
	 */

	public void setIdade(int novaIdade) throws Exception {
		if (idade < 0) {
			throw new IllegalArgumentException("idade invalida.");
		}
		this.idade = novaIdade;

	}

	/**
	 * Altera o nome desta Pessoa para um novoNome.
	 * 
	 * @param novoNome
	 * 
	 * @throws IllegalArgumentException
	 */
	public void setNome(String novoNome) {
		if (nome == null || nome == "") {
			throw new IllegalArgumentException("nome invalido.");
		}
		this.nome = novoNome;

	}

	/**
	 * Altera o telefone desta Pessoa para um novoTelefone
	 * 
	 * @param novoTelefone
	 * 
	 * @throws IllegalArgumentException
	 */
	public void setTelefone(String novoTelefone) throws Exception {
		if (novoTelefone == null || novoTelefone.length() < 8
				|| novoTelefone.length() > 8) {
			throw new IllegalArgumentException("Numero de telefone invalido.");
		}
		this.telefone = novoTelefone;

	}

	/**
	 * Formata o cpf para o formato XXX.XXX.XXX - XX.
	 * 
	 * @param cpf
	 *            o cpf do cliente.
	 * @return o cpf formatado.
	 */
	private String formataCpf(String cpf) {
		return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
				+ cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	}

	/**
	 * Formata o telefone para o formato XXXX-XXXX
	 * 
	 * @param telefone
	 *            o telefone do cliente
	 * @return o telefone formatado.
	 */
	private String formataTelefone(String telefone) {
		return (telefone.substring(0, 4) + "-" + telefone.substring(4, 8));
	}

	/**
	 * Verifica se a Pessoa eh considerada Crianca.
	 * 
	 * @return boolean
	 */
	public boolean isCrianca() {
		if (idade >= 18) {
			return false;
		}
		return true;
	}

	/**
	 * Verifica se a Pessoa eh considerada Idosa.
	 * 
	 * @return boolean
	 */
	public boolean isIdoso() {
		if (idade >= 65) {
			return true;
		}
		return false;

	}

	/**
	 * Verifica se a Pessoa eh considerada Adulta Jovem.
	 * 
	 * @return boolean
	 */
	public boolean isAdultoJovem() {
		if (18 <= idade && idade < 30) {
			return true;
		}
		return false;
	}

	/**
	 * Metodo que confere se a Pessoa eh considerada Adulta.
	 * 
	 * @return boolean
	 */
	public boolean isAdulto() {
		if (30 <= idade && idade < 60) {
			return true;
		}
		return false;
	}

	/**
	 * @param anamnese
	 *            the anamnese to set
	 */
	public void setAnamnese(Anamnese anamnese) throws Exception {
		if (anamnese == null) {
			throw new IllegalArgumentException("anamnese invalida");
		}
		this.anamnese = anamnese;
	}

	/**
	 * @return the anamnese
	 */
	public Anamnese getAnamnese() {
		return anamnese;
	}

}
