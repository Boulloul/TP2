package Exercice1;

public class CompteDeux extends Thread {
	int valeur;
	String nom;
	public CompteDeux(String name,int val){
	valeur=val;	
	nom=name;
	
	}
	public void run() {
		try {
			if(valeur==1) {
		for(int i=1;i<=1000;i++) {
			System.out.println(nom+" : "+valeur+" ");
			valeur++;
		}
				Thread.sleep(1000);
				
			}else{
				for(int i=1000;i>=1;i--) {
					System.out.println(nom+" : "+valeur+" ");
					valeur--;
				}
						Thread.sleep(1000);
				
			}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	

	public static void main(String[] args) {
		 new CompteDeux("TA ",1).start();
		 new CompteDeux("TB ",1000).start();
		

	}

}
