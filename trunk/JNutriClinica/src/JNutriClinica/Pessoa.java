package JNutriClinica;

import java.util.Calendar;

/**
 * Interface Pessoa
 * 
 * @author Antonio Ricardo
 * 
 */
public interface Pessoa {

	/**
	 * Retorna o nome desta Pessoa.
	 */
	public String getNome();

	/**
	 * Altera o nome desta Pessoa.
	 */
	public void setNome(String novoNome);

	/**
	 * Retorna a idade desta Pessoa.
	 */
	public int getIdade();

	/**
	 * Altera a idade desta Pessoa.
	 */
	public void setIdade(int novaIdade);

	/**
	 * Retorna o cpf desta Pessoa.
	 */
	public String getCpf();

	/**
	 * Altera o cpf desta Pessoa.
	 */
	public void setCpf(String novoCpf);

	/**
	 * Retorna a data de nascimento desta Pessoa.
	 */
	public Calendar getDataDeNascimento();

	/**
	 * Altera a data de nascimento desta Pessoa.
	 */
	public void setDataDeNascimento(Calendar novaData);

	/**
	 * Retorna o endereço desta Pessoa.
	 */
	public String getEndereco();
	
	/**
	 * Altera o endereço desta Pessoa.
	 */
	public void setEndereco(String novoEndereco);
	
	/**
	 * Retorna o telefone desta Pessoa.
	 */
	public String getTelefone();
	
	/**
	 * Altera o telefone desta Pessoa.
	 */
	public void setTelefone(String novoTelefone);
}
