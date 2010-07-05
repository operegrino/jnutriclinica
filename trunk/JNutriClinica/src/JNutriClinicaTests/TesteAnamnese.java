package JNutriClinicaTests;

/**
 * Testes da classe Anamnese do Projeto JNutriClinica
 * 
 * @author Antonio Ricardo 
 *
 *@version 1.0
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import JNutriClinica.Anamnese;
import JNutriClinica.Anamnese.patologiaChave;

public class TesteAnamnese {
	
	@Before
	public void setUp() throws Exception {
		new Anamnese(80.5, false, 65.6,70.1,"Dor no estomago", patologiaChave.CARDIOPATIA, false,3);
		new Anamnese(55.4, true, 97.2,78.3,"Dor", patologiaChave.DIABETES, true,8);
		new Anamnese(49.6, false, 65.6,70.1,"Dor no estomago", patologiaChave.PATOLOGIA_RENAL, true,1);
	}
	
	@Test
	public void testAnamneseWithNullSintomasGI() throws Exception {
		try{
			new Anamnese(80.5, false, 65.6,70.1,null, 
					patologiaChave.CARDIOPATIA, false,3);
		}catch(Exception e){
			Assert.assertEquals("Mensagem errada", "Campo Invalido.", e.getMessage());
		}

	}
	@Test
	public void testAnamneseWithEmptySintomasGI() throws Exception {
		try{
			new Anamnese(80.5, false, 65.6,70.1,"", 
					patologiaChave.CARDIOPATIA, false,3);
		}catch(Exception e){
			Assert.assertEquals("Mensagem errada", "Campo Invalido.", e.getMessage());
		}

	}
	@Test
	public void testAnamneseWithNegativePesoUsual() throws Exception {
		try{
			new Anamnese(-80.5, false, 65.6,70.1,"Dor no estomago", 
					patologiaChave.CARDIOPATIA, false,3);
		}catch(Exception e){
			Assert.assertEquals("Mensagem errada", "valor invalido.", e.getMessage());
		}

	}
	
	@Test
	public void testAnamneseWithZeroPesoUsual() throws Exception {
		try{
			new Anamnese(0.0, false, 65.6,70.1,"Dor no estomago", 
					patologiaChave.CARDIOPATIA, false,3);
		}catch(Exception e){
			Assert.assertEquals("Mensagem errada", "valor invalido.", e.getMessage());
		}

	}
	
	@Test
	public void testAnamneseSetPerdeuPeso() throws Exception {
		Anamnese anamnese1 = new Anamnese(50.1, false, 65.6,70.1,"Dor no estomago", 
				patologiaChave.CARDIOPATIA, false,3);
		anamnese1.setPerdeuPeso(true);
		Assert.assertTrue("Erro", anamnese1.isPerdeuPeso() == true);

	}
	
	@Test
	public void testAnamneseWithNegativeCintura() throws Exception {
		try{
			new Anamnese(51.5, false, -65.6,70.1,"Dor no estomago", 
					patologiaChave.CARDIOPATIA, false,3);
		}catch(Exception e){
			Assert.assertEquals("Mensagem errada", "valor invalido.", e.getMessage());
		}

	}
	@Test
	public void testAnamneseWithZeroCintura() throws Exception {
		try{
			new Anamnese(74.8, false, 0.0,70.1,"Dor no estomago", 
					patologiaChave.CARDIOPATIA, false,3);
		}catch(Exception e){
			Assert.assertEquals("Mensagem errada", "valor invalido.", e.getMessage());
		}

	}
	
	@Test
	public void testAnamneseWithNegativeQuadril() throws Exception {
		try{
			new Anamnese(66.6, false, 65.6,-70.1,"Dor no estomago", 
					patologiaChave.CARDIOPATIA, false,3);
		}catch(Exception e){
			Assert.assertEquals("Mensagem errada", "valor invalido.", e.getMessage());
		}

	}
	
	@Test
	public void testAnamneseWithZeroQuadril() throws Exception {
		try{
			new Anamnese(66.6, false, 65.6,0.0,"Dor no estomago", 
					patologiaChave.CARDIOPATIA, false,3);
		}catch(Exception e){
			Assert.assertEquals("Mensagem errada", "valor invalido.", e.getMessage());
		}

	}
	
	@Test
	public void testAnamneseSetPatologiaChave() throws Exception {
			Anamnese anamnese2 = new Anamnese(66.6, false, 65.6,70.1,"Dor no estomago", 
					patologiaChave.CARDIOPATIA, false,3);
			Assert.assertTrue("Erro em Patologia Chave", 
					anamnese2.getPatologiaChave() == patologiaChave.CARDIOPATIA);
			anamnese2.setPatologiaChave(patologiaChave.PATOLOGIA_RENAL);
			Assert.assertTrue("Erro em Patologia Chave", 
					anamnese2.getPatologiaChave() == patologiaChave.PATOLOGIA_RENAL);
	}
	
	@Test
	public void testAnamneseSetTomaMedicamentos() throws Exception {
		Anamnese anamnese3 = new Anamnese(66.6, false, 65.6, 50.4,"Dor no estomago", 
					patologiaChave.CARDIOPATIA, false,3);
		Assert.assertTrue("Erro em isTomaMedicamentos", anamnese3.isTomaMedicamentos() == false);
		anamnese3.setTomaMedicamentos(true);
		Assert.assertTrue("Erro em isTomaMedicamentos", anamnese3.isTomaMedicamentos() == true);
	}
	
	@Test
	public void testAnamneseNegativeMedicacoesPorDia() throws Exception {
		try{
			new Anamnese(66.6, false, 65.6,54.2,"Dor no estomago", 
					patologiaChave.CARDIOPATIA, false,-5);
		}catch(Exception e){
			Assert.assertEquals("Mensagem errada", "valor invalido.", e.getMessage());
		}

	}
	
	
	

}
