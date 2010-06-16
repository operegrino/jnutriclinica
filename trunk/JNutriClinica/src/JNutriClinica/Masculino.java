package JNutriClinica;

import java.util.Calendar;

/**
 * Classe Masculino extendida de Paciente.
 * 
 * @author Antonio Ricardo
 *
 */

public class Masculino extends Paciente {

	public Masculino(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone) {
		super(nome, idade, cpf, endereco, dataDeNascimento, telefone);
	}
	
	

}
