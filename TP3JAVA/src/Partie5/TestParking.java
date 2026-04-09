package Partie5;
import Partie1.Vehicule;
import Partie4.Camion;
import partie2.Voiture;
import partie3.Moto;
public class TestParking {
	    public static void main(String[] args) {
	      
	        
	        // Création du tableau polymorphe
	        Vehicule[] v = new Vehicule[4];
	        
	        // Initialisation du tableau
	        v[0] = new Voiture("123-A-1", "Renault", 5, 0);
	        v[1] = new Voiture("456-B-2", "Peugeot", 3, 0);
	        v[2] = new Moto("789-C-3", "Yamaha", true);
	        v[3] = new Camion("012-D-4", "Mercedes", 18.5);
	        
	        // Parcours et appel des méthodes
	        System.out.println(" TOUS LES VEHICULES ");
	        for (int i = 0; i < v.length; i++) {
	          
	            v[i].afficher();
	            v[i].stationner();
	        }
	             // Afficher uniquement les Voitures
	        System.out.println("\n UNIQUEMENT LES VOITURES ");
	        for (int i = 0; i < v.length; i++) {
	            if (v[i] instanceof Voiture) {
	                System.out.println("\n Voiture ");
	                v[i].afficher();
	                v[i].stationner();
	            }
	        }
	        
	        // Test du downcasting
	        System.out.println("\n TEST DOWNCASTING ");
	        Vehicule x = new Moto("11C22", "Yamaha", true);
	        
	        // Version qui plante (à tester)
	        // Voiture v1 = (Voiture) x; // ERREUR !
	        
	        // Version corrigée
	        if (x instanceof Voiture) {
	            System.out.println("Downcasting réussi !");
	        } else {
	            System.out.println("Downcasting impossible : ce n'est pas une Voiture");
	        }
	    }
	}

