package TP1Java;

public class Exercice10 {
    public static void main(String[] args) {
        int[][] M = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Transposée :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(M[j][i] + " "); // Inversion indices
            }
            System.out.println();
        }
    }
}