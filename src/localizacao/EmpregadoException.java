
package localizacao;


public class EmpregadoException extends Exception {
    
    public EmpregadoException (){
        super("Erro ao manipular dados de Empregado");
    }
    
    public EmpregadoException (String mensagem){
        super(mensagem);
    }
}
