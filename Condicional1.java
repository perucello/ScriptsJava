package aulasjava;

// Importa classe que cria janelas de diálogos
import javax.swing.JOptionPane;

public class Condicional1 {
    
    public static void main (String args[]){
    
        // Mostra janela de MENSAGEM (só exibe)

        JOptionPane.showMessageDialog(null,"Olá, Mundo!");
        
        // MENSAGEM com mais de uma linha de texto
        // Use \n para pular a linha
        
        JOptionPane.showMessageDialog(null,
                "Olá, João!\nTudo bem?");
        
        // MENSAGEM com icone e título personalizado
        // 0 - ERROR_MESSAGE
        // 1 - INFORMATION_MESSAGE
        // 2 - WARNING_MESSAGE       (alerta)
        // 3 - QUESTION_MESSAGE      (pergunta)
        // 4 - PLAIN_MESSAGE         (sem icone)
        
        JOptionPane.showMessageDialog(null, 
                "Minha mensagem", 
                "Titulo da janela", 
                0);
        
        // Usando a CONSTANTE com o tipo da mensagem
        
        JOptionPane.showMessageDialog(null, 
                "Minha mensagem", 
                "Titulo da janela", 
                JOptionPane.WARNING_MESSAGE);
        
        // Usando uma variável String com a mensagem
        
        String msg = "Esta é minha mensagem!";
        String tit = "O titulo vai aqui";
        
        JOptionPane.showMessageDialog(null, msg, tit, 3);
        
    } // fim de main
    
}// fim da classe
