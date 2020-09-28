//Faça um programa para ler dois valores inteiro e depois mostrar na tela
// agora o usuario digita o valor da variavel - SOMA

package EstruturaSequencial;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
		Scanner sc =  new  Scanner(System.in);
		int A ,B ,soma;
            System.out.print("Ditite primeiro numero  =  ");  
                A = sc.nextInt();
            System.out.print("Ditite primeiro numero  =  ");   
                B = sc.nextInt();
		soma =  A+B;
            System.out.print("Soma = " + soma);;
	}
}
