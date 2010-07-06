package JNutriClinicaTests;

/**
 * Testes da classe Mulher do Projeto JNutriClinica
 * 
 * @author Antonio Ricardo 
 *
 *1.0
 */

import java.util.GregorianCalendar;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import JNutriClinica.Anamnese;
import JNutriClinica.Mulher;
import JNutriClinica.Anamnese.atividadeFisica;
import JNutriClinica.Anamnese.patologiaChave;

public class TesteMulher {

	@Before
	public void setUp() throws Exception {
		Anamnese anamnese = new Anamnese(80.0,1.66, false, 88.4, 70.2,
				"Dores no abdome", patologiaChave.CARDIOPATIA, true, 3);
		Mulher mulher1 = new Mulher("Maria da Penha",37,"66666666666","Rua Beco sem saida",
				new GregorianCalendar(1985,01, 10), "91882525", anamnese, atividadeFisica.LEVE);
		
		Mulher mulher2 = new Mulher("Maria Bastos ", 40, "12345678911",
				"Rua da Conceicao, Nº 789",
				new GregorianCalendar(1985, 01, 10), "96582525", anamnese,
				atividadeFisica.INTENSA);
		
	}
	
	@Test
	public void testeMulherSetAtividadeFisica() throws Exception {
		Anamnese anamnese = new Anamnese(80.0,1.66, false, 88.4, 70.2,
				"Dores no abdome", patologiaChave.CARDIOPATIA, true, 3);
		Mulher mulher1 = new Mulher("Maria da Penha",37,"66666666666","Rua Beco sem saida",
				new GregorianCalendar(1985,01, 10), "91882525", anamnese, atividadeFisica.LEVE);
		Assert.assertTrue("Erro em Atividade Fisica.",
				mulher1.getAtividadeFisica() == atividadeFisica.LEVE);
		mulher1.setAtividadeFisica(atividadeFisica.MODERADA);
		Assert.assertTrue("Erro em Atividade Fisica.",
				mulher1.getAtividadeFisica() == atividadeFisica.MODERADA);
	}
	
	@Test
	public void testeMulherIMC() throws Exception {
		Anamnese anamnese = new Anamnese(30,1, false, 88.4, 70.2,
				"Dores no abdome", patologiaChave.CARDIOPATIA, true, 3);
		Mulher mulher1 = new Mulher("Maria da Penha",37,"66666666666","Rua Beco sem saida",
				new GregorianCalendar(1985,01, 10), "91882525", anamnese, atividadeFisica.LEVE);
		Assert.assertEquals("IMC Errado", 30.0,mulher1.getIMC());
	}
	
	
	@Test
	public void testeMulherPesoTeorico() throws Exception {
		Anamnese anamnese = new Anamnese(50, 1.00, false, 88.4, 70.2,
				"Dores no abdome", patologiaChave.CARDIOPATIA, true, 3);
		Mulher mulher2 = new Mulher("Marta Crua", 77, "11345678911",
				"Rua Nove de Abril, NÂº 2675", new GregorianCalendar(1935,
						01, 10), "91882525", anamnese, atividadeFisica.LEVE);
		Assert.assertEquals("IMC Errado", 20.8, mulher2.getPesoTeorico());

	}


}
