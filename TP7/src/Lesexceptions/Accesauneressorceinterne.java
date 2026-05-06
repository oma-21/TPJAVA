package Lesexceptions;
public class Accesauneressorceinterne {
	    public static double lireTransaction(double[] tab, int index) {
	        return tab[index];
	    }
	    public static void main(String[] args) {
	        double[] transactions = {100, 200, 300};
	        try {
	            double valeur = lireTransaction(transactions, 5);
	            System.out.println("Valeur : " + valeur);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Erreur : indice invalide");
	        } catch (NullPointerException e) {
	            System.out.println("Erreur : tableau non initialisé");
	        }
	    }
}

