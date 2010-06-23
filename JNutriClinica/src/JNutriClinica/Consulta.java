package JNutriClinica;

import java.util.Calendar;

/**
 * Classe Consulta
 * 
 * @author Antônio Ricardo e Laércio Vitorino
 * 
 * @version 1.2
 *
 */

public class Consulta {
	
	private Paciente paciente;
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
	public Consulta(Paciente paciente, Anamnese anamnese, String fatorAtividade, String motivoDaConsulta, Calendar dataDaConsulta,
			Calendar dataDeRetorno){
		try{
		setPaciente(paciente);
		setAnamnese(anamnese);
		setFatorAtividade(fatorAtividade);
		setMotivoDaConsulta(motivoDaConsulta);
		setDataDaConsulta(dataDaConsulta);
		setDataDeRetorno(dataDeRetorno);
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}


	/**
	 * Altera o Paciente para um novo paciente.
	 * 
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente)throws Exception {
		if(paciente == null){
			throw new IllegalArgumentException("paciente invalido.");
		}
		this.paciente = paciente;
	}


	/**
	 * Acessa este Paciente.
	 * 
	 * 
	 * @return o paciente.
	 */
	public Paciente getPaciente() {
		return paciente;
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
	
	

}
