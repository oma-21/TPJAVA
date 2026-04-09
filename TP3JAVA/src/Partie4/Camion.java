package Partie4;
import Partie1.Vehicule;

	public class Camion extends Vehicule {
	    // Attribut supplémentaire
	    private double chargeMax;
	    
	    // Constructeur paramétré
	    public Camion(String matricule, String marque, double chargeMax) {
	        super(matricule, marque);
	        this.chargeMax = chargeMax;
	    }
	    
	    // Redéfinition de stationner()
	    @Override
	    public void stationner() {
	        System.out.println("Le camion se gare dans une zone pour véhicules lourds.");
	    }
	    
	    // Redéfinition de afficher()
	    @Override
	    public void afficher() {
	        super.afficher();
	        System.out.println("Charge maximale : " + chargeMax + " tonnes");
	        System.out.println("Type : Camion");
	    }
	    
	   
	}

