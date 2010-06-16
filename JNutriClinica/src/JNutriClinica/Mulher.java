package JNutriClinica;

import java.util.Calendar;

public class Mulher extends Pessoa implements Paciente {

	public Mulher(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone, Anamnese anamnese)
			throws Exception {
		super(nome, idade, cpf, endereco, dataDeNascimento, telefone, anamnese);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getFatorAtividadeFisica() {
		// TODO Auto-generated method stub
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
		if (18 <= idade && idade < 30) {
			return 14.7 * anamnese.getPesoUsual() + 496;
		}
		if (30 <= idade && idade < 60) {
			return 8.7 * anamnese.getPesoUsual() + 829;
		}
		if (idade >= 60) {
			return 10.5 * anamnese.getPesoUsual() + 596;
		}
		return 0;
	}

	@Override
	public double getVET() {
		return 0;
	}

}
