package TP1Java;

import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne à inverser : ");
        String s = sc.nextLine();
        
        String inverse = "";
        
      
        for (int i = s.length() - 1; i >= 0; i--) {
            inverse += s.charAt(i);
        }

        System.out.println("Chaîne inversée : " + inverse);
        sc.close();
    }
}
