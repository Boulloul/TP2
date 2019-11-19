package Exercice2;

import java.lang.*;


public class Compteur extends Thread {
    String nom;
    int valMax;
    
    public Compteur(String name,int val){
    	valMax=val;	
    	nom=name;
    }
    public void run() {
	try {
			
		for(int i=1;i<=valMax;i++) {
			System.out.println(nom+" : "+i+" ");
			sleep(1000);
			//System.out.println("Le délai est :"+(long)Math.round(Math.random()*1000));
			sleep((long)Math.round(Math.random()*1000));
			}
				
				
	} catch (InterruptedException e) {
				e.printStackTrace();
	}
			
		
   }
	
	
}
//