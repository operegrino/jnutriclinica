package JNutriClinica;

import java.util.Calendar;

/**
 * Classe Mulher extendida de Pessoa e implementando a Interface Paciente.
 * 
 * @author Antonio Ricardo
 * 
 * @version 1.1
 *
 */

public class Mulher extends Pessoa implements Paciente {

	public Mulher(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone, Anamnese anamnese)
			throws Exception {
		super(nome, idade, cpf, endereco, dataDeNascimento, telefone, anamnese);
		
	}

	@Override
	public double getFatorAtividadeFisica() {
		return 0;
	}

	@Override
	public double getIMC() {
		return getAnamnese().getPesoUsual()
				/ (anamnese.getAltura() * anamnese.getAltura());
	}

	@Override
	public double getPesoTeorico() {
		return anamnese.getAltura() * anamnese.getAltura() * 20.8;
	}

	@Override
	public double getPregasCutaneas() {

		return 0;
	}

	@Override
	public double getRelacaoCinturaQuadril() {

		return 0;
	}

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

	@Override
	public double getVET() {
		return 0;
	}

}
