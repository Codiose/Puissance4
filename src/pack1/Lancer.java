package pack1;

public class Lancer {

	final static String BLANC = "X";
	final static String NOIR = "O";
	final static String VIDE = "";
	
	public static void main(String[] args) {
		
		Joueurs J1 = new Joueurs(1,BLANC);
		Joueurs J2 = new Joueurs(2,NOIR);
		Joueurs def = new Joueurs();
		
		final int J1LENGTH = J1.grilleJoueur.length;
		final String[][] J1TAB = J1.grilleJoueur; 
		
		J1.vider_tab();
		do {
		J1.joue(1,BLANC);
		J2.joue(2,NOIR);
		}while(!def.verifie_si_plein());
		System.out.println("***GAME OVER***");
	}
}
