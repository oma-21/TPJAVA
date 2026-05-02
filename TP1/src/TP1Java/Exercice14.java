package TP1Java;

import java . util . Scanner ;
import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mot : ");
        String s = sc.nextLine();
        String inv = "";
        for (int i = s.length()-1; i >= 0; i--) inv += s.charAt(i);
        if (s.equalsIgnoreCase(inv)) System.out.println("Palindrome");
        else System.out.println("Non palindrome");
        sc.close();
    }
}