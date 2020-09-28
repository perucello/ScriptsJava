package aulasjava;

import javax.swing.JOptionPane; // permite usar diálogos

public class Revisao {
    
    public static void main (String args[]){
        
        // 1. Mensagem de boas vindas
        
        JOptionPane.showMessageDialog(null,
                "SEJA BEM VINDO!");
        
        // 2. Perguntar o nome do usuário
        
        String nome = JOptionPane.showInputDialog(
                "QUAL O SEU NOME?");
        
        // 3. Pergunta se é estudante
        
        int resposta = JOptionPane.showConfirmDialog(
                null,"VOCÊ É ESTUDANTE?", "Pergunta", 
                JOptionPane.YES_NO_OPTION);

        // 4. Testar se é estudante
        
        if (resposta == JOptionPane.YES_OPTION){
            
            // SE estuda pergunta o nome da escola
        
            String escola = JOptionPane.showInputDialog(
                "QUAL O NOME DE SUA ESCOLA?");
            
            JOptionPane.showMessageDialog(null,
                    "Olá, " + nome + "!\nObrigado "
                    + "por informar que você estuda na "
                    + "escola " + escola + ".");
        
        }else{  
            
            // SE NÃO estuda pergunta onde trabalha
        
            String trabalho = JOptionPane.showInputDialog(
                "ONDE VOCÊ TRABALHA?");
            
            JOptionPane.showMessageDialog(null,
                    "Olá, " + nome + "!\nObrigado "
                    + "por informar que você trabalha na "
                    + "empresa " + trabalho + ".");
        
        } // fim do if-else
    
    }//fim do metodo main
    
}// fim da classe Revisao