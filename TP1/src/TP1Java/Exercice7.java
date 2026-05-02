package TP1Java;
import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        int[] tab = {15, 20, 8, 35, 12};
        int max = tab[0];
        for (int val : tab) {
            if (val > max) max = val;
        }
        System.out.println("Le plus grand élément est : " + max);
    }
}

