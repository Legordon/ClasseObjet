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
	
	// M�thode d'initialisation qui regroupe les m�thodes pour cr�e un objet employ�
	public static void init(Creation e) {
		salaire(e);
		nom(e);
		matricule(e);
		scan.nextLine();
	}

	
	// M�thode affectation du salaire d'un employ�
	public static void salaire(Creation e) {
		e.fSalaire = 1400;
	}

	
	// M�thode affectation du nom d'un employ�
	public static void nom(Creation e) {
		System.out.println("Creation d'un employ�, saisir le nom :");
		string = scan.nextLine();
		e.nom = new char[string.length()];
		
		for (int i = 0; i < string.length(); i++) {
			e.nom[i] = string.charAt(i);
		}
	}

	
	// M�thode affectatin du matricule
	public static void matricule(Creation e) {
		System.out.println("entrez un matricule :");
		e.iMatricule = (int) scan.nextInt();
	}

	
	// M�thode affiche la liste des employ�s
	public static void afficher() {
		System.out.println();
		System.out.println("La liste des employ�s :");
		System.out.println("=======================");
		
		for (int i = 0; i < personnel.length; i++) {
			System.out.println(new String(personnel[i].nom) + "  salaire:"
					+ personnel[i].fSalaire + "  matricule:"
					+ personnel[i].iMatricule);
		}
		
		scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Sortir ? (o/n)");
		Employ�.out = scan.nextLine().charAt(0);
	}

	
	// m�thode recherche un employ� par son matricule
	public static void rechercher() {
		int rchMatr = 0;
		System.out.println("Recherche d'un employ� par son matricule,");
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
		Employ�.out = scan.nextLine().charAt(0);
	}

}
