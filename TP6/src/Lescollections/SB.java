
package Lescollections;


import java.util.*;

public class SB {
    private ArrayList<EX6> livres;
    private HashSet<String> categories;
    private HashMap<EB, EX6> emprunts;
    
    public SB() {
        livres = new ArrayList<>();
        categories = new HashSet<>();
        emprunts = new HashMap<>();
    }
    public void ajouterLivre(EX6 livre) {
        livres.add(livre);
        System.out.println("Livre ajoute: " + livre.getTitre());
    }
    public void ajouterCategorie(String categorie) {
        categories.add(categorie);
        System.out.println("Categorie ajoutee: " + categorie);
    }
    public void emprunterLivre(EB etudiant, EX6 livre) {
        if (livres.contains(livre) && !emprunts.containsValue(livre)) {
            emprunts.put(etudiant, livre);
            livres.remove(livre);
            System.out.println(etudiant.getNom() + " a emprunte " + livre.getTitre());
        } else {
            System.out.println("Livre non disponible!");
        }
    }
    public void rendreLivre(EB etudiant) {
        EX6 livre = emprunts.remove(etudiant);
        if (livre != null) {
            livres.add(livre);
            System.out.println(etudiant.getNom() + " a rendu " + livre.getTitre());
        }
    }
    public void rechercherLivre(String titre) {
        for (EX6 livre : livres) {
            if (livre.getTitre().toLowerCase().contains(titre.toLowerCase())) {
                System.out.println("Livre trouve: " + livre);
                return;
            }
        }
        System.out.println("Livre non trouve!");
    }
    
    // Supprimer un livre par ISBN
    public void supprimerLivre(String isbn) {
        livres.removeIf(livre -> livre.getIsbn().equals(isbn));
        System.out.println("Livre avec ISBN " + isbn + " supprime!");
    }
    
    // Afficher tous les livres disponibles
    public void afficherLivresDisponibles() {
        System.out.println("\n=== Livres disponibles ===");
        if (livres.isEmpty()) {
            System.out.println("Aucun livre disponible.");
        } else {
            for (EX6 livre : livres) {
                System.out.println(livre);
            }
        }
    }
    
    // Afficher les emprunts en cours
    public void afficherEmprunts() {
        System.out.println("\n=== Emprunts en cours ===");
        if (emprunts.isEmpty()) {
            System.out.println("Aucun emprunt.");
        } else {
            for (Map.Entry<EB, EX6> entry : emprunts.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue().getTitre());
            }
        }
    }
    
    // Generer un rapport final
    public void genererRapport() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("RAPPORT FINAL DE LA BIBLIOTHEQUE");
        System.out.println("=".repeat(50));
        
        System.out.println("\n1. Categories disponibles:");
        for (String categorie : categories) {
            System.out.println("   - " + categorie);
        }
        
        System.out.println("\n2. Statistiques:");
        System.out.println("   - Total livres dans la bibliotheque: " + livres.size());
        System.out.println("   - Total emprunts en cours: " + emprunts.size());
        System.out.println("   - Total categories: " + categories.size());
        
        System.out.println("\n3. Livres disponibles:");
        for (EX6 livre : livres) {
            System.out.println("   - " + livre.getTitre() + " par " + livre.getAuteur());
        }
        
        System.out.println("\n4. Emprunts en cours:");
        for (Map.Entry<EB, EX6> entry : emprunts.entrySet()) {
            System.out.println("   - " + entry.getKey() + " a emprunte: " + entry.getValue().getTitre());
        }
        
        System.out.println("\n" + "=".repeat(50));
    }
}