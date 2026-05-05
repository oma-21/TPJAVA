package Lescollections;



public class EB {
    private String nom;
    private String id;
    
    public EB(String nom, String id) {
        this.nom = nom;
        this.id = id;
    }
    
    public String getNom() { return nom; }
    public String getId() { return id; }
    
    @Override
    public String toString() {
        return nom + " (" + id + ")";
    }
}
