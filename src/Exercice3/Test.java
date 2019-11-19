package Exercice3;

public class Test {

	public static void main(String[] args) {
		Valeur myval=new Valeur(0);
		Runnable job1= new Ajob(myval,1);
		Runnable job2= new Ajob(myval,-1);
		Thread T1=new Thread(job1);
		Thread T2=new Thread(job2);
		T1.start();
		T2.start();
		while(T1.isAlive()||T2.isAlive()) {
			
		}
		System.out.println(myval.toString());
		
		//Question 4:la valeur doit etre 0
		
	}

}
