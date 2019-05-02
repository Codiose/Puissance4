package pack1;

public class Lancer {

	final static String BLANC = "X";
	final static String NOIR = "O";
	final static String VIDE = "";
	
	public static void main(String[] args) {
		
		Joueurs Player = new Joueurs();
		
		boolean J1, J2;
		
		Player.vider_tab();
		
		do {
			
			J1 = Player.joue(1,BLANC);
			//J2 =  Player.joue(2,NOIR);
			
		}while(!J1/* || !J2*/);
		
		System.out.println(">> *** Merci ***");
	}
}
