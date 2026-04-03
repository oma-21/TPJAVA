package partie2;

import partie1.CompteBancaire;

public class Banque {
	
	    // Attributs
	    private String nom;
	    private CompteBancaire[] comptes;
	    private int nbActuels;
	    
	    // Constructeur
	    public Banque(String nom, int capaciteMaximale) {
	        this.nom = nom;
	        this.comptes = new CompteBancaire[capaciteMaximale];
	        this.nbActuels = 0;
	        System.out.println("Banque '" + nom + "' créée avec une capacité de " + capaciteMaximale + " comptes.");
	    }
	    
	    // Ajouter un compte
	    public void ajouterCompte(CompteBancaire c) {
	        if (nbActuels < comptes.length) {
	            comptes[nbActuels] = c;
	            nbActuels++;
	            System.out.println("Compte N°" + c.getNumero() + " ajouté à la banque");
	        } else {
	            System.out.println("Impossible d'ajouter le compte. Banque pleine.");
	        }
	    }
	    
	    // Afficher tous les comptes
	    public void afficherTous() {
	        System.out.println("\n=== LISTE DES COMPTES DE LA BANQUE " + nom + " ===");
	        for (int i = 0; i < nbActuels; i++) {
	            comptes[i].afficher();
	        }
	    }
	}

