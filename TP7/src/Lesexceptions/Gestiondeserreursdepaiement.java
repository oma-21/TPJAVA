package Lesexceptions;
public class Gestiondeserreursdepaiement {
	    public static double effectuerPaiement(double montant, double solde) {
	        if (montant <= 0) {
	            throw new IllegalArgumentException("Montant invalide : doit être > 0");
	        }
	        if (montant > solde) {
	            throw new IllegalArgumentException("Solde insuffisant");
	        }
	        return solde - montant;
	    }
	    public static void main(String[] args) {
	        try {
	            double nouveauSolde = effectuerPaiement(120, 100);
	            System.out.println("Paiement réussi. Nouveau solde : " + nouveauSolde);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Erreur métier : " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Erreur technique : " + e.getMessage());
	        } finally {
	            System.out.println("Fin de la transaction");
	        }
	    }
}
