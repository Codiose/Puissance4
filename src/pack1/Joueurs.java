package pack1;

import java.util.Scanner;

public class Joueurs {
	final static String VIDE = " ";
	final static String BLANC = "X";
	final static String NOIR = "O";
	
	
	@SuppressWarnings("unused")
	private int numero;
	@SuppressWarnings("unused")
	private String couleur_pion;
	public static String[][] grilleJoueur = new String[7][7];
	static Scanner windu = new Scanner(System.in);
	public static int size = grilleJoueur.length - 1;
	
	public Joueurs(int numero,String couleur_pion) {
		this.numero = numero;
		this.couleur_pion = couleur_pion;
		
	}
	

	public Joueurs() {
		// TODO Auto-generated constructor stub
	}


	public static void vider_tab() {
		System.out.println("\t\t[+] PUISSANCE 4 PAR CODIOZ\n\t\t\t[+]:--\n\t\t\t[+]:--");
		for(int i = 0; i < size; ++i) {
			for(int j = 0; j < grilleJoueur[i].length; ++j) {
				
				grilleJoueur[i][j] = VIDE;
				System.out.print(grilleJoueur[i][j] + "|");
			}
			System.out.print(" _"+ (i+1));
			System.out.println();
		}
		System.out.println("1|2|3|4|5|6|7| -> Colonnes");
	}
	
	public static void affiche() {
		for(int i = 0; i < grilleJoueur.length - 1; ++i) {
			
			for(int j = 0; j < grilleJoueur[i].length; ++j) {

				System.out.print(grilleJoueur[i][j] + "|");
			}
			System.out.print(" _"+ (i+1));
			System.out.println();
		}
		System.out.println("1|2|3|4|5|6|7| -> Colonnes");
	}
	
	public static void joue(int numero, String couleur) {
		int ligne;
		int colonne;
		boolean verifie;
		//System.out.println(size);
		do {
			System.out.println("[+] Veuillez placer votre pion:");
			do {
				System.out.println(">> Ligne:");
				ligne = windu.nextInt();
				ligne--; 							// Pour ne pas depasser le tableau
					if(ligne > size) {
						
							System.out.println("[-] Entrez une ligne correcte");
						
						}
			}while(ligne > size); 		// Redemander � l'utilisateur de taper tantque le num�ro est invalide
		
			do {
				System.out.println(">> Colonne:");
				colonne = windu.nextInt();
				colonne--;
					if(colonne > size) {
						
							System.out.println("[-] Entrez une colonne correcte");
					
						}
				
			}while(colonne > size);
		
		
			verifie = verifie_si_possible(ligne, colonne);
			verifie_si_plein();
			
				if(verifie_si_plein())
					System.out.println("[-] Game Over");
			
				if(!verifie)
					System.out.println("[-] Cette case est occup�e!");
			
		}while(!verifie);
			grilleJoueur[ligne][colonne] = couleur;
		

			
		affiche();

	}
	
	//================Fonction verifie_si_possible: ============================
	
	public static boolean verifie_si_possible(int ligne, int colonne) {
		if(grilleJoueur[ligne][colonne] == VIDE) //si l'emplacement est vide placer le coupe(true)
			return true;
		else
			return false;
	}
	//================Fonction verifie_si_plein: ==============================
	
	public static boolean verifie_si_plein() { // on parcourt le tableau
		for(int i = 0; i < size; ++i) {  
			for(int j = 0; j < grilleJoueur[i].length; ++j) {
				if(grilleJoueur[i][j] == VIDE) { //si le tableau n'est pas plein return false
					return false;
				}
			}
		}
		return true;
	}
	
	
	//================Fonction verifie_si_gagner==================================
	
	public static void wonOrNot(int numero, String couleur, int ligne, int colonne) {
		
		
	}
	
}
