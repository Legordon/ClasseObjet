import java.util.Scanner;

public class Creation {

	
	/*************/
	/* VARIABLES */
	/*************/
	
	static Scanner scan = new Scanner(System.in);
	public int iMatricule;
	public char nom[];
	public float fSalaire;
	public static String string = "";
	public static Creation personnel[] = new Creation[5];

	
	
	
	/*************/
	/*  METHODE  */
	/*************/
	
	// Méthode d'initialisation qui regroupe les méthodes pour crée un objet employé
	public static void init(Creation e) {
		salaire(e);
		nom(e);
		matricule(e);
		scan.nextLine();
	}

	
	// Méthode affectation du salaire d'un employé
	public static void salaire(Creation e) {
		e.fSalaire = 1400;
	}

	
	// Méthode affectation du nom d'un employé
	public static void nom(Creation e) {
		System.out.println("Creation d'un employé, saisir le nom :");
		string = scan.nextLine();
		e.nom = new char[string.length()];
		
		for (int i = 0; i < string.length(); i++) {
			e.nom[i] = string.charAt(i);
		}
	}

	
	// Méthode affectatin du matricule
	public static void matricule(Creation e) {
		System.out.println("entrez un matricule :");
		e.iMatricule = (int) scan.nextInt();
	}

	
	// Méthode affiche la liste des employés
	public static void afficher() {
		System.out.println();
		System.out.println("La liste des employés :");
		System.out.println("=======================");
		
		for (int i = 0; i < personnel.length; i++) {
			System.out.println(new String(personnel[i].nom) + "  salaire:"
					+ personnel[i].fSalaire + "  matricule:"
					+ personnel[i].iMatricule);
		}
		
		scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Sortir ? (o/n)");
		Employé.out = scan.nextLine().charAt(0);
	}

	
	// méthode recherche un employé par son matricule
	public static void rechercher() {
		int rchMatr = 0;
		System.out.println("Recherche d'un employé par son matricule,");
		System.out.println("Entrez un matricule :");
		rchMatr = scan.nextInt();
		
		for (int i = 0; i < personnel.length; i++) {
			if (rchMatr == personnel[i].iMatricule) {
				System.out.println(new String(personnel[i].nom) + "  salaire:"
						+ personnel[i].fSalaire + "  matricule:"
						+ personnel[i].iMatricule);
			}
		}
		
		scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Sortir ? (o/n)");
		Employé.out = scan.nextLine().charAt(0);
	}

}
