/*
 * O usuário informa o valor do seu salário e 
 * suas despesas mensais. O programa calcula o 
 * valor que sobra e diz quanto tempo (em anos) 
 * será necessário poupar para se tornar 
 * milionário.
 */

package aulasjava;

public class Exercicio4 {
    
    public static void main(String args[]){
        
        java.util.Scanner leitor = 
                new java.util.Scanner(System.in);
        
        System.out.print("Ganha quanto? ");
        
        double salario = leitor.nextDouble();
        
        System.out.print("Gasta quanto? ");
        
        double despesas = leitor.nextDouble();
        
        double anos = 
        (1000000 / (salario-despesas) ) / 12;
        
        System.out.println("Vai demorar " + anos +
                " anos pra juntar 1 milhao! @_@");
    }
}
