/*
Fazer um programa para ler um número inteiro
depois dizer se este número é negativo ou não.
 */
package EstruturaCondicional;
import java.util.Scanner;
public class Exe1 {
    public static void main(String[] args) {
	Scanner captura =  new  Scanner (System.in);
        System.out.println("Digite o valor ");
        int  n  = captura.nextInt();
  	if (n<0) {
		System.out.println( n +" é NEGATIVO ");
	}
	else {
		System.out.println( n + " é POSITIVO " );
	}
	}
}