package Parties;

public interface Reducible {
    // Retourne le coût mensuel après application de la réduction
    double appliquerReduction(double pourcentage);

    // Retourne vrai si la réduction demandée est <= 30%
    boolean estEligibleReduction(double pourcentage);
}

