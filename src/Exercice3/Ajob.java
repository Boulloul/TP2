package Exercice3;

public class Ajob implements Runnable {
Valeur myval;
int i;
public Ajob(Valeur myval,int i) {
	this.i=i;
	this.myval=myval;
}

@Override
public void run() {
int j=1;
while(j<=Math.pow(10, 6)) {
	myval.add(i);
	j++;
}
System.out.println("Myval = "+myval.getVal()+" Thread :"+Thread.currentThread().getName());
	
}
}
