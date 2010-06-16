package JNutriClinica;

import java.util.Calendar;

/**
 * 
 * Classe Feminino extendida da classe Paciente.
 * 
 * @author Antonio Ricardo
 * 
 * @version 1.0
 *
 */

public class Feminino extends Paciente {

	public Feminino(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone) {
		super(nome, idade, cpf, endereco, dataDeNascimento, telefone);
	}

}
