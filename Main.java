import java.util.Scanner;


public class Main {
	
	Eleve e;
	Professeur p = new Professeur();
	Matiere m = new Matiere();
	Note n = new Note();
	
	public void inter(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Creer nouvel eleve : 1");
		System.out.println("Creer nouveau bulletin : 2");
		System.out.println("Modifier bulletin existant: 3");
		int str = sc.nextInt();
		
		if(str==1){
			sc.nextLine();
			System.out.println("Nom de l'eleve : ");
			String nEleve = sc.nextLine();
			System.out.println("Prenom de l'eleve : ");
			String pEleve = sc.nextLine();
			e= new Eleve(nEleve, pEleve);
			System.out.println(e.toString());
		}
		else
			System.out.println("probleme");
			
		
	
	}

}
