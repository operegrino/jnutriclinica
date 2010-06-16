package Testes;

import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import JNutriClinica.Paciente;


public class TestPaciente {
	
	private Paciente paciente1;
	private Paciente paciente2;
	private Paciente paciente3;
	
	@Before
	public void CriaPacientes(){
		paciente1 = new Paciente("Jose Antonio da Silva", "Rua Nove de Novembro, Nº 235", "25659931625", 25, new GregorianCalendar(1985, 01, 10), "Masculino", "9188-2525", 73.5f, 1.78f, "Moderada", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
		paciente2 = new Paciente("Roberto Sousa do Nascimento", "Rua Jose Agripino, Nº 36", "15709952112", 46, new GregorianCalendar(1964, 03, 27), "Masculino", "8887-1265", 81.2f, 1.65f, "Leve", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
		paciente3 = new Paciente("Ana Julia Araujo", "Rua Nove de Novembro, Nº 198", "09858467418", 67, new GregorianCalendar(1942, 10, 12), "Feminino", "8837-1155", 68.0f, 1.70f, "Aposentado", "Exames de Rotina", new GregorianCalendar(2010, 06, 11), new GregorianCalendar(2010, 06, 28));
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNullName(){
		paciente1 = new Paciente(null, "Rua Nove de Novembro, Nº 235", "25659931625", 25, new GregorianCalendar(1985, 01, 10), "Masculino", "9188-2525", 73.5f, 1.78f, "Moderada", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithEmptyName(){
		paciente2 = new Paciente("", "Rua Jose Agripino, Nº 36", "15709952112", 46, new GregorianCalendar(1964, 03, 27), "Masculino", "8887-1265", 81.2f, 1.65f, "Leve", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNullAdress(){
		paciente3 = new Paciente("Ana Julia Araujo", null, "09858467418", 67, new GregorianCalendar(1942, 10, 12), "Feminino", "8837-1155", 68.0f, 1.70f, "Aposentado", "Exames de Rotina", new GregorianCalendar(2010, 06, 11), new GregorianCalendar(2010, 06, 28));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithEmptyAdress(){
		paciente3 = new Paciente("Ana Julia Araujo", "", "09858467418", 67, new GregorianCalendar(1942, 10, 12), "Feminino", "8837-1155", 68.0f, 1.70f, "Aposentado", "Exames de Rotina", new GregorianCalendar(2010, 06, 11), new GregorianCalendar(2010, 06, 28));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNullCpf(){
		paciente1 = new Paciente("Jose Antonio da Silva", "Rua Nove de Novembro, Nº 235", null, 25, new GregorianCalendar(1985, 01, 10), "Masculino", "9188-2525", 73.5f, 1.78f, "Moderada", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithEmptyCpf(){
		paciente2 = new Paciente("Roberto Sousa do Nascimento", "Rua Jose Agripino, Nº 36", "", 46, new GregorianCalendar(1964, 03, 27), "Masculino", "8887-1265", 81.2f, 1.65f, "Leve", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithMoreNumbersInCpf(){
		paciente2 = new Paciente("Roberto Sousa do Nascimento", "Rua Jose Agripino, Nº 36", "0956982654152", 46, new GregorianCalendar(1964, 03, 27), "Masculino", "8887-1265", 81.2f, 1.65f, "Leve", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithStrangeCharactersInCpf(){
		paciente2 = new Paciente("Roberto Sousa do Nascimento", "Rua Jose Agripino, Nº 36", "&0*9&56^982654152$", 46, new GregorianCalendar(1964, 03, 27), "Masculino", "8887-1265", 81.2f, 1.65f, "Leve", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithZeroAge(){
		paciente1 = new Paciente("Jose Antonio da Silva", "Rua Nove de Novembro, Nº 235", "25659931625", 0, new GregorianCalendar(1985, 01, 10), "Masculino", "9188-2525", 73.5f, 1.78f, "Moderada", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNegativeAge(){
		paciente1 = new Paciente("Jose Antonio da Silva", "Rua Nove de Novembro, Nº 235", "25659931625", -25, new GregorianCalendar(1985, 01, 10), "Masculino", "9188-2525", 73.5f, 1.78f, "Moderada", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNullDataOfBirth(){
		paciente2 = new Paciente("Roberto Sousa do Nascimento", "Rua Jose Agripino, Nº 36", "15709952112", 46, null, "Masculino", "8887-1265", 81.2f, 1.65f, "Leve", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNullGender(){
		paciente1 = new Paciente("Jose Antonio da Silva", "Rua Nove de Novembro, Nº 235", "25659931625", 25, new GregorianCalendar(1985, 01, 10), null, "9188-2525", 73.5f, 1.78f, "Moderada", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithEmptyGender(){
		paciente3 = new Paciente("Ana Julia Araujo", "Rua Nove de Novembro, Nº 198", "09858467418", 67, new GregorianCalendar(1942, 10, 12), "", "8837-1155", 68.0f, 1.70f, "Aposentado", "Exames de Rotina", new GregorianCalendar(2010, 06, 11), new GregorianCalendar(2010, 06, 28));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNullTelephoNumber(){
		paciente1 = new Paciente("Jose Antonio da Silva", "Rua Nove de Novembro, Nº 235", "25659931625", 25, new GregorianCalendar(1985, 01, 10), "Masculino", null, 73.5f, 1.78f, "Moderada", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithEmptyTelephoneNumber(){
		paciente2 = new Paciente("Roberto Sousa do Nascimento", "Rua Jose Agripino, Nº 36", "15709952112", 46, new GregorianCalendar(1964, 03, 27), "Masculino", "", 81.2f, 1.65f, "Leve", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithZeroWeight(){
		paciente1 = new Paciente("Jose Antonio da Silva", "Rua Nove de Novembro, Nº 235", "25659931625", 25, new GregorianCalendar(1985, 01, 10), "Masculino", "9188-2525", 0, 1.78f, "Moderada", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNegativeWeight(){
		paciente2 = new Paciente("Roberto Sousa do Nascimento", "Rua Jose Agripino, Nº 36", "15709952112", 46, new GregorianCalendar(1964, 03, 27), "Masculino", "8887-1265", -81.2f, 1.65f, "Leve", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithZeroHeight(){
		paciente1 = new Paciente("Jose Antonio da Silva", "Rua Nove de Novembro, Nº 235", "25659931625", 25, new GregorianCalendar(1985, 01, 10), "Masculino", "9188-2525", 73.5f, 0, "Moderada", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNegativeHeight(){
		paciente2 = new Paciente("Roberto Sousa do Nascimento", "Rua Jose Agripino, Nº 36", "15709952112", 46, new GregorianCalendar(1964, 03, 27), "Masculino", "8887-1265", 81.2f, -1.65f, "Leve", "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNullActivityFactor(){
		paciente2 = new Paciente("Roberto Sousa do Nascimento", "Rua Jose Agripino, Nº 36", "15709952112", 46, new GregorianCalendar(1964, 03, 27), "Masculino", "8887-1265", 81.2f, 1.65f, null, "Exames de Rotina", new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithEmptyActivityFactor(){
		paciente3 = new Paciente("Ana Julia Araujo", "Rua Nove de Novembro, Nº 198", "09858467418", 67, new GregorianCalendar(1942, 10, 12), "Feminino", "8837-1155", 68.0f, 1.70f, "", "Exames de Rotina", new GregorianCalendar(2010, 06, 11), new GregorianCalendar(2010, 06, 28));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNullReasonForConsultation(){
		paciente1 = new Paciente("Jose Antonio da Silva", "Rua Nove de Novembro, Nº 235", "25659931625", 25, new GregorianCalendar(1985, 01, 10), "Masculino", "9188-2525", 73.5f, 1.78f, "Moderada", null, new GregorianCalendar(2010, 06, 01), new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithEmptyReasonForConsultation(){
		paciente3 = new Paciente("Ana Julia Araujo", "Rua Nove de Novembro, Nº 198", "09858467418", 67, new GregorianCalendar(1942, 10, 12), "Feminino", "8837-1155", 68.0f, 1.70f, "Aposentado", "", new GregorianCalendar(2010, 06, 11), new GregorianCalendar(2010, 06, 28));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNullConsultationDate(){
		paciente2 = new Paciente("Roberto Sousa do Nascimento", "Rua Jose Agripino, Nº 36", "15709952112", 46, new GregorianCalendar(1964, 03, 27), "Masculino", "8887-1265", 81.2f, 1.65f, "Leve", "Exames de Rotina", null, new GregorianCalendar(2010, 06, 16));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPacienteWithNullReturnDate(){
		paciente3 = new Paciente("Ana Julia Araujo", "Rua Nove de Novembro, Nº 198", "09858467418", 67, new GregorianCalendar(1942, 10, 12), "Feminino", "8837-1155", 68.0f, 1.70f, "Aposentado", "Exames de Rotina", new GregorianCalendar(2010, 06, 11), null);
	}
	
	@Test
	public void testEquals(){
		Assert.assertTrue(paciente1.equals(paciente1));
		Assert.assertFalse(paciente1.equals(paciente2));
	}
	
	@Test
	public void testSetNomeAndGetNome() throws Exception{
		paciente1.setNome("Alberto Teixeira Oliveira");
		Assert.assertTrue(paciente1.getNome().equals("Alberto Teixeira Oliveira"));
	}
	
	@Test
	public void testSetEnderecoAndGetEndereco(){
		paciente2.setEndereco("Rua das Flores, Nº 56");
		Assert.assertFalse(paciente2.getEndereco().equals("Rua Jose Agripino, Nº 36"));
		Assert.assertTrue(paciente2.getEndereco().equals("Rua das Flores, Nº 56"));
	}
	
	@Test
	public void testSetCpfAndGetCpf(){
		paciente3.setCpf("06542321159");
		Assert.assertTrue(paciente3.getCpf().equals("065.423.211-59"));
	}
	
	@Test
	public void testSetIdadeAndGetIdade(){
		paciente3.setIdade(55);
		Assert.assertFalse(paciente3.getIdade() == 67);
		Assert.assertTrue(paciente3.getIdade() == 55);
	}
	
	@Test
	public void testSetDataDeNascimentoAndGetDataDeNascimento(){
		paciente2.setDataDeNascimento(new GregorianCalendar(1977, 12, 2));
		Assert.assertTrue(paciente2.getDataDeNascimento().equals(new GregorianCalendar(1977, 12, 2)));
		Assert.assertFalse(paciente3.getDataDeNascimento().equals(new GregorianCalendar(1977, 12, 2)));
	}
	
	@Test
	public void testSetGeneroAndGetGenero(){
		paciente1.setGenero("Feminino");
		Assert.assertFalse(paciente1.getGenero().equals("Masculino"));
	}
	
	@Test
	public void testSetTelefoneAndGetTelefone(){
		paciente3.setTelefone("8855-3321");
		Assert.assertFalse(paciente3.getTelefone().equals("8837-1155"));
	}
	
	@Test
	public void testSetPesoAndGetPeso(){
		paciente2.setPeso(95.5f);
		Assert.assertTrue(paciente2.getPeso() == 95.5f);
	}
	
	@Test
	public void testSetAlturaAndGetAltura(){
		paciente1.setAltura(1.90f);
		Assert.assertFalse(paciente1.getAltura() == 1.78f);
	}
	
	@Test
	public void testSetFatorAtividadeAndGetFatorAtividade(){
		paciente3.setFatorAtividade("Moderada");
		Assert.assertTrue(paciente3.getFatorAtividade().equals("Moderada"));
	}
	
	@Test
	public void testSetMotivoDaConsultaAndGetMotivoDaConsulta(){
		paciente2.setMotivoDaConsulta("Aumento de Peso");
		Assert.assertTrue(paciente2.getMotivoDaConsulta().equals("Aumento de Peso"));
	}
	
	@Test
	public void testSetDataDaConsultaAndGetDataDaConsulta(){
		paciente1.setDataDaConsulta(new GregorianCalendar(2010, 7, 25));
		Assert.assertFalse(paciente1.getDataDaConsulta().equals(new GregorianCalendar(2010, 6, 11)));
	}
	
	@Test
	public void testSetDataDeRetornoAndGetDataDeRetorno(){
		paciente3.setDataDeRetorno(new GregorianCalendar(2010, 8, 15));
		Assert.assertFalse(paciente3.getDataDaConsulta().equals(new GregorianCalendar(2010, 8, 15)));
	}
}