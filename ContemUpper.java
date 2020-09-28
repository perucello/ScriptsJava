package aulasjava;

public class ContemUpper {
    public static void main(String args[]){
    
        String texto = "João da Silva Sauro";
        
        if(texto.toUpperCase().contains("sauRO".toUpperCase())){
            System.out.println("Você é pré-histórico!");
        }else{
            System.out.println("Moderninho...");
        }
    
    }
    
}
