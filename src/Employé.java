import java.util.Scanner;

public class Employé {

	/*************/
	/* VARIABLES */
	/*************/

	static Scanner scan = new Scanner(System.in);
	public static boolean run = true; // boucle du menu principal
	public static int choix = 0; // affiche le menu selectionné
	public static char out = 'n'; // sortir d'un élément de menu

	/*************/
	/*    MAIN   */
	/*************/

	public static void main(String[] args) {

		// déclaration des objets employés
		Creation e1 = new Creation();
		Creation e2 = new Creation();
		Creation e3 = new Creation();
		Creation e4 = new Creation();
		Creation e5 = new Creation();

		// placement des objets dans un tableau
		Creation.personnel[0] = e1;
		Creation.personnel[1] = e2;
		Creation.personnel[2] = e3;
		Creation.personnel[3] = e4;
		Creation.personnel[4] = e5;

		// boucle d'initialisation des objets
		for (int i = 0; i < Creation.personnel.length; i++) {
			Creation.init(Creation.personnel[i]);
		}

		// entrée dans la boucle du menu
		while (run == true) {

			if (choix == 0) {

				System.out.println("=========================================");
				System.out.println();
				System.out.println(" MENU :");
				System.out.println(" 1 - Afficher les employés.");
				System.out
						.println(" 2 - Rechercher un employé par son matricule.");
				System.out.println(" 3 - Sortir du programme.");
				System.out.println();
				System.out.println("=========================================");
				choix = scan.nextInt();

			} else if (choix == 1) {
				while (out == 'n') {

					// affichage des objets remplis
					Creation.afficher();
				}
				out = 'n';
				choix = 0;

			} else if (choix == 2) {
				while (out == 'n') {
					// recherche d'un employé par son matricule
					Creation.rechercher();
				}
				out = 'n';
				choix = 0;

			} else if (choix == 3) {
				System.out.println("FIN DE PROGRAMME !");
				run = false;
			}

		}
	} // Fin main

}
