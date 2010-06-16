package JNutriClinica;

import java.util.Calendar;

/**
 * 
 * Classe Paciente
 * 
 * @author Antonio Ricardo
 * 
 * @version 1.1
 * 
 */

public class Paciente implements Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	private String endereco;
	private Calendar dataDeNascimento;
	private String telefone;

	public Paciente(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone) {
		setNome(nome);
		setIdade(idade);
		setCpf(formataCpf(cpf));
		setEndereco(endereco);
		setDataDeNascimento(dataDeNascimento);
		setTelefone(telefone);

	}

	@Override
	public String getCpf() {

		return cpf;
	}

	@Override
	public Calendar getDataDeNascimento() {

		return dataDeNascimento;
	}

	@Override
	public String getEndereco() {

		return endereco;
	}

	@Override
	public int getIdade() {

		return idade;
	}

	@Override
	public String getNome() {

		return nome;
	}

	@Override
	public String getTelefone() {
		return telefone;

	}

	@Override
	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;

	}

	@Override
	public void setDataDeNascimento(Calendar novaData) {
		this.dataDeNascimento = novaData;

	}

	@Override
	public void setEndereco(String novoEndereco) {
		this.endereco = novoEndereco;

	}

	@Override
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;

	}

	@Override
	public void setNome(String novoNome) {
		this.nome = novoNome;

	}

	@Override
	public void setTelefone(String novoTelefone) {
		this.telefone = novoTelefone;

	}
	
	private String formataCpf(String cpf) {
		return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
				+ cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	}

}
