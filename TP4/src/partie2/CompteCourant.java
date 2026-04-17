package partie2;

import Partie1.Compte;

public class CompteCourant extends Compte {
    private double decouvertAutorise;

    public CompteCourant(String numero, String titulaire, double solde, double decouvertAutorise) {
        super(numero, titulaire, solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        if (solde - montant >= -decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("Retrait refusé : dépassement du découvert autorisé.");
        }
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Découvert autorisé : " + decouvertAutorise);
    }
}
