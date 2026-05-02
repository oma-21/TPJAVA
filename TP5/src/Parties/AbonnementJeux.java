package Parties;
import Parties.Abonnement;
public class AbonnementJeux extends Abonnement  {
    private int nbJeuxInclus;
    private int heuresJeuParMois;

    public AbonnementJeux(String nom, double prixBase, int nbProfils, int nbJeux, int heures) {
        super(nom, prixBase, nbProfils);
        this.nbJeuxInclus = nbJeux;
        this.heuresJeuParMois = heures;
    }

    @Override
    public double calculerCoutMensuel() {
        double coutTotal = getPrixBase();
        if (nbJeuxInclus > 50) {
            coutTotal += 25; // Supplément si > 50 jeux [5]
        }
        if (heuresJeuParMois > 40) {
            coutTotal += 15; // Supplément si > 40 heures [5]
        }
        return coutTotal;
    }

    @Override
    public int calculerScoreSatisfaction() {
        int score = 40; // Score initial [5]
        if (nbJeuxInclus >= 30) score += 20;
        if (heuresJeuParMois >= 20) score += 20;
        if (getNbProfils() >= 2) score += 10;
        
        return Math.min(score, 100); // Plafonné à 100 [6]
    }
}



