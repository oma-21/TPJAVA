package Parties;

public abstract class Abonnement {
	  // Attributs privés requis [2]
    private String nom;
    private double prixBase;
    private int nbProfils;

    // Constructeur paramétré avec les validations demandées [2]
    public Abonnement(String nom, double prixBase, int nbProfils) {
        this.nom = nom; 
     // Si le prix de base est <= 0, il est remplacé par une valeur par défaut (ex: 10.0) [2]
        if (prixBase <= 0) {
            this.prixBase = 10.0; 
        } else {
            this.prixBase = prixBase;}
        // Si le nombre de profils est <= 0, la valeur 1 est utilisée [2]
        if (nbProfils <= 0) {
            this.nbProfils = 1;
        } else {
            this.nbProfils = nbProfils;
        }
        
        }
    // Méthodes d'accès (getters) et de modification (setters) pour chaque attribut [3]
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public double getPrixBase() { return prixBase; }
    public void setPrixBase(double prixBase) { this.prixBase = prixBase; }

    public int getNbProfils() { return nbProfils; }
    public void setNbProfils(int nbProfils) { this.nbProfils = nbProfils; }
 
    // Retourne vrai si le nombre de profils est supérieur ou égal à trois [3]
    public boolean estPartageFamilial() {
        return this.nbProfils >= 3;
    }
 // Affiche toutes les informations, y compris le résultat de estPartageFamilial() [3]
    public void afficherInfos() {
        System.out.println("Nom de l'abonnement : " + nom);
        System.out.println("Prix de base : " + prixBase + " DH");
        System.out.println("Nombre de profils : " + nbProfils);
        System.out.println("Éligible au partage familial : " + (estPartageFamilial() ? "Oui" : "Non"));
    }
    // Déclaration des méthodes abstraites à redéfinir plus tard [3, 4]
    public abstract double calculerCoutMensuel();
    public abstract int calculerScoreSatisfaction();

}
