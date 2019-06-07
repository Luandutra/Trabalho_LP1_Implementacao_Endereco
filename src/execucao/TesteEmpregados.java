
package execucao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import visao.IVisaoEmpregado;
import visao.VisaoEmpregadoCLT;
import visao.VisaoEmpregadoComissao;
import visao.VisaoEmpregadoHorista;


public class TesteEmpregados {
    private static final String stringMenu = "Forneça uma das opcoes: \n\n"+
                                             "[1] Incluir EmpregadoCLT\n"+
                                             "[2] Incluir EmpregadoComissao\n"+
                                             "[3] Incluir EmpregadoHorista\n"+
                                             "[4] Mostrar Dados\n"+
                                             "[5] Totalizar Salarios\n"+
                                             "[6] Sair";
    
    public static void main (String args[]){
        int resp =0;
        ArrayList<IVisaoEmpregado>listaEmpregado = new ArrayList();
        IVisaoEmpregado visaoEmpregadoTemp;
        
        double totalSalario=0;
        
        do {
            resp = exibirMenu();
            if (resp == 1){
                visaoEmpregadoTemp = new VisaoEmpregadoCLT();
                visaoEmpregadoTemp.lerDados();
                listaEmpregado.add(visaoEmpregadoTemp);
            }else if(resp==2){
                visaoEmpregadoTemp = new VisaoEmpregadoComissao();
                visaoEmpregadoTemp.lerDados();
                listaEmpregado.add(visaoEmpregadoTemp);
            }else if(resp==3){
                visaoEmpregadoTemp = new VisaoEmpregadoHorista();
                visaoEmpregadoTemp.lerDados();
                listaEmpregado.add(visaoEmpregadoTemp);
            }else if(resp==4){
                for(IVisaoEmpregado visao : listaEmpregado){
                    visao.mostraDados();
                }
            }else if (resp==5){
                totalSalario=0;
                for(IVisaoEmpregado visao : listaEmpregado){
                    totalSalario += visao.getEmpregado().calcularSalario();
                }
                JOptionPane.showMessageDialog(null, "Total dos Salario =" +totalSalario);
            }
            
        }while (resp != 6);
        System.exit(0);
    }
    
    
    private static int exibirMenu(){
        int resp = 0;
        
        do{
            try{
                resp = Integer.parseInt(JOptionPane.showInputDialog(null, stringMenu));
            }catch (NumberFormatException ex ){
                JOptionPane.showMessageDialog(null, "Digitacao incosistente");
                resp= 0;
            }
        }while (resp <1|| resp >6);
        return resp;
    }
}
