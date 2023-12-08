package pack1;

public class Lancer {

    final static String BLANC = "X";
    final static String NOIR = "O";
    final static String VIDE = "";

    public static void main(String[] args) {

        Joueurs J1 = new Joueurs(1, BLANC);
        Joueurs J2 = new Joueurs(2, NOIR);
        Joueurs def = new Joueurs();

        final int J1LENGTH = J1.grilleJoueur.length - 1;
        final String[][] J1TAB = J1.grilleJoueur;

        J1.vider_tab();
        do {
            if (J1.joue(1, BLANC)) {
                System.out.println("Joueur 1 joue");
                def.afficher_grille();
                if (def.verifie_si_gagner(1, BLANC)) {
                    System.out.println("Joueur 1 a gagné!");
                    break;
                }
            } else {
                System.out.println("Colonne pleine");
            }

            if (!def.verifie_si_plein()) {
                if (J2.joue(2, NOIR)) {
                    System.out.println("Joueur 2 joue");
                    def.afficher_grille();
                    if (def.verifie_si_gagner(2, NOIR)) {
                        System.out.println("Joueur 2 a gagné!");
                        break;
                    }
                } else {
                    System.out.println("Colonne pleine");
                }
            } else {
                System.out.println("***GAME OVER***");
                break;
            }

        } while (!def.verifie_si_plein());
    }
}
