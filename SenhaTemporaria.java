package aulasjava;

import javax.swing.JOptionPane;

public class SenhaTemporaria {
    
    public static void main(String args[]){
    
        String nome = JOptionPane.showInputDialog(null,
                "Digite seu nome:");
    
        String ano =  JOptionPane.showInputDialog(null,
                "Digite o ano de nascimento:");
        
        String senha = nome.substring(0,2) 
                + ano.substring(2,4) 
                + ano.substring(0,2) 
                + nome.substring(nome.length()-2,nome.length());
        
        JOptionPane.showMessageDialog(null,
                "Senha temporária: " + senha);
        
    } // fim de main
    
} // fim da classe
