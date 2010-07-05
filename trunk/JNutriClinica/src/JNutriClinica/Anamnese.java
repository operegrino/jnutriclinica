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
	private double pesoIdeal;
	private double altura;
	private boolean perdeuPeso;
	private double cintura;
	private double quadril;
	private String sintomasGI;
	private String patologiaChave;
	private boolean tomaMedicamentos;
	private int medicacoesPorDia;

	public Anamnese(double pesoUsual, double pesoIdeal, boolean perdeuPeso,
			double cintura, double quadril, String sintomasGI,
			String patologiaChave, boolean tomaMedicamentos,
			int medicacoesPorDia) {
		try {
			setPesoUsual(pesoUsual);
			setPesoIdeal(pesoIdeal);
			setPerdeuPeso(perdeuPeso);
			setCintura(cintura);
			setQuadril(quadril);
			setSintomasGI(sintomasGI);
			setPatologiaChave(patologiaChave);
			setTomaMedicamentos(tomaMedicamentos);
			setMedicacoesPorDia(medicacoesPorDia);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
	 * @param pesoIdeal
	 *            altera o peso ideal para um novo peso.
	 */
	public void setPesoIdeal(double pesoIdeal)throws Exception {
		if(pesoIdeal <= 0 ){
			throw new Exception("valor invalido.");
		}
		this.pesoIdeal = pesoIdeal;
	}

	/**
	 * @return o pesoIdeal
	 */
	public double getPesoIdeal() {
		return pesoIdeal;
	}

	/**
	 * @param perdeuPeso
	 *            altera o boolean perdeuPeso
	 */
	public void setPerdeuPeso(boolean perdeuPeso) {
		if (perdeuPeso == false) {
			this.perdeuPeso = true;
		} else {
			this.perdeuPeso = false;
		}

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
	public void setSintomasGI(String sintomasGI) {
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
	public void setPatologiaChave(String patologiaChave) {
		this.patologiaChave = patologiaChave;
	}

	/**
	 * 
	 * @return a patologiaChave
	 */
	public String getPatologiaChave() {
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

	public double getAltura() {

		return altura;
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
	public void setQuadril(double quadril) {
		if(quadril <= 0){
			throw new IllegalArgumentException("Valor incorreto.");
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

}
