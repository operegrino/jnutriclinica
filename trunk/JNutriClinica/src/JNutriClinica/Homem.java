package JNutriClinica;

import java.util.Calendar;

/**
 * Classe Homem extendida de Pessoa e implementando a Interface Paciente.
 * 
 * @author Antonio Ricardo
 * 
 *@version 1.0
 */

public class Homem extends Pessoa implements Paciente {

	public Homem(String nome, int idade, String cpf, String endereco,
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

		return anamnese.getAltura() * anamnese.getAltura() * 22.0;
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

	@Override
	public double getVET() {
		return 0;
	}

}
