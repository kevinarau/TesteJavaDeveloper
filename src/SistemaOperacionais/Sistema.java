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

        double valoSaque = 30.0;
        boolean saqueEfetuado = empresa.sacar(valoSaque);



        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso.");

        } else {
            System.out.println("Saldo insuficiente para o saque.");

        }

        System.out.printf("Saldo empresa = " + empresa.getSaldo());


    }


}
