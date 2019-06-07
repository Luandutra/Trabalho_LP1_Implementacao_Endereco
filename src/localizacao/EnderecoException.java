
package localizacao;

public class EnderecoException extends Exception {
    
     public EnderecoException (){
        super("Erro ao manipular Endereco/Empregado");
    }
    public EnderecoException (String mensagem){
        super(mensagem);
    }
        
    
}
