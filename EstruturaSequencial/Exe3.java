//ler quatro valores inteiros A,B,C,D. 
//A seguir, calcule e mostre a diferença do produto
//fórmula: A-B = DIF1 e C-D=DIF2 

package EstruturaSequencial;

import java.util.Scanner;
public class Exe3 {
    public static void main(String[] args) {
		Scanner sc =  new  Scanner(System.in);
		int a;
                int b;
                int c;
                int d;
                int dif1;
                int dif2;
                int diftotal;
                
            System.out.print("Ditite primeiro numero  a =  ");;    
                a = sc.nextInt();
            System.out.print("Ditite primeiro numero  b =  ");;    
                b = sc.nextInt();
            System.out.print("Ditite primeiro numero  c =  ");;    
                c = sc.nextInt();
            System.out.print("Ditite primeiro numero  d =  ");;    
                d = sc.nextInt();
                dif1 = a-b;
                dif2 = c-d;
                diftotal = dif1-dif2;
        System.out.println("dif1 =  " + dif1);        
        System.out.println("dif2 =  " + dif2); 
        System.out.println("diferenã total " + diftotal);

    }
}
