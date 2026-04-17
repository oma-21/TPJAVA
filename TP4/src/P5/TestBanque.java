package P5;
import Partie1.Compte;
import partie2.CompteCourant;
import partie3.CompteEpargne;
import P4.Comptepremium;



	public class TestBanque {
	    public static void main(String[] args) {
	        // Création d'un tableau polymorphe de Compte[]
	        Compte[] comptes = new Compte[4];

	        // Initialisation avec différents types de comptes
	        comptes[0] = new CompteCourant("CC001", "Alice", 1000, 500);
	        comptes[1] = new CompteEpargne("CE002", "Bob", 2000, 3.5);
	        comptes[2] = new Comptepremium("CP003", "Charlie", 5000, 1000);
	        comptes[3] = new CompteCourant("CC004", "Diana", 300, 200);

	        // Parcours et appel des méthodes
	    
	        for (Compte c : comptes) {
	            System.out.println("\n--- Opérations sur le compte ---");
	            c.afficher();
	            c.deposer(200);
	            c.retirer(700);
	            c.afficher();
	         
	        }
	    }
	}

