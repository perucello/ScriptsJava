//programa que leia o nome de um funcionário
//seu número de horas trabalhadas
//o valor que recebe por hora 
//e calcula o salário desse funcionário. 
//mostre quanto funcionário irá receber !

package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
	Locale.setDefault (Locale.ENGLISH);
	Scanner sc =  new Scanner (System.in);
	String nome;
        int horas;
        float valorHora, salario;
               System.out.println("Digite o nome ");
                    nome = sc.next();
               System.out.println("Digite as horas ");
                    horas = sc.nextInt ();
	       System.out.println("Digite valor da hora ");
                    valorHora = sc.nextFloat();
	salario = valorHora*horas;
        System.out.println(" O Funcionario = "  + nome + " , irá receber R$ " + salario);	
	}
}