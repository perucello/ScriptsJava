/*
Ler um número inteiro N e calcular todos os seus divisores.
Informar na tela
 */
package EstruturaRepetitivaWHILE_FOR;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
	Scanner captura =  new Scanner (System.in);
            System.out.println("Digite um numero ");
                int n = captura.nextInt ();
		for ( int i = 1 ; i <= n; i ++ ) {
		if (n % i ==  0 ) {
                System.out.println("O numero " + n + " é divisor por " + i);
        	}
        }
    }
}