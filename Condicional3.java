package aulasjava;

import javax.swing.JOptionPane;

public class Condicional3 {
    
    public static void main(String args[]){
        
        // Janela de Confirmação
        // Mostra botões Ok, Sim, não, cancelar...
        // retorna um inteiro com o número do botão
        // 0 - SIM           YES_OPTION
        // 1 - NÃO           NO_OPTION
        // 2 - CANCELAR      CANCEL_OPTION
        
        // PADRÃO - SIM, NÃO, CANCELAR
        
        int resposta = JOptionPane.showConfirmDialog(
                null, "Você é aluno do IFRN?");
        
        // TRATAMENTO DA RESPOSTA USANDO SE...SENÃO
        // Em java usa-se  if(condicao){}else{}
        
        
        if(resposta == JOptionPane.YES_OPTION){     //SE
            
            JOptionPane.showMessageDialog(null,
                    "Valeu, cara! ^_^");

        }
        else if(resposta == JOptionPane.NO_OPTION){ //SENÃO-SE
        
            JOptionPane.showMessageDialog(null,
                    "Não sabe o que está perdendo! @_@");
            
        }
        else{                                       //SENAO
        
            JOptionPane.showMessageDialog(null,
                    "Você não respondeu a pergunta! T_T");
            
        } // fim if-else
        
        
        
        // Mudando o título e os botões que aparecem
        
        int opcao = JOptionPane.showConfirmDialog(null,
                "Você gosta de bolo?",
                "Culinária",
                JOptionPane.YES_NO_OPTION);
        
        // OK_CANCEL_OPTION
        // YES_NO_CANCEL_OPTION
        // YES_NO_OPTION

    
    } // fim de main
    
} // fim da classe
