package SistemaOperacionais;

import MeusClientes.Cliente;
import MinhasEmpresas.Empresa;

public class Transacao {


    private Cliente cliente;
    private Empresa empresa;
    private double valor;
    private String tipo;


    public Transacao(Cliente cliente, Empresa empresa, double valor, String tipo) {
        this.cliente = cliente;
        this.empresa = empresa;
        this.valor = valor;
        this.tipo = tipo;

    }
}

