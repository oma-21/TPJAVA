package Parties;
import Parties.Abonnement;

public class AbonnementMusique extends Abonnement implements Reducible {
    private int nbPlaylists;
    private boolean optionOffline;

    public AbonnementMusique(String nom, double prixBase, int nbProfils, int nbPlaylists, boolean optionOffline) {
        super(nom, prixBase, nbProfils);
        this.nbPlaylists = nbPlaylists;
        this.optionOffline = optionOffline;
    }
    @Override
    public boolean estEligibleReduction(double pourcentage) {
        return pourcentage >= 0 && pourcentage <= 30; // Max 30% selon les sources
    }
    @Override
    public double appliquerReduction(double pourcentage) {
        if (estEligibleReduction(pourcentage)) {
            return calculerCoutMensuel() * (1 - pourcentage / 100);
        }
        return calculerCoutMensuel();
    }
    @Override
    public double calculerCoutMensuel() {
        double coutTotal = getPrixBase();
        if (optionOffline) {
            coutTotal += 15; // Supplément mode hors ligne [3]
        }
        return coutTotal;
    }
    
    @Override
    public int calculerScoreSatisfaction() {
        int score = 50; // Score initial [3]
        if (nbPlaylists > 20) score += 20;
        if (optionOffline) score += 20;
        if (getNbProfils() > 1) score += 10;
        
        return Math.min(score, 100); // Plafonné à 100 [4]
    }

}



