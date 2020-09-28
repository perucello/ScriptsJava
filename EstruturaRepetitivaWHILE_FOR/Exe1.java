/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Cada leitura de senha incorreta informada
Escrever a mensagem "Senha Invalida" 
Quando a senha for  correta deve ser mostrar "Acesso Permitido" 
Considere que a senha correta é o valor 2020
 */
package EstruturaRepetitivaWHILE_FOR;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
	Scanner captura =  new  Scanner(System.in);
        System.out.println( "Digite a senha: " );
	int senha = captura.nextInt ();
            while (senha!=2020) {
		System.out.println( " Senha Invalida " );
			senha = captura.nextInt ();
		}
		System.out.println( " Acesso Permitido " );
	}
}        
    