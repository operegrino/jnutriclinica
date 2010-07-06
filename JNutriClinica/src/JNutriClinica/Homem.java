package JNutriClinica;

import java.util.Calendar;

import JNutriClinica.Anamnese.atividadeFisica;




/**
 * Classe Homem que herda da classe Pessoa e implementa a Interface Paciente.
 * 
 * @author Antonio Ricardo e Laercio Vitorino
 * 
 *@version 1.3
 */

public class Homem extends Pessoa implements Paciente {
	
	
	
	/**
	 * Construtor que cria um homem com os atributos abaixo.
	 * 
	 * @param nome
	 * 			O nome do homem.
	 * @param idade
	 * 			A idade do homem.
	 * @param cpf
	 * 			O cpf do homem.
	 * @param endereco
	 * 			O endereco do homem.
	 * @param dataDeNascimento
	 * 			A data de nascimento do homem.
	 * @param telefone
	 * 			O telefone do homem.
	 * @param anamnese
	 * 			A anamnese do homem.
	 * @throws Exception
	 */
	public Homem(String nome, int idade, String cpf, String endereco,
			Calendar dataDeNascimento, String telefone)
			throws Exception {
		super(nome, idade, cpf, endereco, dataDeNascimento, telefone);		
	}
	
	/**
	 * 
	 * Enum dos tipos de classificacao em relacao ao IMC de um Homem.
	 *
	 */
	
	public enum classificacaoIMC{
		MAGREZA, ADEQUADO, EXCESSO_DE_PESO, OBESIDADE
	}
	
	/**
	 * Recupera o IMC(Indice de Massa Corporea) do homem.
	 * 
	 * @return O IMC do homem.
	 */
	@Override
	public double getIMC() throws Exception{
		double imc = getAnamnese().getPesoUsual()
		/ (anamnese.getAltura() * anamnese.getAltura());
		if(imc <=0 ){
			throw new Exception("valor invalido");
		}
	
		return imc;
	}
	
	/**
	 * Recupera o peso teorico do homem.
	 * 
	 * @return O peso ideal para este Homem.
	 */
	@Override
	public double getPesoTeorico() {

		return anamnese.getAltura() * anamnese.getAltura() * 22.0;
	}
	
	// Nao ha, no momento, uma forma de implementar este metodo. Faltam dados.
	@Override
	public double getPregasCutaneas() {

		return 0;
	}
	
	/**
	 * Recupera a relacao Cintura-Quadril do homem.
	 * 
	 * @return A relacao Cintura-Quadril do homem.
	 */
	@Override
	public double getRelacaoCinturaQuadril() {

		return anamnese.getCintura() / anamnese.getQuadril();
	}
	
	/**
	 * Recupera a TMB(Taxa de Metabolismo Basal) do homem.
	 * 
	 * @return A TMB do homem.
	 */
	@Override
	public double getTMB() {
		if (isAdultoJovem()) {
			return 15.3 * anamnese.getPesoUsual() + 679;
		}
		if (isAdulto()) {
			return 11.6 * anamnese.getPesoUsual() + 879;
		}
		if (isIdoso()) {
			return 13.5 * anamnese.getPesoUsual() + 487;
		}
		return 0;
	}
	
	/**
	 * Recupera o VET(Valor Energetico Total) da mulher.
	 * 
	 * @return O VET da mulher.
	 */
	@Override
	public double getVET() {
		return getTMB() * getFatorAtividadeFisica();
	}
	

	@Override
	public double getFatorAtividadeFisica() {
		if (getAnamnese().getAtividadeFisica().equals(atividadeFisica.LEVE)){
			return 1.55;
		}
		else if (getAnamnese().getAtividadeFisica().equals(atividadeFisica.MODERADA)){
			return 1.78;
		}
		else if (getAnamnese().getAtividadeFisica().equals(atividadeFisica.INTENSA)){
			return 2.10;
		}
		else if (getAnamnese().getAtividadeFisica().equals(atividadeFisica.APOSENTADO)){
			return 1.51;
		}
		return 0;
	}

	/**
	 * @return a classificacaoIMC
	 */
	public classificacaoIMC getClassificacaoIMC() throws Exception{
		if(this.getIMC() < 20.1){
			return classificacaoIMC.MAGREZA;
		}
		if(this.getIMC() >= 20.1 && this.getIMC() <= 25.0){
			return classificacaoIMC.ADEQUADO;
		}
		if(this.getIMC() > 25.0 && this.getIMC() <= 29.0){
			return classificacaoIMC.EXCESSO_DE_PESO;
		}
		if(this.getIMC() > 29.0){
			return classificacaoIMC.OBESIDADE;
		}
		return null;
	}


}
