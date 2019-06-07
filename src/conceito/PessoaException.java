
package conceito;


public class PessoaException extends Exception {
    
    public PessoaException (){
        super("Erro ao manipular Pessoa/Empregado");
    }
    
    public PessoaException (String mensagem){
        super(mensagem);
    }
}
