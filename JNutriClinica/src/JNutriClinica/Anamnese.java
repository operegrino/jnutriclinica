package JNutriClinica;

/**
 * Classe Anamnese
 * 
 * @author Laercio Vitorino , Antonio Ricardo
 * 
 * @version 1.0
 * 
 */

public class Anamnese {

	private float pesoUsual;
	private float pesoIdeal;
	private boolean perdeuPeso;
	private String sintomasGI;
	private String patologiaChave;

	public Anamnese(float pesoUsual, float pesoIdeal, boolean perdeuPeso,
			String sintomasGI, String patologiaChave) {
		this.setPesoUsual(pesoUsual);
		this.setPesoIdeal(pesoIdeal);
		this.setPerdeuPeso(perdeuPeso);
		this.setSintomasGI(sintomasGI);
		this.setPatologiaChave(patologiaChave);
	}

	/**
	 * @param pesoUsual
	 *            the pesoUsual to set
	 */
	public void setPesoUsual(float pesoUsual) {
		this.pesoUsual = pesoUsual;
	}

	/**
	 * @return the pesoUsual
	 */
	public float getPesoUsual() {
		return pesoUsual;
	}

	/**
	 * @param pesoIdeal
	 *            the pesoIdeal to set
	 */
	public void setPesoIdeal(float pesoIdeal) {
		this.pesoIdeal = pesoIdeal;
	}

	/**
	 * @return the pesoIdeal
	 */
	public float getPesoIdeal() {
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
	 * @return  sintomasGI
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

	public enum patologiaChave {
		DIABETES, CARDIOPATIA, PATOLOGIA_NO_FIGADO, PATOLOGIA_RENAL;
	}

	// TODO: Implementar os demais metodos desta classe

}
