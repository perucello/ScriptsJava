package aulasjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MaiusculasMinusculas {
    public static void main (String args[]){
    
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome completo: ");
	String nomeCompleto = input.nextLine();
        
        System.out.println("Nome digitado: " + nomeCompleto);
        System.out.println("Nome convertido letra maiuscula: " + nomeCompleto.toUpperCase());
        System.out.println("Nome Convertido letra minuscula: " + nomeCompleto.toLowerCase());
                
        
//        String nome = JOptionPane.showInputDialog(
//                "Digite seu nome completo:");
//        
//        JOptionPane.showMessageDialog(null,
//                "Em maiúsculas: " + nome.toUpperCase());
//        
//        JOptionPane.showMessageDialog(null,
//                "Em minusculas: " + nome.toLowerCase());
    }
}
