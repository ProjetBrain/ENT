public class Matiere {
	
	private String[] nom={"Math", "Français", "Histoire", "EPS", "SVT", "Chimie"};
	private float coefficient;
	
	public String[] getNom() {
		return nom;
	}
	
	public void setNom(String matiere) {
		this.nom[nom.length-1] = matiere;
	}
	
	public float getCoefficient() {
		return coefficient;
	}
	
	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}
	
	public String toString(){
		String aRetourner="";
		for(int i=0; i<this.nom.length;i++){
			aRetourner+=" "+this.nom[i];
		}
		return aRetourner;
	}
}
