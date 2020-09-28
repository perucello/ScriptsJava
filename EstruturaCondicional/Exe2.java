/*
Fazer um programa para ler um número inteiro
dizer se este número é par ou ímpar.
*/
package EstruturaCondicional;
import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args) {
	Scanner captura =  new  Scanner (System.in);
        System.out.println("Digite o valor ");
        int  n  = captura.nextInt();
  	if (n%  2  ==  0) {
		System.out.println( n +" é PAR ");
	}
	else {
		System.out.println( n + " é IMPAR " );
	}
	}
}