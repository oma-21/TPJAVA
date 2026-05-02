package TP1Java;
import java.util.Scanner;
public class Exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nb = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + " x " + i + " = " + (nb * i));
        }
        sc.close();
    }
}


