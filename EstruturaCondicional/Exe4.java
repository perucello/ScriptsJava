/*
Com base na tabela e escreva um programa que leia o código de "UM" item e a quantidade deste item. 
Calcule e mostre o valor da conta a pagar.

codigo: 1 
Item: Pão
Preço: 2,00

codigo: 2
Item:  cafe
Preço: 2,00

codigo: 3
Item: chocolate
Preço: 3,00

*/
package EstruturaCondicional;
import java.util.Scanner;
public class Exe4 {
    public static void main(String[] args) {
		Scanner captura =  new Scanner (System.in);
       	System.out.println("----------------------");
        System.out.println("codigo: 1 ");
       	System.out.println("Item: Pão ");
       	System.out.println("Preço: 2,00 ");
       	System.out.println("----------------------");
        System.out.println("codigo: 2 ");
       	System.out.println("Item: CAfé ");
       	System.out.println("Preço: 2,00 ");
       	System.out.println("----------------------");
        System.out.println("codigo: 3 ");
       	System.out.println("Item: Chocolate ");
       	System.out.println("Preço: 3,00 ");
       	System.out.println("----------------------");
      
        System.out.println("-------Pedido---------");
        
	System.out.println("Digite o Codigo do Produto ");
                int codigo = captura.nextInt ();
	System.out.println("Digite a Quantidade do Produto ");
                int quantidade = captura.nextInt ();	
		double total = 0;
		if (codigo ==  1 ) {
			total = quantidade * 2.0;
		}
		else if (codigo == 2 ){
			total = quantidade * 2.0 ;
		}
                else if (codigo ==  3 ) {
			total = quantidade *  3.0 ;
		}
		System.out.println( "Você comprou Produto codigo - " + codigo + " e o total a pagar é = R$ " + total );

	}
}