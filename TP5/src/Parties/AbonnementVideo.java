package Parties;
import Parties.Abonnement;

	public class AbonnementVideo extends Abonnement  implements Reducible{
	    private boolean optionHD;
	    private boolean option4K;

	    public AbonnementVideo(String nom, double prixBase, int nbProfils, boolean optionHD, boolean option4K) {
	        super(nom, prixBase, nbProfils);
	        this.optionHD = optionHD;
	        this.option4K = option4K;
	    }
	    @Override
	    public boolean estEligibleReduction(double pourcentage) {
	        // Selon le TP, les réductions > 30% ne sont pas acceptées
	        return pourcentage >= 0 && pourcentage <= 30;
	    }
	    @Override
	    public double appliquerReduction(double pourcentage) {
	        if (estEligibleReduction(pourcentage)) {
	            return calculerCoutMensuel() * (1 - pourcentage / 100);
	        }
	        return calculerCoutMensuel(); // Pas de remise si > 30%
	    }
	    @Override
	    public double calculerCoutMensuel() {
	        double coutTotal = getPrixBase();
	        if (optionHD) {
	            coutTotal += 10; // Supplément HD [1]
	        }
	        if (option4K) {
	            coutTotal += 20; // Supplément 4K [1]
	        }
	        return coutTotal;
	    }
	    @Override
	    public int calculerScoreSatisfaction() {
	        int score = 60; // Score initial [2]
	        if (optionHD) score += 10;
	        if (option4K) score += 20;
	        if (getNbProfils() >= 4) score += 10;
	        
	        return Math.min(score, 100); // Plafonné à 100 [2]
	    }

	}
