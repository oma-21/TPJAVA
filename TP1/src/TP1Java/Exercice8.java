package TP1Java;

import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] M = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("M["+i+"]["+j+"] = ");
                M[i][j] = sc.nextInt();
            }
        }
        for (int[] ligne : M) {
            for (int val : ligne) System.out.print(val + " ");
            System.out.println();
        }
        sc.close();
    }
}


