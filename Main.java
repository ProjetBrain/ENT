import java.util.Scanner;


public class Main {
	
	Eleve e;
	Professeur p = new Professeur();
	Matiere m = new Matiere();
	Note n = new Note();
	
	public void inter(){
		Scanner sc = new Scanner(System.in);
		System.out.println("---------- Creer nouvel eleve : 1 ----------");
		System.out.println("---------- Creer nouveau bulletin : 2 ------");
		System.out.println("---------- Ajouter une matiere : 3 ---------");
		System.out.println("---------- Quitter : 4 ---------------------");
		int str = sc.nextInt();
		
		if(str==1){
			sc.nextLine();
			System.out.println("---------- Nom de l'eleve  -----------");
			String nEleve = sc.nextLine();
			System.out.println("---------- Prenom de l'eleve  --------");
			String pEleve = sc.nextLine();
			e= new Eleve(nEleve, pEleve);
			System.out.println(e.toString());
			this.inter();
		}
		
		else if(str==2){
		sc.nextLine();

		String tabBuletin[] = new String[25];
		int compt=0;

		System.out.println("---------- Entrez le nom de l'eleve  ------------");
		String a = sc.nextLine();
		tabBuletin[compt]+=a+" ";
		
		System.out.println("---------- Entrez le prenom de l'eleve  ---------");
		String b = sc.nextLine();
		tabBuletin[compt]+=b+" ";

		System.out.println("---------- Entrez la note en Math  --------------");
		int Math = sc.nextInt();
		tabBulletin[compt]+= Math+" ";
		sc.nextLine();
		
		System.out.println("---------- Entrez la note en Français  ----------");
		int Français = sc.nextInt();
		tabBulletin[compt]+=Français+" ";
		sc.nextLine();

		System.out.println("---------- Entrez la note en Histoire  ----------");
		int Histoire = sc.nextInt();
		tabBulletin[compt]+=Histoire+" ";
		sc.nextLine();

		System.out.println("---------- Entrez la note en EPS  ---------------");
		int EPS = sc.nextInt();
		tabBulletin[compt]=EPS+" ";
		sc.nextLine();

		System.out.println("---------- Entrez la note en SVT  ---------------");
		int SVT = sc.nextInt();
		tabBulletin[compt]+=SVT+" ";
		sc.nextLine();

		System.out.println("---------- Entrez la note en Chimie  ------------");
		int Chimie = sc.nextInt();
		tabBulletin[compt]+=Chimie;
		
		System.out.println("---------- Bulletin ajouté !  -------------------");
		compt++;
		this.inter();
		}
		else if(str==3){
		sc.nextLine();
		System.out.println("---------- Saisir la nouvelle matiere  ----------");
		String matiere = sc.nextLine();
		m.setNom(matiere);
		System.out.println(m.toString());
		this.inter();
		}
		
		else if(str==4){
			System.exit(0);
		}
		else{
			System.out.println("probleme");
			this.inter();
		}
	}

}
