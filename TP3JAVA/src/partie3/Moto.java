package partie3;
import Partie1.Vehicule; 
public class Moto extends Vehicule {
    // Attribut supplémentaire
    private boolean avecCasque;
    
    // Constructeur paramétré
    public Moto(String matricule, String marque, boolean avecCasque) {
        super(matricule, marque);
        this.avecCasque = avecCasque;
    }
    
    // Redéfinition de stationner()
    @Override
    public void stationner() {
        System.out.println("La moto se gare dans une place réservée aux deux-roues.");
    }
    
    // Redéfinition de afficher()
    @Override
    public void afficher() {
        super.afficher();
        String infoCasque = avecCasque ? "Oui" : "Non";
        System.out.println("Casque fourni : " + infoCasque);
        System.out.println("Type : Moto");
    }
    
  
   
}
	

	
	