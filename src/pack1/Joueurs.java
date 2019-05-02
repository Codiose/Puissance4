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
	public static int size = grilleJoueur.length;
	
	public Joueurs(int numero,String couleur_pion) {
		this.numero = numero;
		this.couleur_pion = couleur_pion;
		
	}
	

	public Joueurs() {
		// TODO Auto-generated constructor stub
	}


	public static void vider_tab() {
		System.out.println("\t\t[+] PUISSANCE 4 BY CODIOZ\n\t\t\t[+]:--\n\t\t\t[+]:--");
		
		System.out.println("______________");
		for(int i = 0; i < size; ++i) {
			for(int j = 0; j < grilleJoueur[i].length; ++j) {
				
				grilleJoueur[i][j] = VIDE;
				System.out.print(grilleJoueur[i][j] + "|");
			}
			System.out.print(" _"+ (i+1));
			System.out.println();
		}
		System.out.println("1|2|3|4|5|6|7| -> Colonnes");
		System.out.println();
	}
	
	public static void affiche() {
		
		System.out.println("______________");
		for(int i = 0; i < grilleJoueur.length; ++i) {
			
			for(int j = 0; j < grilleJoueur[i].length; ++j) {

				System.out.print(grilleJoueur[i][j] + "|");
			}
			System.out.print(" _"+ (i+1));
			System.out.println();
		}
		
		System.out.println("1|2|3|4|5|6|7| -> Colonnes");
	}
	
	public static boolean joue(int numero, String couleur) {
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
			}while(ligne > size); 		// Redemander à l'utilisateur de taper tantque le numéro est invalide
		
			do {
				System.out.println(">> Colonne:");
				colonne = windu.nextInt();
				colonne--;
					if(colonne > size) {
						
							System.out.println("[-] Entrez une colonne correcte");
					
						}
				
			}while(colonne > size);
		
		
			verifie = verifie_si_possible(ligne, colonne);
			//verifie_si_plein();
			
				if(verifie_si_plein())
					System.out.println("[-] Game Over");
			
				if(!verifie)
					System.out.println("[-] Cette case est occupée!");
				
			
		}while(!verifie);
		
					// ######################## Checkup ###################
			
		// Placer la couleur a la place souhaiter par le joueur...
			grilleJoueur[ligne][colonne] = couleur;
			
			affiche();
			
			boolean WoN = verifie_si_gagner(numero, couleur, ligne, colonne, grilleJoueur);
			
			if(WoN) {
				System.out.println("[YES] Felicitation joueur " + numero + " avez gagnez cette partie");
				return WoN;
			}
			
			return false;
			
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
	
	
	//================Fonction Scanners==================================
	
	public static boolean Top(String playGround[][], String couleur) {
		
		int ligne, colonne;

		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < playGround[i].length; j++) {
				
				if(playGround[i][j] == couleur) {
					
					if(TopScanner(i,j,couleur,playGround)) {
						
						return true;
					}
						
				}
				
			}
		}
		
		return false;
	}
	
	public static boolean Bottom(String playGround[][], String couleur) {
		
		int ligne, colonne;
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < playGround[i].length; j++) {
				
				if(playGround[i][j] == couleur) {
					
					if(BottomScanner(i,j,couleur,playGround)) {
						
						return true;
					}
						
				}
				
			}
		}
		
		return false;
	}
	
	public static boolean Right(String playGround[][], String couleur) {
		
		int ligne, colonne;
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < playGround[i].length; j++) {
				
				if(playGround[i][j] == couleur) {
					
					if(RightScanner(i,j,couleur,playGround)) {
						
						return true;
					}
						
				}
				
			}
		}
		
		return false;
	}
	
	public static boolean Left(String playGround[][], String couleur) {
		
		int ligne, colonne;
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < playGround[i].length; j++) {
				
				if(playGround[i][j] == couleur) {
					
					if(LeftScanner(i,j,couleur,playGround)) {
						
						return true;
					}
						
				}
				
			}
		}
		
		return false;
	}
	
	public static boolean TopRight(String playGround[][], String couleur) {
		
		int ligne, colonne;
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < playGround[i].length; j++) {
				
				if(playGround[i][j] == couleur) {
					
					if(TopRightScanner(i,j,couleur,playGround)) {
						
						return true;
					}
						
				}
				
			}
		}
		
		return false;
	}
	
	public static boolean BottomLeft(String playGround[][], String couleur) {
		
		int ligne, colonne;
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < playGround[i].length; j++) {
				
				if(playGround[i][j] == couleur) {
					
					if(BottomLeftScanner(i,j,couleur,playGround)) {
						
						return true;
					}
						
				}
				
			}
		}
		
		return false;
	}
	
	//================Fonction bulldog==================================
	
	public static boolean TopScanner(int ligne, int colonne, String couleur, String Tab[][]) {
			
			boolean same = false;
			
			for(int i = 0; i < 4; i++) {
				
				if(ligne == 0) {
					
					return false;
				}	
					
				if(Tab[ligne--][colonne] == couleur) {
					
					same = true;
					
				}else {
					return false;
				}
			}
			
			return same;
		}
	
	public static boolean BottomScanner(int ligne, int colonne, String couleur, String Tab[][]) {
		
		boolean same = false;
		
		if(ligne == 6) {
			
			return false;
		}
		
		for(int i = 0; i < 4; i++) {	
			
			if(ligne == 6) {
				
				return false;
			}
				
			if(Tab[ligne++][colonne] == couleur) {
				
				same = true;
				
			}else {
				return false;
			}
		}
		
		return same;
	}
	public static boolean RightScanner(int ligne, int colonne, String couleur, String Tab[][]) {
		
		boolean same = false;
		
		for(int i = 0; i < 4; i++) {
			
			if(colonne == 7) {
				return false;
			}
			
			if(Tab[ligne][colonne++] == couleur) {
				
				same = true;
				
			}else {
				
				return false;
			}
		}
		
		return same;
		
	}
	
	public static boolean LeftScanner(int ligne, int colonne, String couleur, String Tab[][]) {
		
		boolean same = false;
		
		for(int i = 0; i < 4; i++) {
			
			if(colonne == 1) {
				return false;
			}
			
			if(Tab[ligne][colonne--] == couleur) {
				
				same = true;
				
			}else {
				
				return false;
			}
		}
		
		return same;
	}
	
	public static boolean TopRightScanner(int ligne, int colonne, String couleur, String Tab[][]) {
		
		boolean same = false;
		
		
		for(int i = 0; i < 4; i++) {
			

			if(ligne > 1 && colonne < 7) {
				
				if(Tab[ligne--][colonne++] == couleur) {
					
					same = true;
				}else {
					
					return false;
				}
			}
		}
		
		return same;
	}
	
	public static boolean BottomLeftScanner(int ligne, int colonne, String couleur, String Tab[][]) {
		
		boolean same = false;
		int cpt = 0;
		
		for(int i = 0; i < 4; i++) {
			

			if(ligne < 7 && colonne > 1) {
				
				if(Tab[ligne++][colonne--] == couleur) {
					
					same = true;
					cpt++;
				}else {
					
					return false;
				}
			}
		}
		
		if(same && cpt == 4) {
			
			return same;
		}else {
			
			return false;
		}
	}
	//================Fonction verifie_si_gagner==================================
	
		public static boolean verifie_si_gagner(int numero, String couleur, int ligne, int colonne, String grilleJoueur[][]) {
			
			int L, C, k;
			boolean Result = false;
				
			//Verify the TOP
			if(Top(grilleJoueur, couleur)) {
				
				System.out.println("Top");
				return true;
				
			}else if(Bottom(grilleJoueur, couleur)) {
				
				System.out.println("Bottom");
				return true;
				
			}else if(Right(grilleJoueur, couleur)) {
				
				System.out.println("Right");
				return true;
				
			}else if(BottomLeft(grilleJoueur, couleur)) {
				
				System.out.println("Bottom Left");
				return true;
				
			}
				
			return Result;
		}		
		

	}
	
