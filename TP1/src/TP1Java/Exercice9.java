package TP1Java;
import java . util . Scanner ;
public class Exercice9 {
public static void main ( String [] args ) {
Scanner sc = new Scanner ( System .in) ;
int [][] m = new int [3][3];
int somme = 0;
for ( int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
m[i][j] = sc. nextInt () ;
somme += m[i][j];
}
}
System .out. println (" Somme = " + somme ) ;
}
}