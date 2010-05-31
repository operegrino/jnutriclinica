package JNutriClinica;

import java.util.Calendar;
import java.util.GregorianCalendar;

//import JNutriClinica.Anamnese;

/**
 * Classe Paciente responsavel por guardar as informacoes de um paciente.
 * 
 * @author Antonio Ricardo
 * 
 * @version 1.0
 * 
 */

public class Paciente {

	private String nome;
	private String endereco;
	private String cpf;
	private int idade;
	private Calendar dataDeNascimento;
	private String genero;
	private String telefone;
	private float peso;
	private float altura;
	private String fatorAtividade;
	private String motivoDaConsulta;
	private Calendar dataDaConsulta;
	private Calendar dataDeRetorno;
	//private Anamnese anamnese;

	/**
	 * Construtor de Paciente.
	 * 
	 * @param nome
	 * @param endereco
	 * @param cpf
	 * @param idade
	 * @param dataDeNascimento
	 * @param genero
	 * @param telefone
	 * @param peso
	 * @param altura
	 * @param fatorAtividade
	 * @param motivoDaConsulta
	 * @param dataDaConsulta
	 * @param dataDeRetorno 
	 */
	public Paciente(String nome, String endereco, String cpf, int idade,
			GregorianCalendar dataDeNascimento, String genero, String telefone,
			float peso, float altura, String fatorAtividade,
			String motivoDaConsulta, GregorianCalendar dataDaConsulta, GregorianCalendar dataDeRetorno){

		if (nome == null || nome.equals("")) {
			throw new IllegalArgumentException("Nome do cliente invalido");
		}
		if (endereco == null || endereco.equals("")) {
			throw new IllegalArgumentException("Endereco do cliente invalido");
		}
		if (cpf == null || cpf.equals("") || cpf.length() > 11 || cpf.length() < 11
				|| !cpf.matches("^[0-9]*$")) {
			throw new IllegalArgumentException("CPF invalido");
		}
		if (idade <= 0) {
			throw new IllegalArgumentException("Idade invalida.");
		}
		if(dataDeNascimento == null){
			throw new IllegalArgumentException("Data de nascimento invalida.");
		}
		if (genero == null || genero.equals("")){
			throw new IllegalArgumentException("Genero invalido.");
		}
		if (telefone == null || telefone.equals("")){
			throw new IllegalArgumentException("Telefone invalido.");
		}
		if (peso <= 0){
			throw new IllegalArgumentException("Peso invalido.");
		}
		if (altura <= 0) {
			throw new IllegalArgumentException("Altura invalida.");
		}
		if (fatorAtividade == null || fatorAtividade.equals("")){
			throw new IllegalArgumentException("Fator-Atividade invalido.");
		}
		if (motivoDaConsulta == null || motivoDaConsulta.equals("")){
			throw new IllegalArgumentException("Motivo da consulta invalido.");
		}
		if (dataDaConsulta == null || dataDaConsulta.after(dataDeRetorno)){
			throw new IllegalArgumentException("Data da consulta invalida.");
		}
		if(dataDeRetorno == null || dataDeRetorno.before(dataDaConsulta) || dataDeRetorno.equals(dataDaConsulta)){
			throw new IllegalArgumentException("Data de retorno invalida.");
		}
		
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setCpf(formataCpf(cpf));
		this.setIdade(idade);
		this.setDataDeNascimento(dataDeNascimento);
		this.setGenero(genero);
		this.setTelefone(telefone);
		this.setPeso(peso);
		this.setAltura(altura);
		this.setFatorAtividade(fatorAtividade);
		this.setMotivoDaConsulta(motivoDaConsulta);
		this.setDataDaConsulta(Calendar.getInstance());
		this.setDataDeRetorno(dataDeRetorno);

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
	 * Altera o nome do paciente para um novoNome.
	 * 
	 * @param novoNome
	 * @throws Exception 
	 */
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	/**
	 * @return o nome do paciente.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o endereco do paciente para um novo endereco
	 * 
	 * @param novoEndereco
	 */
	public void setEndereco(String novoEndereco) {
		this.endereco = novoEndereco;
	}

	/**
	 * @return o endereco do paciente.
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Altera o cpf do paciente para um novo cpf.
	 * 
	 * @param novoCpf
	 */
	public void setCpf(String novoCpf) {
		this.cpf = formataCpf(novoCpf);
	}

	/**
	 * @return o cpf do paciente.
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Altera a idade do paciente para uma novaIdade.
	 * 
	 * @param novaIdade
	 */
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}

	/**
	 * @return a idade do paciente
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * Altera a dataDeNascimento do paciente para uma novaData.
	 * 
	 * @param novaData
	 */
	public void setDataDeNascimento(Calendar novaData) {
		this.dataDeNascimento = novaData;
	}

	/**
	 * @return a dataDeNascimento do paciente.
	 */
	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	/**
	 * Altera o genero do paciente para um novo genero.
	 * 
	 * @param novoGenero
	 */
	public void setGenero(String novoGenero) {
		this.genero = novoGenero;
	}

	/**
	 * @return o genero do paciente.
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Altera o telefone do paciente para um novoTelefone.
	 * 
	 * @param novoTelefone
	 */
	public void setTelefone(String novoTelefone) {
		this.telefone = novoTelefone;
	}

	/**
	 * @return o telefone do paciente.
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Altera o peso do paciente para um novoPeso.
	 * 
	 * @param novoPeso
	 */
	public void setPeso(float novoPeso) {
		this.peso = novoPeso;
	}

	/**
	 * @return o peso do paciente.
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * Altera a altura do paciente para uma novaAltura.
	 * 
	 * @param novaAltura
	 */
	public void setAltura(float novaAltura) {
		this.altura = novaAltura;
	}

	/**
	 * @return a altura do paciente.
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * Altera o fatorAtividade do paciente para um novoFatorAtividade
	 * 
	 * @param novoFatorAtividade
	 */
	public void setFatorAtividade(String novoFatorAtividade) {
		this.fatorAtividade = novoFatorAtividade;
	}

	/**
	 * @return o fatorAtividade do paciente
	 */
	public String getFatorAtividade() {
		return fatorAtividade;
	}

	/**
	 * Altera o motivoDaConsulta para um novoMotivo.
	 * 
	 * @param novoMotivo
	 */
	public void setMotivoDaConsulta(String novoMotivo) {
		this.motivoDaConsulta = novoMotivo;
	}

	/**
	 * @return o motivoDaConsulta.
	 */
	public String getMotivoDaConsulta() {
		return motivoDaConsulta;
	}

	/**
	 * Altera a dataDaConsulta para uma novaDataConsulta
	 * 
	 * @param novaDataConsulta
	 */
	public void setDataDaConsulta(Calendar calendar) {
		this.dataDaConsulta = calendar;
	}

	/**
	 * @return a dataDaConsulta
	 */
	public Calendar getDataDaConsulta() {
		return dataDaConsulta;
	}

	/**
	 * Altera a dataDeRetorno para uma novaDataRetorno.
	 * 
	 * @param novaDataRetorno
	 */
	public void setDataDeRetorno(Calendar novaDataRetorno) {
		this.dataDeRetorno = novaDataRetorno;
	}

	/**
	 * @return a dataDeRetorno.
	 */
	public Calendar getDataDeRetorno() {
		return dataDeRetorno;
	}
	
	public boolean equals(Object objeto){
		if (objeto instanceof Paciente){
			Paciente paciente = (Paciente) objeto;
			if (getNome().equals(paciente.getNome()) && getCpf().equals(paciente.getCpf()) && getDataDeNascimento().equals(paciente.getDataDeNascimento()) && getGenero().equals(paciente.getGenero()) && getPeso() == paciente.getPeso() && getAltura() == paciente.getAltura())
				return true;
			else
				return false;
		}
		else
			return false;
	}
}