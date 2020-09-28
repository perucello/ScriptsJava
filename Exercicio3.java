/*
 * O usuário digita quando está valendo 
 * o dólar e quando em reais ele possui. 
 * O programa exibe quantos dólares vale 
 * os reais que o usuário informou.
 */

package aulasjava;

public class Exercicio3 {
    
    public static void main(String [] args){

        java.util.Scanner leitor = 
                new java.util.Scanner(System.in);
        
        System.out.print("Quanto vale o Dolar?");
        
        double dolar = leitor.nextDouble(); 

        System.out.print("Quanto tem em Reais?");
        
        double reais = leitor.nextDouble();
        
        System.out.println("Seu dinheiro vale " +
                (reais/dolar) + " dolares.");
        
    }
}
