import MeusClientes.Cliente;
import MinhasEmpresas.Empresa;


public class Sistema {


    // Método principal que inicia a execução do sistema.



    public static void main(String[] args) {

        Cliente cl = new Cliente("MeusClientes.Cliente", "524.645.635.98");

        Empresa em = new Empresa("MinhasEmpresas.Empresa", " 46.379 400 0001 55");
        em.adicionarTaxa("saque", 0.5);




        double valorDeposito = 100;
        em.depositar(valorDeposito);
        double valoSaque = 70.0;
        boolean saqueEfetuado = em.sacar(valoSaque);


        if (saqueEfetuado) {
            Transacao transacao = new Transacao(cliente, empresa, valorSaque, "saque");

        } else {

            ServicoNotificacao servicoNotificacao = new ServicoNotificacao();

            servicoNotificacao.notificarCliente(cliente, "Saque de R$" + valorSaque + " efetuado com sucesso.");

        }

        System.out.printf("Saldo empresa = " + em.getSaldo());


    }


}
