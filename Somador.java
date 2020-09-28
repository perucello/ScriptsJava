package aulasjava;

public class Somador {
    
    public static void main(String[] args) {
        
        java.util.Scanner leitor = 
                new java.util.Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        
        int v1 = leitor.nextInt();
        
        System.out.print("Digite outro valor: ");
        
        int v2 = leitor.nextInt();
        
        System.out.println("A soma é " + (v1+v2));
        
    } // fim de main()
    
} // fim de Somador
