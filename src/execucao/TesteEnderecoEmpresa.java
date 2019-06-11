
package execucao;

import visao.VisaoEmpregadoAplicacao;
import visao.VisaoEnderecoEmpresa;


public class TesteEnderecoEmpresa {
    
    public static void main (String args[]){
        VisaoEnderecoEmpresa emp1 = new  VisaoEnderecoEmpresa();
        emp1.lerDados();
        emp1.mostraDados();
        
        System.exit(0);
    }
}
