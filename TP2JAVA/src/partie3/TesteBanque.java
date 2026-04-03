package partie3;

import partie1.CompteBancaire;
import partie2.Banque;

public class TesteBanque {
	
	    public static void main(String[] args) {
	        System.out.println("=== TEST DE LA GESTION BANCAIRE ===\n");
	        
	        // 1. Création de la banque 'MarocBank' avec capacité 1500
	        System.out.println("1. CRÉATION DE LA BANQUE");
	 
	        Banque marocBank = new Banque("MarocBank", 1500);
	        
	        // 2. Création de trois comptes
	        System.out.println("\n2. CRÉATION DES COMPTES");
	       
	        CompteBancaire c1 = new CompteBancaire("Ahmed Benali", 5000, 1000);
	        CompteBancaire c2 = new CompteBancaire("Fatima Zahra", 3000, 500);
	        CompteBancaire c3 = new CompteBancaire("Karim Mansouri", 10000, 2000);
	        
	        // Affichage des comptes créés
	        c1.afficher();
	        c2.afficher();
	        c3.afficher();
	        
	        // 3. Ajout des comptes à la banque
	        System.out.println("\n3. AJOUT DES COMPTES À LA BANQUE");
	      
	        marocBank.ajouterCompte(c1);
	        marocBank.ajouterCompte(c2);
	        marocBank.ajouterCompte(c3);
	        
	        // 4. Opérations sur les comptes
	        System.out.println("\n4. OPÉRATIONS SUR LES COMPTES");
	      
	        
	        System.out.println("\n--- Dépôt sur c1 ---");
	        c1.deposer(2000);
	        
	        System.out.println("\n--- Retrait sur c1 ---");
	        c1.retirer(1500);
	        
	        System.out.println("\n--- Virement de c2 vers c3 ---");
	        c2.virementVers(c3, 1000);
	        
	        System.out.println("\n--- Test virement impossible ---");
	        c2.virementVers(c3, 5000);
	        
	        // 5. Afficher tous les comptes
	        System.out.println("\n5. AFFICHAGE DE TOUS LES COMPTES");
	  
	        marocBank.afficherTous();
	        
	        // 6. Calcul des intérêts
	        System.out.println("\n6. CALCUL DES INTÉRÊTS SUR C2");
	    
	        System.out.println("Solde actuel de c2: " + c2.getSolde() + " MAD");
	        System.out.println("Taux d'intérêt: " + (CompteBancaire.getTauxInteretAnnuel() * 100) + "%");
	        
	        double nouveauSolde = c2.calculerSoldeAvecInterets();
	        System.out.println("Avec intérêts (sans bonus): " + nouveauSolde + " MAD");
	        
	        double nouveauSoldeBonus = c2.calculerSoldeAvecInterets(0.015);
	        System.out.println("Avec intérêts (bonus 1.5%): " + nouveauSoldeBonus + " MAD");
	        
	        // 7. Statistiques
	        System.out.println("\n7. STATISTIQUES GLOBALES");
	      
	        System.out.println("Nombre total de comptes créés: " + CompteBancaire.getNbComptes());
	        System.out.println("Taux d'intérêt annuel: " + (CompteBancaire.getTauxInteretAnnuel() * 100) + "%");
	        
	        System.out.println("\n=== FIN DU TEST ===");
	    }
	}
