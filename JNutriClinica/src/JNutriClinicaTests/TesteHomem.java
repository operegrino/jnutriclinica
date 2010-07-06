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
	
	public static void main(String[] args) throws Exception {
		
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525");
		System.out.println(homem1.getAnamnese().getAtividadeFisica());
	}

	@Before
	public void setUp() throws Exception {
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525");
		Homem homem2 = new Homem("Joao Bastos ", 40, "12345678911",
				"Rua da Conceicao, N� 789",
				new GregorianCalendar(1985, 01, 10), "96582525");

	}

	@Test
	public void testeHomemNullAnamnese() throws Exception {
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525");
		Assert.assertEquals("Anamnese invalida", homem1.getAnamnese() , null);
	}
	
	@Test
	public void testeHomemSetAnamnese() throws Exception {
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525");
		Anamnese anamnese = new Anamnese(80.5, 1.89, false, 65.6, 70.1, "Dor no estomago",
				patologiaChave.CARDIOPATIA, false, 3, atividadeFisica.LEVE);
		homem1.setAnamnese(anamnese);
		Assert.assertEquals("Anamnese invalida", homem1.getAnamnese() , anamnese);
	}
	
	@Test
	public void testeHomemAnamnese() throws Exception {
		try{
		Homem homem1 = new Homem("Jose Amaral",37,"66666666666","Rua Beco sem saida",
				new GregorianCalendar(1985,01, 10), "91882525");
		homem1.getAnamnese();
		}catch(Exception e){
	Assert.assertEquals("Erro ao calcular o IMC",null, e.getMessage());
		}
	}

	@Test
	public void testeHomemIMC() throws Exception {
		Anamnese anamnese = new Anamnese(100.0, 2.00, false, 88.4, 70.2,
				"Dores no abdome", patologiaChave.CARDIOPATIA, true, 3, atividadeFisica.MODERADA);
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525");
		homem1.setAnamnese(anamnese);
		Assert.assertEquals("IMC Errado", 25.0, homem1.getIMC());

	}

	@Test
	public void testeHomemPesoTeorico() throws Exception {
		Anamnese anamnese = new Anamnese(100.0, 2.00, false, 88.4, 70.2,
				"Dores no abdome", patologiaChave.CARDIOPATIA, true, 3, atividadeFisica.LEVE);
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525");
		homem1.setAnamnese(anamnese);
		Assert.assertEquals("IMC Errado", 88.0, homem1.getPesoTeorico());

	}
	
	public void testeHomemCinturaQuadril()throws Exception {
		Anamnese anamnese = new Anamnese(100.0, 2.00, false, 80.0, 40.0,
				"Dores no abdome", patologiaChave.CARDIOPATIA, true, 3, atividadeFisica.APOSENTADO);
		Homem homem1 = new Homem("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "91882525");
		homem1.setAnamnese(anamnese);
		Assert.assertEquals("Erro na relacao Cintura / Quadril",2.0,homem1.getRelacaoCinturaQuadril());
	}
	
}
