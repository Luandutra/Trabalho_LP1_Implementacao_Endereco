
package visao;

import conceito.Empregado;
import conceito.EmpregadoHorista;
import conceito.PessoaException;
import javax.swing.JOptionPane;


public class VisaoEmpregadoHorista implements IVisaoEmpregado {
    
    private EmpregadoHorista emp;
    
    public VisaoEmpregadoHorista (){
        emp = new EmpregadoHorista ();
    }
    
    public void lerDados(){
        boolean continuaLoop = true;
        do {
            try {
                emp.setNome(JOptionPane.showInputDialog("Forneca o nome: "));
                emp.setCargo(JOptionPane.showInputDialog("Forneca o cargo: "));
                emp.setNumeroHora(Float.parseFloat(JOptionPane.showInputDialog("Forneca o numero de horas trabalhadas: ")));
                emp.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Forneca o valor da hora trabahada: ")));
                
                continuaLoop = false;
            
            }catch (PessoaException e ){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro de digitacao");
                }
            }while (continuaLoop);
    }
    
    public void mostraDados(){
        JOptionPane.showMessageDialog(null, this.obterDados(), "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
    
    public String obterDados(){
        return "Nome:" + emp.getNome() + "\n Cargo:" + emp.getCargo() + "\n salario:R$" + emp.calcularSalario();
    }
    
    public Empregado getEmpregado(){
        return emp;
    }
    
}
