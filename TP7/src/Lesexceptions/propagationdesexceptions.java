package Lesexceptions;
public class propagationdesexceptions {
	    public static double lireMontant(String valeur) throws NumberFormatException, IllegalArgumentException {
	        double montant = Double.parseDouble(valeur);
	        if (montant < 0) {
	            throw new IllegalArgumentException("Montant négatif interdit");
	        }
	        return montant;
	    }
	    public static void main(String[] args) {
	        try {
	            double m = lireMontant("abc");
	            System.out.println("Montant : " + m);
	        } catch (NumberFormatException e) {
	            System.out.println("Erreur de conversion");
	        } catch (IllegalArgumentException e) {
	            System.out.println("Erreur métier : " + e.getMessage());
	        }
	    }
}

