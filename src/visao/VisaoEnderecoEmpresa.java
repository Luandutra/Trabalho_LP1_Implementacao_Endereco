
package visao;

import conceito.Empregado;
import conceito.EmpregadoComissao;
import javax.swing.JOptionPane;
import localizacao.EnderecoException;


public class VisaoEnderecoEmpresa implements IVisaoEmpregado{
    
    private Empregado novo1;
    private EmpregadoComissao emp;
    
    public VisaoEnderecoEmpresa (){
        emp = new EmpregadoComissao();
        novo1 = new Empregado() {
            @Override
            public float calcularSalario() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
    }
    
    @Override 
    public void lerDados(){
        boolean continuaLoop = true;
        do {
            try {
               
                novo1.setUfEmpresa(JOptionPane.showInputDialog("Digite A UF do seu Estado da Empresa onde trabalha:"));
                novo1.setCepEmpresa(JOptionPane.showInputDialog("Digite o CEP da Empresa:"));
                novo1.setCidadeEmpresa(JOptionPane.showInputDialog("Forneca a cidade onde se localiza a Empresa: "));
                novo1.setBairroEmpresa(JOptionPane.showInputDialog("Forneca o bairro onde se localiza a Empresa: "));
                novo1.setLogradouroEmpresa(JOptionPane.showInputDialog("Forneca a rua onde se localiza a Empresa:   "));
                novo1.setNumeroEmpresa(Integer.parseInt(JOptionPane.showInputDialog("Forneca o numero da Empresa: ")));
                
                
                continuaLoop = false;
            }catch (EnderecoException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro de digitacao");
                }
            
            }while (continuaLoop);
    }

    
    @Override 
    public void mostraDados(){
        JOptionPane.showMessageDialog(null, this.obterDados(), "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
    
    @Override 
    public String obterDados(){
        return "\n Dados de Localizacao da Empresa \n UF: "+novo1.getUfEmpresa()+"\nCEP: "+novo1.getCepEmpresa()+"\n Cidade: " +novo1.getCidadeEmpresa()+"\n Bairro: " +novo1.getBairroEmpresa()+ "\nLogradouro / Rua : " +novo1.getLogradouroEmpresa()+"\n Numero :" +novo1.getNumeroEmpresa();
    }
    
    @Override 
    public Empregado getEmpregado(){
        return emp;
    }
    
}
