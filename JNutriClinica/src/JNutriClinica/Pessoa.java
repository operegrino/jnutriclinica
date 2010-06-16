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
			Calendar dataDeNascimento, String telefone, Anamnese anamnese)throws Exception {
		setNome(nome);
		setIdade(idade);
		setCpf(formataCpf(cpf));
		setEndereco(endereco);
		setDataDeNascimento(dataDeNascimento);
		setTelefone(telefone);
		setAnamnese(anamnese);

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


	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;

	}

	
	public void setDataDeNascimento(Calendar novaData) {
		this.dataDeNascimento = novaData;

	}

	
	public void setEndereco(String novoEndereco) {
		this.endereco = novoEndereco;

	}

	
	public void setIdade(int novaIdade)throws Exception {

		this.idade = novaIdade;

	}

	
	public void setNome(String novoNome)throws Exception {
		this.nome = novoNome;

	}

	
	public void setTelefone(String novoTelefone) {
		this.telefone = novoTelefone;

	}
	
	private String formataCpf(String cpf) {
		return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
				+ cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	}

	public boolean isCrianca(){
		if(idade >= 18){
			return false;
		}
		return true;
	}
	
	public boolean isIdoso(){
		if (idade >= 65){
			return true;
		}
		return false;
		
	}


	/**
	 * @param anamnese the anamnese to set
	 */
	public void setAnamnese(Anamnese anamnese) {
		this.anamnese = anamnese;
	}


	/**
	 * @return the anamnese
	 */
	public Anamnese getAnamnese() {
		return anamnese;
	}

	
}
