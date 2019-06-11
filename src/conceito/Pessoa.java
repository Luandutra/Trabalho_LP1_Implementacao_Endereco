
package conceito;

import localizacao.Endereco;
import localizacao.EnderecoException;


public class Pessoa {
     private String nome;
     private String nomeMae;
     private String nomePai;
     private Endereco endereco;
             
    public Pessoa(){
        this.nome = "";
        this.nomeMae = "";
        this.nomePai = "";
    }
    
    public Pessoa (String nome, String nomeMae, String nomePai) throws PessoaException{
        this.setNome(nome);
        this.setNomeMae(nomeMae);
        this.setNomePai(nomePai);
    }
    
    public final String getNome(){
        return nome;
    }
    
    public final void setNome(String nome) throws  PessoaException{
        if (nome.length() >= 3 ){
            this.nome = nome;
        }else{
            throw new  PessoaException ("Nome Invalido");
        }
    }
    
    public final String getNomeMae(){
        return nomeMae;
    }

    public final void setNomeMae(String nomeMae) throws PessoaException{
        if (nomeMae.length() >= 3){
            this.nomeMae = nomeMae;
        }else{
            throw new  PessoaException ("Nome da Mae Invalido");
        }
    }
    
    public final String getNomePai(){
        return nomePai;
    }

    
    public final void setNomePai(String nomePai) throws  PessoaException{
        if (nomePai.length() >= 3 ){
            this.nomePai = nomePai;
        }else {
            throw new  PessoaException ("Nome do Pai Invalido");
        }
    }
    
    /* Métodos gets e sets 
    Par de métodos get e set para os métodos get e set de endereco - Métodos que encapsulam os
    métodos de endereço, delegando a ação para o método correspondente da classe endereço. Por
    exemplo o método setRua(String rua) de pessoa deverá chamar o método setRua(String rua) do
    objeto endereco: endereco.setRua(rua);
    */
    
    public void setLogradouro(String logradouro)   throws EnderecoException{
        this.endereco.setLogradouro(logradouro);
    }
    public String getLogradouro() {
        return endereco.getLogradouro();
    }
    
    public  void setBairro(String bairro) throws EnderecoException{
        this.endereco.setBairro(bairro);
    }
    
    public String getBairro(){
        return endereco.getBairro();
    }
    
    public void setNumero(int numero) throws EnderecoException{
        this.endereco.setNumero(numero);
    }
    
    public int getNumero(){
        return endereco.getNumero();
    }
    
    public void serCep(String cep) throws EnderecoException{
        this.endereco.setCep(cep);
    }
        
    public String getCep(){
        return endereco.getCep();
    }
    
    public void setUf(String uf) throws EnderecoException{
        this.endereco.setCep(uf);
    }
    
    public String getUf(){
        return endereco.getUf();
    }
    
    public void setCidade(String cidade) throws EnderecoException{
        this.endereco.setCidade(cidade);  
    }
    
    public String getCidade(){
        return endereco.getCidade();
    }
}
