
package conceito;


public abstract class Empregado extends Pessoa {
    private String cargo;
    private String nomeEmpresa;
    
    
    public Empregado (){
        this.cargo = "";
        this.nomeEmpresa = "";
    }
    
    public Empregado (String cargo, String nomeEmpresa, String nome, String nomeMae, String nomePai) throws  PessoaException{
        super ( nome, nomeMae, nomePai);
        this.setCargo(cargo);
        this.setNomeEmpresa(nomeEmpresa);
    }
    
    public final String getCargo(){
        return cargo;
    }
    
    public final void setCargo(String cargo) throws  PessoaException{
        if (cargo.length () > 0){
            this.cargo = cargo;
        }else {
            throw new  PessoaException ("Cargo invalido");
        }
    }
    
    
    public final void setNomeEmpresa(String nomeEmpresa) throws  PessoaException{
         if (nomeEmpresa.length() > 5){
             this.nomeEmpresa = nomeEmpresa;
         }else {
             throw new PessoaException("Nome empresa Invalido");
         }
     }
     
     
     public abstract float calcularSalario();
}
