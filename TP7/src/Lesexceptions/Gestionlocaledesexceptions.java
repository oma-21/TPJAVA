package Lesexceptions;
public class Gestionlocaledesexceptions {
	    public static double lireMontant(String valeur) {
	        try {
	            double montant = Double.parseDouble(valeur);
	            if (montant < 0) {
	                throw new IllegalArgumentException("Montant négatif interdit");
	            }
	            return montant;
	        } catch (NumberFormatException e) {
	            System.out.println("Erreur : valeur non numérique");
	            return 0.0;
	        } catch (IllegalArgumentException e) {
	            System.out.println("Erreur : " + e.getMessage());
	            return 0.0;
	        }
	    }
	    public static void main(String[] args) {
	        double m = lireMontant("-50");
	        System.out.println("Montant lu : " + m);
	    }
}

