package aulasjava;

import javax.swing.JOptionPane;

public class Condicional2 {
    
    public static void main(String args[]){
        
        // Janela de ENTRADA (input)
        // Sempre criar uma variável String para
        // armazenar o que foi digitado na janela
        
        String nome = JOptionPane.showInputDialog(
                "Qual o seu nome?");
        
        // Use a variável para exibir em outra janela...
        
        JOptionPane.showMessageDialog(null, "Olá, " + nome);
        
        
        // modificando o titulo e o ícone
        
        String curso = JOptionPane.showInputDialog(null,
                "Qual o melhor curso do IFRN?",
                "Pergunta curso",
                JOptionPane.ERROR_MESSAGE);
    
    } // fim de main
    
} // fim da classe
