package Lescollections;
import java.util.ArrayList;
import java.util.Comparator;

public class EX1 {
    public static void main(String[] args) {
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        
        // 1. Ajouter 5 etudiants
        etudiants.add(new Etudiant(1, "Alice", 15.5));
        etudiants.add(new Etudiant(2, "Bob", 12.0));
        etudiants.add(new Etudiant(3, "Charlie", 18.0));
        etudiants.add(new Etudiant(4, "Diana", 14.5));
        etudiants.add(new Etudiant(5, "Eve", 16.0));
        
        // 2. Afficher tous les etudiants
        System.out.println("Tous les etudiants:");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
        
        // 3. Rechercher un etudiant par son nom
        String rechercheNom = "Charlie";
        for (Etudiant e : etudiants) {
            if (e.getNom().equals(rechercheNom)) {
                System.out.println("\nEtudiant trouve: " + e);
                break;
            }
        }
        
        // 4. Supprimer un etudiant par son id
        int idToDelete = 2;
        etudiants.removeIf(e -> e.getId() == idToDelete);
        System.out.println("\nApres suppression de l'id " + idToDelete + ":");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
        
        // 5. Trier les etudiants par moyenne croissante
        etudiants.sort(Comparator.comparingDouble(Etudiant::getMoyenne));
        System.out.println("\nEtudiants tries par moyenne croissante:");
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
        
        // 6. Afficher l'etudiant ayant la meilleure moyenne
        Etudiant meilleur = etudiants.stream()
            .max(Comparator.comparingDouble(Etudiant::getMoyenne))
            .orElse(null);
        System.out.println("\nMeilleur etudiant: " + meilleur);
    }
}