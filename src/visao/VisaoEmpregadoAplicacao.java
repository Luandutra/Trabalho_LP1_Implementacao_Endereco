
package visao;

import conceito.Empregado;
import conceito.EmpregadoCLT;
import conceito.PessoaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import localizacao.EmpregadoException;
import localizacao.Endereco;
import localizacao.EnderecoException;


public class VisaoEmpregadoAplicacao implements IVisaoEmpregado {
    
    private EmpregadoCLT emp;
    private Endereco novo;
    
    public VisaoEmpregadoAplicacao(){
        emp = new EmpregadoCLT();
        novo = new Endereco();
    }
    
    @Override
    public void lerDados(){
        boolean continuaLoop = true;
        do{
            try{
                emp.setNome(JOptionPane.showInputDialog("forneca o nome:"));
                emp.setCargo(JOptionPane.showInputDialog("forneca o cargo:"));
                emp.setSalarioBase(Float.parseFloat(JOptionPane.showInputDialog("Forneca o total vendido:")));
                emp.setPINSS(Float.parseFloat(JOptionPane.showInputDialog("percentual de INSS")));
                emp.setPIR(Float.parseFloat(JOptionPane.showInputDialog("percentual de IR")));
                emp.setValorSalarioFamilia(Float.parseFloat(JOptionPane.showInputDialog("Forneça o valor do salario familia")));
                emp.setNumeroFilhos(Integer.parseInt(JOptionPane.showInputDialog("percentual comissao")));
                novo.setUf(JOptionPane.showInputDialog("Digite A UF do seu Estado"));
                novo.setCep(JOptionPane.showInputDialog("Digite o CEP de sua Residencia"));
                novo.setCidade(JOptionPane.showInputDialog("Forneca Sua cidade: "));
                novo.setBairro(JOptionPane.showInputDialog("Forneca Seu Bairro: "));
                novo.setLogradouro(JOptionPane.showInputDialog("Forneca A sua Rua:  "));
                novo.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Forneca o numero da sua residencia: ")));
                
                continuaLoop = false;
            }catch (PessoaException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch(NumberFormatException e ){
                JOptionPane.showMessageDialog(null, "Erro de digitacao");
            } catch (EmpregadoException ex) {
                Logger.getLogger(VisaoEmpregadoAplicacao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (EnderecoException ex) {
                Logger.getLogger(VisaoEmpregadoAplicacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while (continuaLoop);
    }
    
    @Override
    public void mostraDados(){
        JOptionPane.showMessageDialog(null, this.obterDados(), "Resultados", JOptionPane.PLAIN_MESSAGE);
    }
    
    @Override
    public String obterDados(){
        return "Dados Pessoais do Funcionario \nNome:" + emp.getNome() + "\nCargo:" + emp.getCargo() + "\nSalario: R$" + emp.calcularSalario()+ "\nDados De localizacao da funcionario\n"+ novo.getEnderecoCompleto();
    }
    
    @Override 
    public Empregado getEmpregado(){
        return emp;
    }
    
}   
    