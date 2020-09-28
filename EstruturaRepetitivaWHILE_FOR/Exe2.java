/*
Leia um valor inteiro X 
Em seguida mostre os ímpares de 1 até X - um valor por linha, 
inclusive o X se for o caso.
*/      
package EstruturaRepetitivaWHILE_FOR;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
	Scanner captura =  new Scanner (System.in);
           System.out.println("Informe o Numero: ");
		int x = captura.nextInt ();
		System.out.println("Mostrando os numeros impares do 1 ate o numero " + x);
                for ( int i = 1 ; i <= x; i ++ ) {
			if (i%2!=0 ) {
		System.out.println(i);
                        }     
		}
                System.out.println("-----------------");
                System.out.println("Você escolheu numero  " + x);
    }
}  