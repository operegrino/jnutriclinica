package JNutriClinica;


import java.util.Calendar;

import JNutriClinica.Anamnese.atividadeFisica;



/**
 * Classe Mulher, que herda da classe Pessoa e implementa a Interface Paciente.
 * 
 * @author Antonio Ricardo e Laercio Vitorino
 * 
 * @version 1.3
 * 
 */

public class Mulher extends Pessoa implements Paciente {

	private atividadeFisica atividadeFisica;

	/**
	 * Construtor que cria uma mulher com os atributos abaixo.
	 * 
	 * @param nome
	 *            O nome da mulher.
	 * @param idade
	 *            A idade da mulher.
	 * @param cpf
	 *            O cpf da mulher.
	 * @param endereco
	 *            O endereço da mulher.
	 * @param dataDeNascimento
	 *            A data de nascimento da mulher.
	 * @param telefone
	 *            O telefone da mulher.
	 * @param anamnese
	 *            A anamnese da mulher.
	 * @throws Exception
	 *             Lanca uma excecao caso algum dos atributos sejam nulos ou
	 *             vazios.
	 */
	public Mulher(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone, Anamnese anamnese)
			throws Exception {
		super(nome, idade, cpf, endereco, dataDeNascimento, telefone, anamnese);

		setAtividadeFisica(atividadeFisica);
	}



	/**
	 * 
	 * Enum com os tipos de atividade fisica que uma mulher pode apresentar.
	 * 
	 */
	public enum fatorAtividadeFisica {
		LEVE, MODERADA, INTENSA, APOSENTADA;
	}

	/**
	 * Recupera o IMC(Indice de Massa Corporea) da mulher.
	 * 
	 * @return O IMC da mulher.
	 */
	@Override
	public double getIMC() {
		return getAnamnese().getPesoUsual()
				/ (anamnese.getAltura() * anamnese.getAltura());
	}

	/**
	 * Recupera o peso teorico da mulher.
	 * 
	 * @return O peso teorico da mulher.
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
	 * Recupera a relacao Cintura-Quadril da mulher.
	 * 
	 * @return A relacao Cintura-Quadril da mulher.
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
	 * Recupera o VET(Valor Energetico Total) da mulher.
	 * 
	 * @return O VET da mulher.
	 */
	@Override
	public double getVET() {
		return getTMB() * getFatorAtividadeFisica();
	}

	@Override
	public atividadeFisica getAtividadeFisica() {
		return atividadeFisica;
		
		
	}
	
	public void setAtividadeFisica(atividadeFisica atividadeFisica){
		this.atividadeFisica = atividadeFisica; 
	}

	@Override
	public double getFatorAtividadeFisica() {
		if (atividadeFisica.equals(fatorAtividadeFisica.LEVE)){
			return 1.56;
		}
		else if (atividadeFisica.equals(fatorAtividadeFisica.MODERADA)){
			return 1.64;
		}
		else if (atividadeFisica.equals(fatorAtividadeFisica.INTENSA)){
			return 1.82;
		}
		else if (atividadeFisica.equals(fatorAtividadeFisica.APOSENTADA)){
			return 1.51;
		}
		return 0;
	}


	

}
