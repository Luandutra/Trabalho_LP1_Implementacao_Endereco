
package visao;

import conceito.Empregado;
import conceito.EmpregadoComissao;
import conceito.PessoaException;
import javax.swing.JOptionPane;


public class VisaoEmpregadoComissao implements IVisaoEmpregado{
    
    private EmpregadoComissao emp;
    
    public VisaoEmpregadoComissao (){
        emp = new EmpregadoComissao();
    }
    
    @Override 
    public void lerDados(){
        boolean continuaLoop = true;
        do {
            try {
                emp.setNome(JOptionPane.showInputDialog("Forneca o nome: "));
                emp.setCargo(JOptionPane.showInputDialog("Forneca o cargo: "));
                emp.setTotalVenda(Float.parseFloat(JOptionPane.showInputDialog("Forneca o total vendido: ")));
                emp.setPComissao(Float.parseFloat(JOptionPane.showInputDialog("Forneca o percentual de comissao: ")));
                
                continuaLoop = false;
            
            }catch (PessoaException e ){
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
        return "Nome:" + emp.getNome() + "\n Cargo:" + emp.getCargo() + "\n salario:R$" + emp.calcularSalario();
    }
    
    @Override 
    public Empregado getEmpregado(){
        return emp;
    }
    
}
