
package execucao;

import visao.VisaoEmpregadoAplicacao;


public class TesteEmpregadoCLT {
    
    public static void main (String args[]){
        VisaoEmpregadoAplicacao emp1 = new VisaoEmpregadoAplicacao();
        emp1.lerDados();
        emp1.mostraDados();
        
        System.exit(0);
    }
}
