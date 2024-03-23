package SistemaOperacionais;

import MeusClientes.Cliente;
import MinhasEmpresas.Empresa;



public class Sistema {


    // Método principal que inicia a execução do sistema.



    public static  void main(String[] args) {

        Cliente cliente  = new Cliente("MeusClientes.Cliente", "524.645.635.98");

        Empresa empresa = new Empresa("MinhasEmpresas.Empresa", " 46.379 400 0001 55");
        empresa.adicionarTaxa("saque", 0.5);




        double valorDeposito = 100;
        empresa.depositar(valorDeposito);
        double valoSaque = 70.0;
        boolean saqueEfetuado = empresa.sacar(valoSaque);



        if (saqueEfetuado) {
            Transacao transacao = new Transacao(cliente,empresa, valoSaque,"saque");


        } else {
            Notificacao servicoNotificacao = new Notificacao();
            // Notifique o cliente sobre a transação


            Notificacao.notificarCliente(cliente, "Saque de R$" + valoSaque + " efetuado com sucesso.");

        }

        System.out.printf("Saldo empresa = " + empresa.getSaldo());


    }


}
