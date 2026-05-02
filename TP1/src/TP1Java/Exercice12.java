package TP1Java;
import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez une chaîne de caractères : ");
        String s = sc.nextLine();
        int compteur = 0;
        
        String voyelles = "aeiouyAEIOUY";

       
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
          
            if (voyelles.indexOf(c) != -1) {
                compteur++;
            }
        }

        System.out.println("Le nombre de voyelles dans la chaîne est : " + compteur);
        sc.close();
    }
}
