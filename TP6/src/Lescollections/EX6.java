package Lescollections;


import java.util.Objects;

public class EX6{
    private String isbn;
    private String titre;
    private String auteur;
    private int annee;
    public EX6(String isbn, String titre, String auteur, int annee) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }
    public String getIsbn() { return isbn; }
    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public int getAnnee() { return annee; }
    @Override
    public String toString() {
        return String.format("Livre{ISBN='%s', titre='%s', auteur='%s', annee=%d}", 
                            isbn, titre, auteur, annee);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EX6 EX6 = (EX6) obj;
        return Objects.equals(isbn, EX6.isbn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
