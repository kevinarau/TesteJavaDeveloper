package MeusClientes;

import Usuario.Pessoa;

//Classe que representa um cliente no sistema.
  //Herda da classe Pessoa.
public class Cliente extends Pessoa {
    public Cliente(String nome, String documento) {
        super(nome, documento);
    }
}
