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
	public void CriaPessoas() throws Exception {
		anamnese = new Anamnese(70.6, 65.4, false, 0, 0, "dor", "muita dor", true, 3);
		pessoa1 = new Pessoa("Jose Antonio da Silva", 40, "12345678911", "Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985, 01, 10), "91882525", anamnese);
		pessoa2 = new Pessoa("Roberto Sousa do Nascimento", 46, "15709952112", "Rua Jose Agripino, Nº 36", new GregorianCalendar(1964, 03, 27), "88871265", anamnese);
		pessoa3 = new Pessoa("Ana Julia Araujo", 67, "09858467418", "Rua Nove de Novembro, Nº 198", new GregorianCalendar(1942, 0, 12), "88371155", anamnese);
	}

	@Test
	public void testPessoaWithNullName() throws Exception {
		try{
			new Pessoa(null, 40, "12345678911", "Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985, 01, 10), "91882525", anamnese);
			Assert.fail("Esperava uma excecao de nome nulo.");
		}catch(Exception NullName ){
			Assert.assertEquals("Mensagem errada", "Nome invalido.", NullName.getMessage());
		}

	}

	@Test
	public void testPessoaWithEmptyName() throws Exception {
		try{
			new Pessoa("", 46, "15709952112", "Rua Jose Agripino, Nº 36", new GregorianCalendar(1964, 03, 27), "88871265", anamnese);
			Assert.fail("Esperava uma excecao de nome vazio.");
		}catch(Exception EmptyName){
			Assert.assertEquals("Mensagem errada", "Nome invalido.", EmptyName.getMessage());
		}
	}
	
	@Test
	public void testPessoaWithNegativeAge() throws Exception{
		try{
			new Pessoa("Ana Maria da Silva", -46, "15709952112", "Rua Jose Agripino, Nº 36", new GregorianCalendar(1964, 03, 27), "88871265", anamnese);
			Assert.fail("Esperava uma excecao de idade negativa.");
		}catch(Exception NegativeAge){
			Assert.assertEquals("Mensagem errada", "Idade invalida.", NegativeAge.getMessage());
		}
	}
	
	@Test
	public void testPessoaWithNullCPF()throws Exception{
		try{
			new Pessoa("Ana Maria da Silva", 46, null, "Rua Jose Agripino, Nº 36", new GregorianCalendar(1964, 03, 27), "88871265", anamnese);
			Assert.fail("Esperava uma excecao de cpf nulo.");
		}catch(Exception NullCpf){
			Assert.assertEquals("Mensagem errada", "CPF invalido.", NullCpf.getMessage());
		}
	}
	
	@Test
	public void testPessoaWithEmptyCPF()throws Exception{
		try{
			new Pessoa("Ana Maria da Silva", 46, "", "Rua Jose Agripino, Nº 36", new GregorianCalendar(1964, 03, 27), "88871265", anamnese);
			Assert.fail("Esperava uma excecao de cpf vazio.");
		}catch(Exception EmptyCpf){
			Assert.assertEquals("Mensagem errada", "CPF invalido.", EmptyCpf.getMessage());
		}
	}
	
	@Test
	public void testPessoaWithMoreNumbersInCpf() throws Exception {
		try{
			new Pessoa("Roberto Sousa do Nascimento", 46, "15704561329952112", "Rua Jose Agripino, Nº 36", new GregorianCalendar(1964, 03, 27), "88871265", anamnese);
			Assert.fail("Esperava uma excecao de excesso de numeros no cpf.");
		}catch(Exception MoreNumbersInCpf){
			Assert.assertEquals("Mensagem errada", "CPF invalido.", MoreNumbersInCpf.getMessage());
		}
	}

	@Test
	public void testPessoaWithStrangeCharactersInCpf() throws Exception {
		try{
			new Pessoa("Roberto Sousa do Nascimento", 46, "15709ok2112", "Rua Jose Agripino, Nº 36", new GregorianCalendar(1964, 03, 27), "88871265", anamnese);
			Assert.fail("Esperava uma excecao de caracteres estranhos no cpf.");
		}catch(Exception StrangeCharacter){
			Assert.assertEquals("Mensagem errada", "CPF invalido.", StrangeCharacter.getMessage());
		}
	}

	@Test
	public void testPessoaWithNullAdress() throws Exception {
		try{
			new Pessoa("Ana Julia Araujo", 67, "09858467418", null, new GregorianCalendar(1942, 10, 12), "88371155", anamnese);
			Assert.fail("Esperava uma excecao de endereco nulo.");
		}catch(Exception NullAdress){
			Assert.assertEquals("Mensagem errada", "Endereco invalido.", NullAdress.getMessage());
		}
	}

	@Test
	public void testPessoaWithEmptyAdress() throws Exception {
		try{
			new Pessoa("Ana Julia Araujo", 67, "09858467418", "", new GregorianCalendar(1942, 10, 12), "88371155", anamnese);
			Assert.fail("Esperava uma excecao de endereco vazio.");
		}catch(Exception EmptyAdress){
			Assert.assertEquals("Mensagem errada", "Endereco invalido.", EmptyAdress.getMessage());
		}
	}

	@Test
	public void testPessoaWithNullTelephoneNumber() throws Exception {
		try{
			new Pessoa("Jose Antonio da Silva", 40, "12345678911", "Rua Nove de Novembro, Nº 235", new GregorianCalendar(1985, 01, 10), null, anamnese);
			Assert.fail("Esperava uma excecao de numero de telefone nulo.");
		}catch(Exception NullTelephoneNumber){
			Assert.assertEquals("Mensagem errada", "Numero de telefone invalido.", NullTelephoneNumber.getMessage());
		}
	}

	@Test
	public void testPessoaWithEmptyTelephoneNumber() throws Exception {
		try{
			new Pessoa("Roberto Sousa do Nascimento", 46, "15709952112", "Rua Jose Agripino, Nº 36", new GregorianCalendar(1964, 03, 27), "", anamnese);
			Assert.fail("Esperava uma excecao de numero de telefone vazio.");
		}catch(Exception EmptyTelephoneNumber){
			Assert.assertEquals("Mensagem errada", "Numero de telefone invalido.", EmptyTelephoneNumber.getMessage());
		}
	}

	@Test
	public void testEquals() {
		Assert.assertTrue(pessoa1.equals(pessoa1));
		Assert.assertFalse(pessoa1.equals(pessoa2));
	}

	@Test
	public void testSetNomeAndGetNome() throws Exception {
		pessoa1.setNome("Alberto Teixeira Oliveira");
		Assert.assertTrue(pessoa1.getNome().equals("Alberto Teixeira Oliveira"));
		Assert.assertNotNull(pessoa1.getNome());
		Assert.assertFalse(pessoa1.getNome().equals(""));
		Assert.assertTrue(pessoa1.getNome().equals("Alberto Teixeira Oliveira"));
	}

	@Test
	public void testSetEnderecoAndGetEndereco() throws Exception {
		pessoa2.setEndereco("Rua das Flores, Nº 56");
		Assert.assertFalse(pessoa2.getEndereco().equals("Rua Jose Agripino, Nº 36"));
		Assert.assertTrue(pessoa2.getEndereco().equals("Rua das Flores, Nº 56"));
		Assert.assertNotNull(pessoa1.getEndereco());
		Assert.assertNotSame(pessoa2.getEndereco(), pessoa3.getEndereco());
	}

	@Test
	public void testSetCpfAndGetCpf() throws Exception{
		pessoa3.setCpf("06542321159");
		Assert.assertTrue(pessoa3.getCpf().equals("065.423.211-59"));
		Assert.assertNotNull(pessoa3.getCpf());
	}

	@Test
	public void testSetIdadeAndGetIdade() throws Exception {
		pessoa3.setIdade(55);
		Assert.assertFalse(pessoa3.getIdade() == 67);
		Assert.assertTrue(pessoa3.getIdade() == 55);
		Assert.assertTrue(pessoa3.getIdade() > 0);
	}

	@Test
	public void testSetDataDeNascimentoAndGetDataDeNascimento() throws Exception {
		pessoa2.setDataDeNascimento(new GregorianCalendar(1977, 12, 2));
		Assert.assertTrue(pessoa2.getDataDeNascimento().equals(new GregorianCalendar(1977, 12, 2)));
		Assert.assertFalse(pessoa3.getDataDeNascimento().equals(new GregorianCalendar(1977, 12, 2)));
		Assert.assertFalse(pessoa3.getDataDeNascimento().equals(null));
	}

	@Test
	public void testSetTelefoneAndGetTelefone() throws Exception {
		pessoa3.setTelefone("88553321");
		Assert.assertFalse(pessoa3.getTelefone().equals("8837-1155"));
		Assert.assertTrue(pessoa3.getTelefone().equals("8855-3321"));
		Assert.assertNotNull(pessoa3.getTelefone());
		pessoa2.setTelefone("88553321");
		Assert.assertNotSame(pessoa3.getTelefone(), pessoa2.getTelefone());
	}
}