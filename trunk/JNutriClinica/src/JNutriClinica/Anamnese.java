package JNutriClinica;

public class Anamnese{
	
	private float pesoUsual;
	private float pesoIdeal;
	private boolean perdeuPeso;
	private String sintomasGastrointestinais;
	private String patologiaChave;

	public Anamnese(float pesoUsual, float pesoIdeal, boolean perdeuPeso, String sintomasGastrointestinais, String patologiaChave){
		this.pesoUsual = pesoUsual;
		this.pesoIdeal = pesoIdeal;
		this.perdeuPeso = perdeuPeso;
		this.sintomasGastrointestinais = sintomasGastrointestinais;
		this.patologiaChave = patologiaChave;
	}
	
	public enum patologiaChave{
		DIABETES, CARDIOPATIA, PATOLOGIA_NO_FIGADO, PATOLOGIA_RENAL;
	}
	
	//TODO: Implementar os demais metodos desta classe

}
