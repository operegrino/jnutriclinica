package JNutriClinicaTests;

/**
 * Testes da classe Homem do Projeto JNutriClinica
 * 
 * @author Antonio Ricardo 
 *
 *@version 1.0
 */

import java.util.GregorianCalendar;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import JNutriClinica.Anamnese;
import JNutriClinica.Homem;
import JNutriClinica.Anamnese.atividadeFisica;
import JNutriClinica.Anamnese.patologiaChave;

public class TesteHomem {

	@Before
	public void setUp() throws Exception {
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525", atividadeFisica.LEVE);
		Homem homem2 = new Homem("Joao Bastos ", 40, "12345678911",
				"Rua da Conceicao, N� 789",
				new GregorianCalendar(1985, 01, 10), "96582525",
				atividadeFisica.INTENSA);

	}

	@Test
	public void testeHomemSetAtividadeFisica() throws Exception {
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525", atividadeFisica.LEVE);
		Assert.assertTrue("Erro em getAtividadeFisica()", homem1
				.getAtividadeFisica() == atividadeFisica.LEVE);
		homem1.setAtividadeFisica(atividadeFisica.MODERADA);
		Assert.assertTrue("Erro em getAtividadeFisica()", homem1
				.getAtividadeFisica() == atividadeFisica.MODERADA);
	}
	
	@Test
	public void testeHomemAnamnese() throws Exception {
		try{
		Homem homem1 = new Homem("Jose Amaral",37,"66666666666","Rua Beco sem saida",
				new GregorianCalendar(1985,01, 10), "91882525", atividadeFisica.LEVE);
		homem1.getAnamnese();
		}catch(Exception e){
	Assert.assertEquals("Erro ao calcular o IMC",null, e.getMessage());
		}
	}

	@Test
	public void testeHomemIMC() throws Exception {
		Anamnese anamnese = new Anamnese(100.0, 2.00, false, 88.4, 70.2,
				"Dores no abdome", patologiaChave.CARDIOPATIA, true, 3);
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525", atividadeFisica.LEVE);
		homem1.setAnamnese(anamnese);
		Assert.assertEquals("IMC Errado", 25.0, homem1.getIMC());

	}

	@Test
	public void testeHomemPesoTeorico() throws Exception {
		Anamnese anamnese = new Anamnese(100.0, 2.00, false, 88.4, 70.2,
				"Dores no abdome", patologiaChave.CARDIOPATIA, true, 3);
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525", atividadeFisica.LEVE);
		homem1.setAnamnese(anamnese);
		Assert.assertEquals("IMC Errado", 88.0, homem1.getPesoTeorico());

	}
	
	public void testeHomemCinturaQuadril()throws Exception {
		Anamnese anamnese = new Anamnese(100.0, 2.00, false, 80.0, 40.0,
				"Dores no abdome", patologiaChave.CARDIOPATIA, true, 3);
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525", atividadeFisica.LEVE);
		homem1.setAnamnese(anamnese);
		Assert.assertEquals("Erro na relacao Cintura / Quadril",2.0,homem1.getRelacaoCinturaQuadril());
	}

}
