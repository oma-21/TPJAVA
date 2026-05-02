package TP1Java;

import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne : ");
        String s = sc.nextLine();
        System.out.println("Longueur : " + s.length());
        sc.close();
    }
}