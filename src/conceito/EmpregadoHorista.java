
package conceito;

import localizacao.EmpregadoException;

public class EmpregadoHorista extends Empregado {
    private float valorHora;
    private int numeroHora;
    
    public EmpregadoHorista(){
        super();
    }
    
    public EmpregadoHorista(float valorHora, int numeroHora, String cargo, String nomeEmpresa, String nome, String nomeMae, String nomePai) throws PessoaException, EmpregadoException{
        super(cargo, nomeEmpresa, nome, nomeMae, nomePai);
        this.setNumeroHora(numeroHora);
        this.setValorHora(valorHora);
    }
    
    public final float getValorHora(){
        return valorHora;
    }
    
    public final void setValorHora(float valorHora) throws PessoaException{
        if(valorHora > 0 ){
            this.valorHora = valorHora;
        }else {
            throw new PessoaException ("valor hora deve ser maior que zero");
        }
    }
    
    public final float getNumeroHora(){
        return numeroHora;
       
    }
    
    public final void setNumeroHora(int numeroHora) throws PessoaException{
        if(numeroHora >= 0 ){
            this.numeroHora = numeroHora;
        }else {
            throw new PessoaException("numero de horas dever ser maior ou igual a zero");
        }
    }

    @Override
    public float calcularSalario() {
        float salarioFinal;
        return this.numeroHora * this.valorHora;    
    }
}