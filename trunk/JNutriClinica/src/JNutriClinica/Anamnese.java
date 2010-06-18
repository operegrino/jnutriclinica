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
		setPesoUsual(pesoUsual);
		setPesoIdeal(pesoIdeal);
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
	 *            the pesoUsual to set
	 */
	public void setPesoUsual(double pesoUsual) {
		this.pesoUsual = pesoUsual;
	}

	/**
	 * @return the pesoUsual
	 */
	public double getPesoUsual() {
		return pesoUsual;
	}

	/**
	 * @param pesoIdeal
	 *            the pesoIdeal to set
	 */
	public void setPesoIdeal(double pesoIdeal) {
		this.pesoIdeal = pesoIdeal;
	}

	/**
	 * @return the pesoIdeal
	 */
	public double getPesoIdeal() {
		return pesoIdeal;
	}

	/**
	 * @param perdeuPeso
	 *            the perdeuPeso to set
	 */
	public void setPerdeuPeso(boolean perdeuPeso) {
		if (perdeuPeso == false) {
			this.perdeuPeso = true;
		} else {
			this.perdeuPeso = false;
		}

	}

	/**
	 * @return the perdeuPeso
	 */
	public boolean isPerdeuPeso() {
		return perdeuPeso;
	}

	/**
	 * @param sintomasGastrointestinais
	 *            the sintomasGastrointestinais to set
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
	 *            the patologiaChave to set
	 */
	public void setPatologiaChave(String patologiaChave) {
		this.patologiaChave = patologiaChave;
	}

	/**
	 * @return the patologiaChave
	 */
	public String getPatologiaChave() {
		return patologiaChave;
	}

	/**
	 * @param tomaMedicamentos
	 *            the tomaMedicamentos to set
	 */
	public void setTomaMedicamentos(boolean tomaMedicamentos) {
		this.tomaMedicamentos = tomaMedicamentos;
	}

	/**
	 * @return the tomaMedicamentos
	 */
	public boolean isTomaMedicamentos() {
		return tomaMedicamentos;
	}

	/**
	 * @param medicacoesPorDia
	 *            the medicacoesPorDia to set
	 */
	public void setMedicacoesPorDia(int medicacoesPorDia) {
		this.medicacoesPorDia = medicacoesPorDia;
	}

	/**
	 * @return the medicacoesPorDia
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
	 *            the cintura to set
	 */
	public void setCintura(double cintura) {
		this.cintura = cintura;
	}

	/**
	 * @return the cintura
	 */
	public double getCintura() {
		return cintura;
	}

	/**
	 * @param quadril
	 *            the quadril to set
	 */
	public void setQuadril(double quadril) {
		if(quadril <= 0){
			throw new IllegalArgumentException("Valor incorreto.");
		}
		this.quadril = quadril;
	}

	/**
	 * @return the quadril
	 */
	public double getQuadril() {
		return quadril;
	}

}
