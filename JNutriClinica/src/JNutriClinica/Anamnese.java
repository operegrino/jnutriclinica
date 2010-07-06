package JNutriClinica;

/**
 * Classe Anamnese
 * 
 * @author Laercio Vitorino , Antonio Ricardo
 * 
 * @version 1.1
 * 
 */

public class Anamnese {
	private double pesoUsual;
	private double altura;
	private boolean perdeuPeso;
	private double cintura;
	private double quadril;
	private String sintomasGI;
	private patologiaChave patologiaChave;
	private boolean tomaMedicamentos;
	private int medicacoesPorDia;
	private atividadeFisica atividadeFisica;

	public Anamnese(double pesoUsual,double altura, boolean perdeuPeso,
			double cintura, double quadril, String sintomasGI,
			patologiaChave patologiaChave, boolean tomaMedicamentos,
			int medicacoesPorDia, atividadeFisica atividadeFisica) throws Exception {
		
			setPesoUsual(pesoUsual);
			setAltura(altura);
			setPerdeuPeso(perdeuPeso);
			setCintura(cintura);
			setQuadril(quadril);
			setSintomasGI(sintomasGI);
			setPatologiaChave(patologiaChave);
			setTomaMedicamentos(tomaMedicamentos);
			setMedicacoesPorDia(medicacoesPorDia);
			

		
	}

	/**
	 * @param pesoUsual
	 *            altera o peso usual para um novo peso.
	 */
	public void setPesoUsual(double pesoUsual)throws Exception {
		if(pesoUsual <= 0){
			throw new Exception("valor invalido.");
		}
		this.pesoUsual = pesoUsual;
	}

	/**
	 * @return o pesoUsual.
	 */
	public double getPesoUsual() {
		return pesoUsual;
	}

	/**
	 * @param perdeuPeso
	 *            altera o boolean perdeuPeso
	 */
	public void setPerdeuPeso(boolean perdeuPeso) {
		this.perdeuPeso = perdeuPeso;

	}

	/**
	 * Retorna um boolean para conferir se o Paciente perdeu peso.
	 * 
	 * @return  perdeuPeso
	 */
	public boolean isPerdeuPeso() {
		return perdeuPeso;
	}

	/**
	 * 
	 * @param sintomasGastrointestinais
	 *            Altera os sintomasGI para um novo sintomasGI
	 */
	public void setSintomasGI(String sintomasGI)throws Exception {
		if(sintomasGI == null || sintomasGI == ""){
			throw new Exception("Campo Invalido.");
		}
		this.sintomasGI = sintomasGI;
	}

	/**
	 * @return sintomasGI
	 */
	public String getSintomasGI() {
		return sintomasGI;
	}

	/**
	 * @param patologiaChave
	 *            altera a patologiaChave para uma nova patologiaChave
	 */
	public void setPatologiaChave(patologiaChave patologiaChave) {
		this.patologiaChave = patologiaChave;
	}

	/**
	 * 
	 * @return a patologiaChave
	 */
	public patologiaChave getPatologiaChave() {
		return patologiaChave;
	}

	/**
	 * @param tomaMedicamentos
	 *            altera o boolean tomaMedicamentos.
	 */
	public void setTomaMedicamentos(boolean tomaMedicamentos) {
		this.tomaMedicamentos = tomaMedicamentos;
	}

	/**
	 * @return tomaMedicamentos
	 */
	public boolean isTomaMedicamentos() {
		return tomaMedicamentos;
	}

	/**
	 * @param medicacoesPorDia
	 *            the medicacoesPorDia to set
	 */
	public void setMedicacoesPorDia(int medicacoesPorDia)throws Exception {
		if(medicacoesPorDia < 0){
			throw new Exception("valor invalido.");
		}
		this.medicacoesPorDia = medicacoesPorDia;
	}

	/**
	 * @return medicacoesPorDia
	 */
	public int getMedicacoesPorDia() {
		return medicacoesPorDia;
	}

	public enum patologiaChave {
		DIABETES, CARDIOPATIA, PATOLOGIA_NO_FIGADO, PATOLOGIA_RENAL;
	}
	
	public enum atividadeFisica {
		LEVE, MODERADA, INTENSA, APOSENTADO
	}


	/**
	 * @param cintura
	 *            Altera a medida da cintura de um Paciente.
	 */
	public void setCintura(double cintura)throws Exception{
		if(cintura <= 0){
			throw new Exception("valor invalido.");
		}
		this.cintura = cintura;
	}

	/**
	 * Retorna a medida (em centimetros) da cintura de um Paciente.
	 * 
	 * @return cintura
	 */
	public double getCintura() {
		return cintura;
	}

	/**
	 * @param quadril
	 *            Altera a medida do quadril de um Paciente para uma nova medida.
	 */
	public void setQuadril(double quadril)throws Exception {
		if(quadril <= 0){
			throw new IllegalArgumentException("valor invalido.");
		}
		this.quadril = quadril;
	}

	/**
	 * A medida do quadril (em centimetros) de um Paciente.
	 * 
	 * @return quadril
	 */
	public double getQuadril() {
		return quadril;
	}
	
	
	/**
	 * Metodo que retorna a altura do Paciente.
	 * 
	 * @return a altura do Paciente.
	 */
	
	public double getAltura() {

		return altura;
	}


	
	/**
	 * Metodo que altera a altura de um Paciente para uma nova altura.
	 * @param altura
	 * @throws Exception
	 */
	public void setAltura(double altura)throws Exception{
		if(altura <= 0){
			throw new Exception("valor invalido.");
		}
		this.altura = altura;
	}

	
	
	public void setAtividadeFisica(atividadeFisica atividadeFisica)throws Exception {
		if(atividadeFisica == null){
			throw new Exception("Campo atividade fisica estah invalido.");
		}
		this.atividadeFisica = atividadeFisica;
	}

	public atividadeFisica getAtividadeFisica() {
		return atividadeFisica;
	}
}
