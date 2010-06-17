package JNutriClinica;

/**
 * Classe Consulta
 * 
 * @author Antonio Ricardo
 * 
 * @version 1.0
 *
 */

public class Consulta {
	
	private Paciente paciente;
	private Anamnese anamnese;
	
	
	public Consulta(Paciente paciente, Anamnese anamnese){
		setPaciente(paciente);
		setAnamnese(anamnese);
		
	}


	/**
	 * Altera o Paciente para um novo paciente.
	 * 
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
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
	public void setAnamnese(Anamnese anamnese) {
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

}
