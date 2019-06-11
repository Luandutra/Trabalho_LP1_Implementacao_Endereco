
package conceito;

import localizacao.EmpregadoException;
import localizacao.Endereco;
import localizacao.EnderecoException;


public abstract class Empregado extends Pessoa {
    private String cargo;
    private String nomeEmpresa;
    private Endereco enderecoEmpresa;
    
    public Empregado (){
        this.cargo = "";
        this.nomeEmpresa = "";
    }
    
    public Empregado (String cargo, String nomeEmpresa, String nome, String nomeMae, String nomePai) throws  PessoaException, EmpregadoException{
        super ( nome, nomeMae, nomePai);
        this.setCargo(cargo);
        this.setNomeEmpresa(nomeEmpresa);
    }
    
    public final String getCargo(){
        return cargo;
    }
    
    public final void setCargo(String cargo) throws  EmpregadoException{
        if (cargo.length () >= 3){
            this.cargo = cargo;
        }else {
            throw new  EmpregadoException ("Cargo invalido");
        }
    }
    
    
    public final void setNomeEmpresa(String nomeEmpresa) throws  EmpregadoException{
         if (nomeEmpresa.length() >= 3){
             this.nomeEmpresa = nomeEmpresa;
         }else {
             throw new EmpregadoException("Nome empresa Invalido");
         }
     }
     
    /*
        Par de métodos get e set para os métodos get e set de endereco - Métodos que encapsulam os
        métodos de endereço, delegando a ação para o método correspondente da classe endereço. Por
        exemplo o método setRua(String rua) de pessoa deverá chamar o método setRua(String rua) do
        objeto endereco: endereco.setRua(rua). Obs.: como empregado herda os métodos de pessoa, então
        ele já possui métodos get e set para os campos de endereço de pessoa, assim para os get e set do
        endereço da empresa deverá ter um diferenciador no nome, por exempo:
        setLogradouroEmpresa(String logradouro), getLogradouroEmpresa( ), caso contrário haverá uma
        sobrescrita de métodos, e isso não é desejado, haja visto que o empregado deve possuir dados do
        endereço particular e dados do endereço comercial;
    */
    public void setLogradouroEmpresa(String logradouroEmpresa) throws  EnderecoException{
        this.enderecoEmpresa.setLogradouro(logradouroEmpresa);
    }
    
    public String getLogradouroEmpresa(){
        return enderecoEmpresa.getLogradouro();
    }
    
    public void setBairroEmpresa(String bairroEmpresa) throws EnderecoException{
        this.enderecoEmpresa.setBairro(bairroEmpresa);
    }
    
    public String getBairroEmpresa (){
        return enderecoEmpresa.getBairro();
    }
    
    public void setNumeroEmpresa(int numeroEmpresa) throws EnderecoException{
        this.enderecoEmpresa.setNumero(numeroEmpresa);
    }
    
    public int getNumeroEmpresa(){
        return enderecoEmpresa.getNumero();
    }
    
    public void setCepEmpresa(String cepEmpresa) throws EnderecoException{
        this.enderecoEmpresa.setCep(cepEmpresa);
    }
    
    public String getCepEmpresa(){
        return enderecoEmpresa.getCep();
    }
    
    public void setUfEmpresa(String ufEmpresa) throws EnderecoException{
        this.enderecoEmpresa.setUf(ufEmpresa);
    }
    
    public String getUfEmpresa(){
        return enderecoEmpresa.getUf();
    }
    
    public void setCidadeEmpresa(String cidadeEmpresa) throws EnderecoException{
        this.enderecoEmpresa.setCidade(cidadeEmpresa);
    }
    
    public String getCidadeEmpresa(){
        return enderecoEmpresa.getCidade();
    }
    
    
     public abstract float calcularSalario();
}
