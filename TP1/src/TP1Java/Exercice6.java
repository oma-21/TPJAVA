package TP1Java;
import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = {12, 5, 8, 10, 45, 3, 9, 21, 33, 7}; // Tableau de 10
        System.out.print("Nombre à rechercher : ");
        int rech = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == rech) { pos = i; break; }
        }
        if (pos != -1) System.out.println("Position : " + pos);
        else System.out.println("Non trouvé.");
        sc.close();
    }
}



