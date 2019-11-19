package Exercice2;

import Exercice1.CompteDeux;

public class TestCompteur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 new Compteur("Thread 1 ",10).start();
		 new Compteur("Thread 2 ",20).start();
		
		
	}

}
