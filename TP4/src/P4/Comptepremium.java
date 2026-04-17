package P4;
import Partie1.Compte; 


	public class  Comptepremium extends Compte {
	    private double plafondRetrait;

	    public Comptepremium(String numero, String titulaire, double solde, double plafondRetrait) {
	        super(numero, titulaire, solde);
	        this.plafondRetrait = plafondRetrait;
	    }

	    // Redéfinir retirer() : refuser le retrait si montant > plafond
	    @Override
	    public void retirer(double montant) {
	        if (montant > plafondRetrait) {
	            System.out.println("Retrait refusé : montant dépasse le plafond autorisé (" + plafondRetrait + " €) !");
	        } else if (montant <= solde) {
	            solde -= montant;
	            System.out.println("Retrait de " + montant + " € effectué.");
	        } else {
	            System.out.println("Retrait refusé : solde insuffisant !");
	        }
	    }
	}

