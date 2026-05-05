package Lescollections;
import java.util.HashMap;
import java.util.Map;

public class EX4 {
    public static void main(String[] args) {
        HashMap<String, Double> notes = new HashMap<>();
        notes.put("OMA", 15.5);
        notes.put("NARIN", 12.0);
        notes.put("NASIM", 18.0);
        notes.put("OMAR", 14.5);
        notes.put("FATI", 16.0);
        System.out.println("Toutes les notes:");
        for (Map.Entry<String, Double> entry : notes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        String etudiant = "FATI";
        System.out.println("\nNote de " + etudiant + ": " + notes.get(etudiant));
        notes.put("OMA", 13.5);
        System.out.println("Note modifiee de OMA: " + notes.get("OMA"));
        notes.remove("OMAR");
        System.out.println("\nApres suppression de OMAR:");
        for (Map.Entry<String, Double> entry : notes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        double somme = 0;
        for (double note : notes.values()) {
            somme += note;
        }
        double moyenne = somme / notes.size();
        System.out.printf("\nMoyenne generale de la classe: %.2f\n", moyenne);
    }
}



