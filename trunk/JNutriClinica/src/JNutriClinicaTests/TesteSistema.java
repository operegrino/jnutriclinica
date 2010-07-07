package JNutriClinicaTests;

/**
 * Testes para a classe Sistema do Projeto JNutriClinica
 * 
 * @author Antonio Ricardo
 * 
 * @version 1.0
 */

import java.util.GregorianCalendar;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import JNutriClinica.Anamnese;
import JNutriClinica.Sistema;
import JNutriClinica.Anamnese.atividadeFisica;
import JNutriClinica.Anamnese.patologiaChave;

public class TesteSistema {

	@Before
	public void setUp() throws Exception {
		Sistema sistema1 = new Sistema();
		Sistema sistema2 = new Sistema();
		Sistema sistema3 = new Sistema();
	}
	
	@Test
	public void testCriaPessoa()throws Exception{
		Anamnese anamnese = new Anamnese(80.5, 1.89, false, 65.6, 70.1, "Dor no estomago",
				patologiaChave.CARDIOPATIA, false, 3, atividadeFisica.LEVE);
		
		Sistema sistema1 = new Sistema();
		sistema1.criaPessoa("Pedrosa Marcos",23, "99999999999", "Rua dos Alfeneiros n57",
				new GregorianCalendar(1987,01,18), "66889944", anamnese, "masculino");
		Assert.assertEquals(false,sistema1.pessoas.isEmpty());
	}
	


}
