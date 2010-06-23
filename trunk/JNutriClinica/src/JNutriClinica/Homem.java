package JNutriClinica;

import java.util.Calendar;

import Mulher.fatorAtividadeFisica;

/**
 * Classe Homem que herda da classe Pessoa e implementa a Interface Paciente.
 * 
 * @author Antônio Ricardo e Laércio Vitorino
 * 
 *@version 1.2
 */
public class Homem extends Pessoa implements Paciente {
	
	private final double ATIVIDADE_LEVE = 1.55;
	private final double ATIVIDADE_MODERADA = 1.78;
	private final double ATIVIDADE_INTENSA = 2.10;
	private final double APOSENTADO = 1.51;
	
	/**
	 * Construtor que cria um homem com os atributos abaixo.
	 * 
	 * @param nome
	 * 			O nome do homem.
	 * @param idade
	 * 			A idade do homem.
	 * @param cpf
	 * 			O cpf do homem.
	 * @param endereco
	 * 			O endereço do homem.
	 * @param dataDeNascimento
	 * 			A data de nascimento do homem.
	 * @param telefone
	 * 			O telefone do homem.
	 * @param anamnese
	 * 			A anamnese do homem.
	 * @throws Exception
	 */
	public Homem(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone, Anamnese anamnese)
			throws Exception {
		super(nome, idade, cpf, endereco, dataDeNascimento, telefone, anamnese);

	}

	/**
	 * 
	 * Enum com os tipos de atividade física que um homem pode apresentar.
	 *
	 */
	public enum fatorAtividadeFisica{
		LEVE, MODERADA, INTENSA, APOSENTADA;
	}
	
	/**
	 * Recupera o fator da atividade física do homem.
	 * 
	 * @return O fator da atividade física do homem.
	 */
	@Override
	public double getFatorAtividadeFisica(){
		if (fatorAtividadeFisica.LEVE)
			return ATIVIDADE_LEVE;
		
		else if (fatorAtividadeFisica.MODERADA)
			return ATIVIDADE_MODERADA;
		
		else if (fatorAtividadeFisica.INTENSA)
			return ATIVIDADE_INTENSA;
		
		else
			return APOSENTADO;
	}
	
	/**
	 * Recupera o IMC(Índice de Massa Corpórea) do homem.
	 * 
	 * @return O IMC do homem.
	 */
	@Override
	public double getIMC() {

		return getAnamnese().getPesoUsual()
				/ (anamnese.getAltura() * anamnese.getAltura());
	}
	
	/**
	 * Recupera o peso teórico do homem.
	 * 
	 * @return O peso teórico do homem.
	 */
	@Override
	public double getPesoTeorico() {

		return anamnese.getAltura() * anamnese.getAltura() * 22.0;
	}
	
	// Nao ha, no momento, uma forma de implementar este metodo. Faltam dados.
	@Override
	public double getPregasCutaneas() {

		return 0;
	}
	
	/**
	 * Recupera a relação Cintura-Quadril do homem.
	 * 
	 * @return A relação Cintura-Quadril do homem.
	 */
	@Override
	public double getRelacaoCinturaQuadril() {

		return anamnese.getCintura() / anamnese.getQuadril();
	}
	
	/**
	 * Recupera a TMB(Taxa de Metabolismo Basal) do homem.
	 * 
	 * @return A TMB do homem.
	 */
	@Override
	public double getTMB() {
		if (isAdultoJovem()) {
			return 15.3 * anamnese.getPesoUsual() + 679;
		}
		if (isAdulto()) {
			return 11.6 * anamnese.getPesoUsual() + 879;
		}
		if (isIdoso()) {
			return 13.5 * anamnese.getPesoUsual() + 487;
		}
		return 0;
	}
	
	/**
	 * Recupera o VET(Valor Energético Total) do homem.
	 * 
	 * @return O VET do homem.
	 */
	@Override
	public double getVET() {
		return getTMB()*getAtividadeFisica();
	}
}