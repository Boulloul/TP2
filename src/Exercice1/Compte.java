package Exercice1;
public class Compte implements Runnable {
	int valeur;
	String nom;
	public Compte(String name,int val){
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
					Thread.sleep(1000);
				}
						
				
			}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	

	public static void main(String[] args) {
		Runnable r1=new Compte("Thread 1",1);
		Runnable r2=new Compte("Thread 2",1000);
		new Thread(r1).start();
		new Thread(r2).start();
		

	}

}
