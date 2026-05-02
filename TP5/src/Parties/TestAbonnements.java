package Parties;
import Parties.Abonnement;




public class TestAbonnements {
    public static void main(String[] args) {
        // 1. Tableau d'Abonnement
        System.out.println("=== PARTIE 1 : Affichage des abonnements ===");
        Abonnement[] abonnements = {
            new AbonnementVideo("Netflix", 49.99, 4, true, false),
            new AbonnementMusique("Spotify", 29.99, 2, 25, true),
            new AbonnementJeux("Xbox Game Pass", 39.99, 3, 60, 45)
        };

        for (Abonnement abo : abonnements) {
            System.out.println("\n--- " + abo.getNom() + " ---");
            abo.afficherInfos();
            System.out.println("Coût mensuel: " + abo.calculerCoutMensuel() + " DH");
            System.out.println("Score satisfaction: " + abo.calculerScoreSatisfaction() + "/100");
        }

        // 2. Tableau des objets Reducible
        System.out.println("\n=== PARTIE 2 : Test des réductions ===");
        Reducible[] reductibles = {
            new AbonnementVideo("Prime Video", 39.99, 2, true, true),
            new AbonnementMusique("Deezer", 19.99, 1, 10, false)
        };

        for (Reducible r : reductibles) {
            System.out.println("\n--- Test réduction ---");
            System.out.println("Coût avant réduction: " + r.appliquerReduction(0) + " DH");
            System.out.println("Après réduction 20%: " + r.appliquerReduction(20) + " DH");
            System.out.println("Après réduction 50%: " + r.appliquerReduction(50) + " DH");
        }
    }
}



