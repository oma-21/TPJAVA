package Lescollections;
import java.util.HashSet;
import java.util.TreeSet;
public class EX3{
    public static void main(String[] args) {
        HashSet<String> matieres = new HashSet<>();
        matieres.add("Mathematiques");
        matieres.add("Physique");
        matieres.add("Chimie");
        matieres.add("Informatique");
        matieres.add("Mathematiques"); 
        System.out.println("HashSet (sans doublons): " + matieres);
        System.out.println("\nMatières dans HashSet:");
        for (String m : matieres) {
            System.out.println(m);
        }
        TreeSet<String> matieresTriees = new TreeSet<>(matieres);
        System.out.println("\nMatières triées alphabétiquement:");
        for (String m : matieresTriees) {
            System.out.println(m);
        }
    }
}
