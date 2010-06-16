package JNutriClinica;

/**
 * 
 * Classe Consulta de um paciente
 * 
 * @author Antonio Ricardo
 * 
 * @version.
 * 
 */

public class Consulta {

	private Paciente paciente;
	private Anamnese anamnese;

	public Consulta(Paciente paciente, Anamnese anamnese) {
		setPaciente(paciente);
		setAnamnese(anamnese);
	}

	/**
	 * @param paciente
	 *            the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}

	/**
	 * @param anamnese
	 *            the anamnese to set
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

	public double getIMC() {
		return 0;
	}

	public double getPesoTeorico() {
		return 0;
	}

	public double TMB() {
		return 0;
	}

	public double fatorAtividadeFisica() {
		return 0;
	}

	public double VET() {
		return 0;
	}

	public boolean pregasCutaneas() {
		return false;
	}

	public double relacaoCinturaQuadril() {
		return 0;
	}

	@Override
	public String toString() {
		return "Consulta [TMB()=" + TMB() + ", VET()=" + VET()
				+ ", fatorAtividadeFisica()=" + fatorAtividadeFisica()
				+ ", getAnamnese()=" + getAnamnese() + ", getIMC()=" + getIMC()
				+ ", getPaciente()=" + getPaciente() + ", getPesoTeorico()="
				+ getPesoTeorico() + ", pregasCutaneas()=" + pregasCutaneas()
				+ ", relacaoCinturaQuadril()=" + relacaoCinturaQuadril() + "]";
	}

	
}
