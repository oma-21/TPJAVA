package partie1;

public class CompteBancaire {

	    // Attributs privés
	    private int numero;
	    private String titulaire;
	    private double solde;
	    private double decouvertAutorise;
	    
	    // Attributs de classe (static)
	    private static int nbComptes = 0;
	    private static double tauxInteretAnnuel = 0.03; // 3% d'intérêt annuel
	    
	    // Constructeur par défaut
	    public CompteBancaire() {
	         this.numero = ++nbComptes;
	        this.titulaire = "Inconnu";
	        this.solde = 0.0;
	        this.decouvertAutorise = 0.0;
	    }
	    
	    // Constructeur paramétré
	    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
	        this.numero = ++nbComptes;
	        setTitulaire(titulaire);
	        this.solde = solde;
	        setDecouvertAutorise(decouvertAutorise);
	    }
	    
	    // Accesseurs (getters)
	    public int getNumero() {
	        return numero;
	    }
	    
	    public String getTitulaire() {
	        return titulaire;
	    }
	    
	    public double getSolde() {
	        return solde;
	    }
	    
	    public double getDecouvertAutorise() {
	        return decouvertAutorise;
	    }
	    
	    public static int getNbComptes() {
	        return nbComptes;
	    }
	    
	    public static double getTauxInteretAnnuel() {
	        return tauxInteretAnnuel;
	    }
	    
	    // Mutateurs (setters) avec validation
	    public void setTitulaire(String titulaire) {
	        if (titulaire != null && !titulaire.trim().isEmpty()) {
	            this.titulaire = titulaire;
	        } else {
	            System.out.println("Erreur: Le nom du titulaire ne peut pas être vide.");
	            this.titulaire = "Inconnu";
	        }
	    }
	    
	    public void setDecouvertAutorise(double decouvertAutorise) {
	        if (decouvertAutorise >= 0) {
	            this.decouvertAutorise = decouvertAutorise;
	        } else {
	            System.out.println("Erreur: Le découvert autorisé ne peut pas être négatif.");
	            this.decouvertAutorise = 0;
	        }
	    }
	    
	    public static void setTauxInteretAnnuel(double taux) {
	        if (taux >= 0) {
	            tauxInteretAnnuel = taux;
	            System.out.println("Taux d'intérêt annuel modifié à " + (tauxInteretAnnuel * 100) + "%");
	        } else {
	            System.out.println("Erreur: Le taux d'intérêt ne peut pas être négatif.");
	        }
	    }
	    
	    // Méthode pour afficher les informations du compte
	    public void afficher() {
	        System.out.println("========================================");
	        System.out.println("Compte N°: " + numero);
	        System.out.println("Titulaire: " + titulaire);
	        System.out.println("Solde: " + solde + " MAD");
	        System.out.println("Découvert autorisé: " + decouvertAutorise + " MAD");
	        System.out.println("========================================");
	    }
	    
	    // Méthode pour déposer de l'argent
	    public void deposer(double montant) {
	        if (montant > 0) {
	            solde += montant;
	            System.out.println("Dépôt de " + montant + " MAD effectué. Nouveau solde: " + solde + " MAD");
	        } else {
	            System.out.println("Montant de dépôt invalide.");
	        }
	    }
	    
	    // Méthode pour retirer de l'argent
	    public void retirer(double montant) {
	        if (montant > 0) {
	            double limite = solde + decouvertAutorise;
	            if (montant <= limite) {
	                solde -= montant;
	                System.out.println("Retrait de " + montant + " MAD effectué. Nouveau solde: " + solde + " MAD");
	            } else {
	                System.out.println("Retrait refusé. Montant demandé: " + montant + 
	                                 " MAD, Limite disponible: " + limite + " MAD");
	            }
	        } else {
	            System.out.println("Retrait refusé. Montant invalide.");
	        }
	    }
	    
	    // Méthode pour effectuer un virement vers un autre compte
	    public void virementVers(CompteBancaire autre, double montant) {
	        if (montant > 0) {
	            double limite = solde + decouvertAutorise;
	            if (montant <= limite) {
	                this.retirer(montant);
	                autre.deposer(montant);
	                System.out.println("Virement de " + montant + " MAD effectué du compte N°" + 
	                                 this.numero + " vers le compte N°" + autre.numero);
	            } else {
	                System.out.println("Virement impossible : montant ou solde insuffisant.");
	            }
	        } else {
	            System.out.println("Virement impossible : montant invalide.");
	        }
	    }
	    
	    // Version 1: calculerSoldeAvecInterets() sans paramètre
	    public double calculerSoldeAvecInterets() {
	        double interets = solde * tauxInteretAnnuel;
	        double nouveauSolde = solde + interets;
	        System.out.println("Application du taux d'intérêt (" + (tauxInteretAnnuel * 100) + "%) : " + 
	                         interets + " MAD d'intérêts");
	        return nouveauSolde;
	    }
	    
	    // Version 2: calculerSoldeAvecInterets() avec paramètre bonus
	    public double calculerSoldeAvecInterets(double bonus) {
	        double tauxEffectif = tauxInteretAnnuel + bonus;
	        double interets = solde * tauxEffectif;
	        double nouveauSolde = solde + interets;
	        System.out.println("Application du taux d'intérêt (" + (tauxEffectif * 100) + "%) avec bonus : " + 
	                         interets + " MAD d'intérêts");
	        return nouveauSolde;
	    }
	    
	    // Méthode pour appliquer réellement les intérêts (modifie le solde)
	    public void appliquerInterets() {
	        double interets = solde * tauxInteretAnnuel;
	        solde += interets;
	        System.out.println("Intérêts appliqués (" + (tauxInteretAnnuel * 100) + "%): " + 
	                         interets + " MAD. Nouveau solde: " + solde + " MAD");
	    }
	}


