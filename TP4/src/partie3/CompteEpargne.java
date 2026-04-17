package partie3;
import Partie1.Compte;

	public class CompteEpargne extends Compte {
	    private double tauxInteret;

	    public CompteEpargne(String numero, String titulaire, double solde, double tauxInteret) {
	        super(numero, titulaire, solde);
	        this.tauxInteret = tauxInteret;
	    }

	    public void calculerInteret() {
	        double interets = solde * tauxInteret / 100;
	        solde += interets;
	        System.out.println("Intérêts ajoutés : " + interets);
	    }

	    @Override
	    public void retirer(double montant) {
	        if (montant <= solde) {
	            solde -= montant;
	        } else {
	            System.out.println("Retrait interdit : solde insuffisant pour un compte épargne.");
	        }
	    }
	}

