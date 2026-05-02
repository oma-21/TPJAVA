package TP1Java;
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez N : ");
        int N = sc.nextInt();
        int somme = 0, i = 1;
        while (i <= N) {
            somme += i;
            i++;
        }
        System.out.println("La somme est : " + somme);
        sc.close();
    }
}


