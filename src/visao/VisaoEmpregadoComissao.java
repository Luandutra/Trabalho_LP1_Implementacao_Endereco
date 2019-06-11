
package visao;

import conceito.Empregado;
import conceito.EmpregadoComissao;
import conceito.PessoaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import localizacao.EmpregadoException;
import localizacao.Endereco;
import localizacao.EnderecoException;


public class VisaoEmpregadoComissao implements IVisaoEmpregado{
    
    private EmpregadoComissao emp;
     private Endereco novo;
    public VisaoEmpregadoComissao (){
        emp = new EmpregadoComissao();
        novo = new Endereco();
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
                novo.setUf(JOptionPane.showInputDialog("Digite A UF do seu Estado"));
                novo.setCep(JOptionPane.showInputDialog("Digite o CEP de sua Residencia"));
                novo.setCidade(JOptionPane.showInputDialog("Forneca Sua cidade: "));
                novo.setBairro(JOptionPane.showInputDialog("Forneca Seu Bairro: "));
                novo.setLogradouro(JOptionPane.showInputDialog("Forneca A sua Rua:  "));
                novo.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Forneca o numero da sua residencia: ")));
                continuaLoop = false;
            
            }catch (PessoaException e ){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro de digitacao");
                } catch (EmpregadoException ex) {
                Logger.getLogger(VisaoEmpregadoComissao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (EnderecoException ex) {
                Logger.getLogger(VisaoEmpregadoComissao.class.getName()).log(Level.SEVERE, null, ex);
            }
            }while (continuaLoop);
    }

    
    @Override 
    public void mostraDados(){
        JOptionPane.showMessageDialog(null, this.obterDados(), "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
    
    @Override 
    public String obterDados(){
        return "Nome:" + emp.getNome() + "\n Cargo:" + emp.getCargo() + "\n salario:R$" + emp.calcularSalario()+"\n Localizacao do empregado\n"+ novo.getEnderecoCompleto();
    }
    
    @Override 
    public Empregado getEmpregado(){
        return emp;
    }
    
}
