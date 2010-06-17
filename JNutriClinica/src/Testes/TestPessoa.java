package Testes;

import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import JNutriClinica.Anamnese;
import JNutriClinica.Pessoa;

public class TestPessoa {

	private Pessoa pessoa1;
	private Anamnese anamnese;
	private Pessoa pessoa2;
	private Pessoa pessoa3;

	@Before
	public void CriaPacientes() throws Exception {
		anamnese = new Anamnese(70.6, 65.4, false, "dor", "muita dor", true, 3);
		pessoa1 = new Pessoa("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "9188-2525", anamnese);
		pessoa2 = new Pessoa("Roberto Sousa do Nascimento", 46, "15709952112",
				"Rua Jose Agripino, Nº 36",
				new GregorianCalendar(1964, 03, 27), "8887-1265", anamnese);
		pessoa3 = new Pessoa("Ana Julia Araujo", 67, "09858467418",
				"Rua Nove de Novembro, Nº 198", new GregorianCalendar(1942,
						10, 12), "8837-1155", anamnese);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithNullName() {
		pessoa1 = new Pessoa(null, 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "9188-2525", anamnese);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithEmptyName() {
		pessoa2 = new Pessoa("", 46, "15709952112",
				"Rua Jose Agripino, Nº 36",
				new GregorianCalendar(1964, 03, 27), "8887-1265", anamnese);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithNullAdress() {
		pessoa3 = new Pessoa("Ana Julia Araujo", 67, "09858467418", null,
				new GregorianCalendar(1942, 10, 12), "8837-1155", anamnese);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithEmptyAdress() {
		pessoa3 = new Pessoa("Ana Julia Araujo", 67, "09858467418", "",
				new GregorianCalendar(1942, 10, 12), "8837-1155", anamnese);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithNullCpf() {
		pessoa1 = new Pessoa("Jose Antonio da Silva", 40, null,
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "9188-2525", anamnese);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithEmptyCpf() {
		pessoa2 = new Pessoa("Roberto Sousa do Nascimento", 46, "",
				"Rua Jose Agripino, Nº 36",
				new GregorianCalendar(1964, 03, 27), "8887-1265", anamnese);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithMoreNumbersInCpf() {
		pessoa2 = new Pessoa("Roberto Sousa do Nascimento", 46,
				"15704561329952112", "Rua Jose Agripino, Nº 36",
				new GregorianCalendar(1964, 03, 27), "8887-1265", anamnese);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithStrangeCharactersInCpf() {
		pessoa2 = new Pessoa("Roberto Sousa do Nascimento", 46, "15709ok2112",
				"Rua Jose Agripino, Nº 36",
				new GregorianCalendar(1964, 03, 27), "8887-1265", anamnese);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithZeroAge() {
		pessoa1 = new Pessoa("Jose Antonio da Silva", 0, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "9188-2525", anamnese);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithNegativeAge() {
		pessoa1 = new Pessoa("Jose Antonio da Silva", -40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), "9188-2525", anamnese);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithNullDataOfBirth() {
		pessoa1 = new Pessoa("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", null, "9188-2525", anamnese);
	}

	// @Test(expected=IllegalArgumentException.class)
	// public void testPacienteWithNullGender(){
	// pessoa1 = new Pessoa("Jose Antonio da Silva",
	// "Rua Nove de Novembro, Nº 235", "25659931625", 25, new
	// GregorianCalendar(1985, 01, 10), null, "9188-2525", 73.5f, 1.78f,
	// "Moderada", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new
	// GregorianCalendar(2010, 06, 16));
	// }

	// @Test(expected=IllegalArgumentException.class)
	// public void testPacienteWithEmptyGender(){
	// pessoa3 = new Pessoa("Ana Julia Araujo", "Rua Nove de Novembro, Nº 198",
	// "09858467418", 67, new GregorianCalendar(1942, 10, 12), "", "8837-1155",
	// 68.0f, 1.70f, "Aposentado", "Exames de Rotina", new
	// GregorianCalendar(2010, 06, 11), new GregorianCalendar(2010, 06, 28));
	// }

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithNullTelephoNumber() {
		pessoa1 = new Pessoa("Jose Antonio da Silva", 40, "12345678911",
				"Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985,
						01, 10), null, anamnese);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPacienteWithEmptyTelephoneNumber() {
		pessoa2 = new Pessoa("Roberto Sousa do Nascimento", 46, "15709952112",
				"Rua Jose Agripino, Nº 36",
				new GregorianCalendar(1964, 03, 27), "", anamnese);
	}

	//@Test(expected = IllegalArgumentException.class)
	//public void testPacienteWithNullConsultationDate() {
		//pessoa2 = new Pessoa("Roberto Sousa do Nascimento",
				//"Rua Jose Agripino, Nº 36", "15709952112", 46,
				//new GregorianCalendar(1964, 03, 27), "Masculino", "8887-1265",
			//	81.2f, 1.65f, "Leve", "Exames de Rotina", null,
		//		new GregorianCalendar(2010, 06, 16));
	//}

//	@Test(expected = IllegalArgumentException.class)
	//public void testPacienteWithNullReturnDate() {
		//pessoa3 = new Pessoa("Ana Julia Araujo",
			//	"Rua Nove de Novembro, Nº 198", "09858467418", 67,
				//new GregorianCalendar(1942, 10, 12), "Feminino", "8837-1155",
				//68.0f, 1.70f, "Aposentado", "Exames de Rotina",
				//new GregorianCalendar(2010, 06, 11), null);
	//}

	@Test
	public void testEquals() {
		Assert.assertTrue(pessoa1.equals(pessoa1));
		Assert.assertFalse(pessoa1.equals(pessoa2));
	}

	@Test
	public void testSetNomeAndGetNome() throws Exception {
		pessoa1.setNome("Alberto Teixeira Oliveira");
		Assert
				.assertTrue(pessoa1.getNome().equals(
						"Alberto Teixeira Oliveira"));
	}

	@Test
	public void testSetEnderecoAndGetEndereco() throws Exception {
		pessoa2.setEndereco("Rua das Flores, Nº 56");
		Assert.assertFalse(pessoa2.getEndereco().equals(
				"Rua Jose Agripino, Nº 36"));
		Assert.assertTrue(pessoa2.getEndereco()
				.equals("Rua das Flores, Nº 56"));
	}

	@Test
	public void testSetCpfAndGetCpf() throws Exception {
		pessoa3.setCpf("06542321159");
		Assert.assertTrue(pessoa3.getCpf().equals("065.423.211-59"));
	}

	@Test
	public void testSetIdadeAndGetIdade() throws Exception {
		pessoa3.setIdade(55);
		Assert.assertFalse(pessoa3.getIdade() == 67);
		Assert.assertTrue(pessoa3.getIdade() == 55);
	}

	@Test
	public void testSetDataDeNascimentoAndGetDataDeNascimento() {
		pessoa2.setDataDeNascimento(new GregorianCalendar(1977, 12, 2));
		Assert.assertTrue(pessoa2.getDataDeNascimento().equals(
				new GregorianCalendar(1977, 12, 2)));
		Assert.assertFalse(pessoa3.getDataDeNascimento().equals(
				new GregorianCalendar(1977, 12, 2)));
	}

//	@Test
	//public void testSetGeneroAndGetGenero() {
		//pessoa1.setGenero("Feminino");
		//Assert.assertFalse(pessoa1.getGenero().equals("Masculino"));
//	}

	@Test
	public void testSetTelefoneAndGetTelefone() throws Exception {
		pessoa3.setTelefone("8855-3321");
		Assert.assertFalse(pessoa3.getTelefone().equals("8837-1155"));
	}

	//@Test
	//public void testSetPesoAndGetPeso() {
		//pessoa2.setPeso(95.5f);
		//Assert.assertTrue(pessoa2.getPeso() == 95.5f);
	//}

//	@Test
	//public void testSetAlturaAndGetAltura() {
		//pessoa1.setAltura(1.90f);
		//Assert.assertFalse(pessoa1.getAltura() == 1.78f);
	//}
}