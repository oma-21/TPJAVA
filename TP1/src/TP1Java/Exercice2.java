package TP1Java;
import java.util.Scanner;
public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez trois nombres :");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Le plus grand est : " + max);
        sc.close();
    }
}

