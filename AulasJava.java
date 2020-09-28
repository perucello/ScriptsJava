package aulasjava;

public class AulasJava {


    public static void main(String[] args) {

        // declaracao de variaveis
        
        byte  menor;
        short pequeno;
        int   normal;
        long  aloprado;
        
        // atribuicao de valores
        
        menor   = 120;
        pequeno = 32000;
        normal  = 35000;
        aloprado  = 3000000000l; 
        // L minusculo no final
        
        // COMANDOS DE SAIDA - escrever na tela
        
        // print não pula linha
        // println pula linha
        
        System.out.print("Normal = "); 
        // imprime texto
        
        System.out.println(normal);    
        // imprime valor de variáveis
        
        System.out.println(5 + 5);  
        // resultado de cálculos com valores
        
        System.out.println(normal + normal);
        // resultado de cálculos com variáveis
        
        System.out.println("Aloprado = " + aloprado);
        // mistura de texto e valor de variável
        
        System.out.println("Soma = " + (2*5) );
        // mistura de texto e cálculo (entre parênteses)
        
        System.out.println("Linha 1\nLinha 2");
        // imprimir várias linhas com 1 comando 
        // use \n pra quebrar na posição desejada
        
        // Cria um objeto chamado 'leitor'
        // que permite capturar o que é
        // digitado no teclado (System.in)
        
        java.util.Scanner leitor = 
           new java.util.Scanner(System.in);
        
        
        // Para realizar a captura, chama o
        // objeto e o tipo de dado a ser lido
        // 
        
        int x = leitor.nextInt();
        
        System.out.println(
           "O valor digitado foi " + x);
        
        double salario = leitor.nextDouble();
        
        System.out.println("Eu ganho R$ " + salario);
        
        
    } // fim do metodo main()
    
}// fim da classe AulasJava
