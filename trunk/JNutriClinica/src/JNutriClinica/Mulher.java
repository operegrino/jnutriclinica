package JNutriClinica;

import java.util.Calendar;

/**
 * Classe Mulher, que herda da classe Pessoa e implementa a Interface Paciente.
 * 
 * @author Antônio Ricardo e Laércio Vitorino
 * 
 * @version 1.2
 *
 */

public class Mulher extends Pessoa implements Paciente {
	
	private final double ATIVIDADE_LEVE = 1.56;
	private final double ATIVIDADE_MODERADA = 1.64;
	private final double ATIVIDADE_INTENSA = 1.82;
	private final double APOSENTADO = 1.51;
	
	/**
	 * Construtor que cria uma mulher com os atributos abaixo.
	 * 
	 * @param nome
	 * 			O nome da mulher.
	 * @param idade
	 * 			A idade da mulher.
	 * @param cpf
	 * 			O cpf da mulher.
	 * @param endereco
	 * 			O endereço da mulher.
	 * @param dataDeNascimento
	 * 			A data de nascimento da mulher.
	 * @param telefone
	 * 			O telefone da mulher.
	 * @param anamnese
	 * 			A anamnese da mulher.
	 * @throws Exception
	 * 			Lança uma exceção caso algum dos atributos sejam nulos ou vazios.
	 */
	public Mulher(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone, Anamnese anamnese)
			throws Exception {
		super(nome, idade, cpf, endereco, dataDeNascimento, telefone, anamnese);
		
	}
	
	/**
	 * 
	 * Enum com os tipos de atividade física que uma mulher pode apresentar.
	 *
	 */
	public enum fatorAtividadeFisica{
		LEVE, MODERADA, INTENSA, APOSENTADA;
	}
	
	/**
	 * Recupera o fator da atividade física da mulher.
	 * 
	 * @return O fator da atividade física da mulher.
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
	 * Recupera o IMC(Índice de Massa Corpórea) da mulher.
	 * 
	 * @return O IMC da mulher.
	 */
	@Override
	public double getIMC() {
		return getAnamnese().getPesoUsual()
				/ (anamnese.getAltura() * anamnese.getAltura());
	}
	
	/**
	 * Recupera o peso teórico da mulher.
	 * 
	 * @return O peso teórico da mulher.
	 */
	@Override
	public double getPesoTeorico() {
		return (anamnese.getAltura() * anamnese.getAltura()) * 20.8;
	}

	
	// Nao ha, no momento, uma forma de implementar este metodo. Faltam dados.
	@Override
	public double getPregasCutaneas() {
		return 0;
	}
	
	/**
	 * Recupera a relação Cintura-Quadril da mulher.
	 * 
	 * @return A relação Cintura-Quadril da mulher.
	 */
	@Override
	public double getRelacaoCinturaQuadril() {

		return anamnese.getCintura() / anamnese.getQuadril();
	}
	
	/**
	 * Recupera a TMB(Taxa de Metabolismo Basal) da mulher.
	 * 
	 * @return A TMB da mulher.
	 */
	@Override
	public double getTMB() {
		if (isAdultoJovem()) {
			return 14.7 * anamnese.getPesoUsual() + 496;
		}
		if (isAdulto()) {
			return 8.7 * anamnese.getPesoUsual() + 829;
		}
		if (isIdoso()) {
			return 10.5 * anamnese.getPesoUsual() + 596;
		}
		return 0;
	}
	
	/**
	 * Recupera o VET(Valor Energético Total) da mulher.
	 * 
	 * @return O VET da mulher.
	 */
	@Override
	public double getVET() {
		return getTMB()*getFatorAtividadeFisica();
	}
}