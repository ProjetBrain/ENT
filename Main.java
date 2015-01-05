import java.util.Scanner;


public class Main {
	
	Eleve e;
	Professeur p = new Professeur();
	Matiere m = new Matiere();
	Note n = new Note();
	
	public void inter(){
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Creer nouvel eleve : 1 ----------");
		System.out.println("----------Creer nouveau bulletin : 2 ------");
		System.out.println("----------Ajouter une matiere: 3 ----------");
		int str = sc.nextInt();
		
		if(str==1){
			sc.nextLine();
			System.out.println("----------Nom de l'eleve : ----------");
			String nEleve = sc.nextLine();
			System.out.println("----------Prenom de l'eleve : -------");
			String pEleve = sc.nextLine();
			e= new Eleve(nEleve, pEleve);
			System.out.println(e.toString());
		}
		
		else if(str==2){
		sc.nextLine();

		String tabBuletin[] = new String[25];
		int compt=0;

		System.out.println("----------Entrez le nom de l'eleve : -----------");
		String a = sc.nextLine();
		tabBuletin[compt]+=a+" ";
		
		System.out.println("----------Entrez le prenom de l'eleve : --------");
		String b = sc.nextLine();
		tabBuletin[compt]+=b+" ";

		System.out.println("----------Entrez la note en Math : -------------");
		String Math = sc.nextLine();
		tabBuletin[compt]+=Math+" ";

		System.out.println("----------Entrez la note en Français : ---------");
		String Français = sc.nextLine();
		tabBuletin[compt]+=Français+" ";

		System.out.println("----------Entrez la note en Histoire : ---------");
		String Histoire = sc.nextLine();
		tabBuletin[compt]+=Histoire+" ";

		System.out.println("----------Entrez la note en EPS : --------------");
		String EPS = sc.nextLine();
		tabBuletin[compt]=EPS+" ";

		System.out.println("----------Entrez la note en SVT : --------------");
		String SVT = sc.nextLine();
		tabBuletin[compt]+=SVT+" ";

		System.out.println("----------Entrez la note en Chimie : -----------");
		String Chimie = sc.nextLine();
		tabBuletin[compt]+=Chimie;
		System.out.println("----------Bulletin ajouté ! : ------------------");
		compt++;
		}
		else if(str==3){
		sc.nextLine();
		System.out.println("----------Saisir la nouvelle matiere : ---------");
		String matiere = sc.nextLine();
		m.setNom(matiere);
		System.out.println(m.toString());
		}
		else
			System.out.println("probleme");
			
		
	
	}

}
