package aulasjava;

import javax.swing.JOptionPane;

public class UsuarioSenha {
    
    public static void main(String args[]){
        
        String u = JOptionPane.showInputDialog("Usuário:");
        
        String s = JOptionPane.showInputDialog("Senha:");
        
        if (u.equalsIgnoreCase("joao")){
            
            if(s.equals("123")){
                JOptionPane.showMessageDialog(null,
                        "Acesso permitido!");
            }else{
                JOptionPane.showMessageDialog(null,
                        "Acesso negado!");
            } // fim if-else-senha
            
        }else{
            JOptionPane.showMessageDialog(null,
                    "Acesso negado!");
        } // fim if-else-usuario   
    } //fim de main
}// fim da classe
