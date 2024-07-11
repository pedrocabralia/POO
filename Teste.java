import Funcionario.Atendente;
import Funcionario.Gerente;

public class Teste {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente();
        Atendente atendente1 = new Atendente();

        gerente1.salario = 5000.00;
        atendente1.salario = 5000.00;

        double gratificacaoGerente = gerente1.gratificacao();
        double gratificacaoAtendente = atendente1.gratificacao();

        System.out.println("Gratificação do gerente: "+gerente1.gratificacao());

        System.out.println("Gratificação do Atendente: "+atendente1.gratificacao());




    }
}
