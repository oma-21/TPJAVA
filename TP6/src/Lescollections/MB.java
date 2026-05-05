package Lescollections;
public class MB {
    public static void main(String[] args) {
        SB biblio = new SB();
        biblio.ajouterCategorie("Roman");
        biblio.ajouterCategorie("Science");
        biblio.ajouterCategorie("Histoire");
        biblio.ajouterLivre(new EX6("978-0", "1984", "George Orwell", 1949));
        biblio.ajouterLivre(new EX6("978-1", "Le Petit Prince", "Antoine de Saint-Exupery", 1943));
        biblio.ajouterLivre(new EX6("978-2", "Candide", "Voltaire", 1759));
        biblio.afficherLivresDisponibles();
        biblio.rechercherLivre("1984");
        EB etudiant1 = new EB("Alice", "E001");
        EB etudiant2 = new EB("Bob", "E002");
        EX6 livre1 = new EX6("978-0", "1984", "George Orwell", 1949);
        EX6 livre2 = new EX6("978-1", "Le Petit Prince", "Antoine de Saint-Exupery", 1943);
        biblio.emprunterLivre(etudiant1, livre1);
        biblio.emprunterLivre(etudiant2, livre2);
        biblio.afficherLivresDisponibles();
        biblio.afficherEmprunts();
        biblio.rendreLivre(etudiant1);
        biblio.supprimerLivre("978-2");
        biblio.genererRapport();
    }
}
