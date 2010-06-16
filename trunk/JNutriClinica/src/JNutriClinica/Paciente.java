package JNutriClinica;

/**
 * 
 * Interface Paciente implementada pelas classes Homem e Mulher.
 * 
 * @author Antonio Ricardo
 *
 *@version 1.1
 */

public interface Paciente {

	
	/**
	 * Calcula o Indice de massa corporea do Paciente.
	 * 
	 * @return o Indice de massa corporea do paciente.
	 */
	public double getIMC();
	
	
	/**
	 * Calcula o peso teorico do Paciente.
	 * 
	 * @return o Peso teorico do Paciente.
	 */
	public double getPesoTeorico();
	
	
	/**
	 * Calcula a taxa de metabolismo basal do Paciente.
	 * 
	 * @return a taxa de metabolistao basal.
	 */
	public double getTMB();
	
	/**
	 * 
	 * @return o fator de atividade fisica.
	 */
	public double getFatorAtividadeFisica();
	
	
	/**
	 * Calcula o valor Energetico Total deste Paciente.
	 * 
	 * @return o VET.
	 */
	
	public double getVET();
	
	

	/**
	 * Calcula as pregas cutaneas do Paciente.
	 * 
	 * @return as pregas cutaneas.
	 */
	public double getPregasCutaneas();
	
	/**
	 * Calcula a relacao de cintura por quadril do Paciente.
	 * 
	 * @return a relacao cintura/quadril
	 */
	public double getRelacaoCinturaQuadril();
	
}
