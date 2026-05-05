package Lescollections;
	import java.util.Map;
	import java.util.SortedMap;
	import java.util.TreeMap;
	public class EX5 {
	    public static void main(String[] args) {
	        TreeMap<Integer, String> etudiants = new TreeMap<>();
	        etudiants.put(105, "OMA");
	        etudiants.put(102, "FATI");
	        etudiants.put(108, "OMAR");
	        etudiants.put(101, "NORA");
	        etudiants.put(110, "KAMAL");
	        System.out.println("Liste triee par numero:");
	        for (Map.Entry<Integer, String> entry : etudiants.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	        System.out.println("\nPremier etudiant: " + etudiants.firstEntry());
	        System.out.println("Dernier etudiant: " + etudiants.lastEntry());
	        SortedMap<Integer, String> superieurs = etudiants.tailMap(101);
	        System.out.println("\nEtudiants avec numero > 100:");
	        for (Map.Entry<Integer, String> entry : superieurs.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
	}
