package client;

// Déclaration de la classe Account
public class Account implements java.io.Serializable {
	
	// Variable d'instance pour stocker le solde
	double balance;
	// Variable d'instance pour stocker le nom du compte
	String name;
	
	// Constructeur de classe qui initialise le nom du compte
	public Account(String name) {
		this.name = name;
	}
	
	// Méthode pour déposer de l'argent dans le compte
	public void deposit(double cash) {
		// Ajoute le montant au solde actuel
		balance += cash;
	}
	
	// Méthode pour retirer de l'argent du compte
	public double withdraw(double cash) {
		if (balance >= cash) { // Vérifie si le solde est suffisant pour le retrait demandé
			balance -= cash; // Déduit le montant du solde
			return cash; // Renvoie le montant retiré
		} else {
			return 0; // Renvoie 0 si le solde est insuffisant
		}
	}
	
	// Méthode pour obtenir le solde actuel du compte
	public double getBalance() {
		return balance;
	}
	
	// Méthode pour obtenir le nom du compte
	public String getName() {
		return name;
	}
}