/*
 * O USUÁRIO DIGITA 4 NUMEROS SEPARADAMENTE 
 * E O PROGRAMA, E MOSTRA OS NÚMEROS 
 * NA ORDEM INVERSA DE DIGITAÇÃO. 
 * EX: DIGITOU: 1  2  3  4  
 * MOSTRA: 4 3 2 1
 */
package aulasjava;

public class Exercicio2 {
 
    public static void main(String args[]){
        
        java.util.Scanner leitor = 
                new java.util.Scanner(System.in);
        
        System.out.print("Digite o 1o numero: ");
        
        int n1 = leitor.nextInt();
        
        System.out.print("Digite o 2o numero: ");
        
        int n2 = leitor.nextInt();
        
        System.out.print("Digite o 3o numero: ");
        
        int n3 = leitor.nextInt();
        
        System.out.print("Digite o 4o numero: ");
        
        int n4 = leitor.nextInt();
        
        System.out.println(n4 + " " + n3 + 
                " " + n2 + " " + n1);
    }
}
