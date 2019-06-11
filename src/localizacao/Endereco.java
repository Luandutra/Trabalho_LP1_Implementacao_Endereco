
package localizacao;


public class Endereco {
    private String logradouro;
    private  int numero;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;
    
    
    public void Enderco(){
        logradouro = "";
        bairro = "";
        cidade = "";
        cep = "";
        
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) throws EnderecoException {
        if (logradouro.length()> 3){
        this.logradouro = logradouro;
        }else {
            throw new EnderecoException("Rua nao pode ser cadastrada");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws EnderecoException{
        if(numero >0 ){
            this.numero = numero;
        }else {
         throw new  EnderecoException("Numero incorreto");
        }
    }
        
    

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws EnderecoException {
        if (bairro.length() > 3 ){
            this.bairro = bairro;
        }else {
            throw new EnderecoException("Bairro não correspondente");
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws EnderecoException {
        if(cidade.length()>3){
            this.cidade= cidade;
        }else {
            throw new EnderecoException("Cidade nao correspondente ");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) throws EnderecoException {
        if(cep.length() == 10){
             this.cep = cep;    
    }else {
          throw new EnderecoException("Cep nao encontrado");
        }
        
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf)throws EnderecoException {
        if(uf.length()>= 2){    
        this.uf = uf;
    }else {
            throw new EnderecoException("UF invalida");
        }
    }
    
    public String getEnderecoCompleto( ){
        return "UF: "+getUf()+"\nCEP: "+getCep()+"\nCidade: " +getCidade()+"\nBairro: " +getBairro() + "\nLogradouro / Rua : " +getLogradouro()+"\nNumero :" +getNumero();
    } 
   
}
