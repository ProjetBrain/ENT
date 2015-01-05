
public class Eleve extends Personne {
	String[] eleve=new String[20];
	int compteur=0;
	public Eleve(String nom, String prenom){
		this.eleve[compteur]=nom+" "+prenom;
		this.compteur++;
		
	}
	public String toString(){
		return(" L'eleve "+this.eleve[0]+" a été ajouté");
	}
}
