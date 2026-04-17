package Partie1;



public class Compte {
	//Attributs
	protected String numero;
	protected String titulaire;
	protected double solde;
	// Constructeur
	public Compte(String numero,String titulaire,double solde) {
		this.numero=numero;
		this.titulaire=titulaire;
		this.solde=solde;
	}
//Getters et Setters
	public String getnumero() {return numero;}
	public void setnumero(String numero) {this.numero=numero;}
	public String gettitulaire() {return titulaire;}
	public void settitulaire(String titulaire) {this.titulaire=titulaire;}
	public double getsolde() {return solde;}
	public void setsolde(double solde) {this.solde=solde;}
	//Methodes
	public void deposer(double montant) {
		solde+=montant;
	}
	public void retirer(double montant) {
		if(montant<= solde) {
			solde-=montant;
		}else {
			System.out.println("solde insuffisant pour le retrait.");
		}
			}
	public void afficher() {
	    System.out.println("NUMERO: " + numero + ", Titulaire: " + titulaire + ", Solde: " + solde);
	}
	
}
