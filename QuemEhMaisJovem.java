package aulasjava;

import javax.swing.JOptionPane;

public class QuemEhMaisJovem {
    public static void main(String args[]){
    
        // CRIAR OS VETORES
        
        String nomes[] = new String[5];
        
        int idades[] = new int[5];
        
        // PREENCHER OS VETORES
        
        for(int x = 0; x < 5; x++){
            
            nomes[x] = JOptionPane.showInputDialog(
                    "Digite o nome " + x);
            
            
            idades[x] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                    "Digite a idade " + x)
                    );
            
        } // fim de for
    
        // VERIFICAR QUEM É MAIS JOVEM
        
        int menoridade = idades[0];
        int posicao = 0;
        
        for (int x = 1; x < 5; x++){
            
            if(idades[x] < menoridade){
                
                menoridade = idades[x];
                posicao = x;
                
            } // fim de if
            
        } // fim de for
    
        JOptionPane.showMessageDialog(null, "O mais jovem é " 
                + nomes[posicao] + " que tem " + menoridade 
                + " anos");
    
    }
    
}
