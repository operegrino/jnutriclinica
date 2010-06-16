package JNutriClinica;

import java.util.Calendar;

/**
 * Classe Homem - Um tipo de paciente.
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
		if (18 <= idade && idade < 30) {
			return 15.3 * anamnese.getPesoUsual() + 679;
		}
		if (30 <= idade && idade < 60) {
			return 11.6 * anamnese.getPesoUsual() + 879;
		}
		if (idade >= 60) {
			return 13.5 * anamnese.getPesoUsual() + 487;
		}
		return 0;
	}

	@Override
	public double getVET() {
		return 0;
	}

}
