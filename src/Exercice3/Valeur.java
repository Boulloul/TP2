package Exercice3;

public class Valeur {
	private int valeur;
public Valeur(int vleur) {
	valeur=vleur;
}
public int getVal() {
	return valeur;
}

public String toString() {
	return "Valeur :"+valeur;
}
public synchronized void add(int i) {
	valeur+=i;
}

}
