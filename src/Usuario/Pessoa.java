package Usuario;

public class Pessoa {

    protected String nome;
    protected String documento;

   // Construtor para criar uma nova instância de Pessoa.

    public Pessoa(String nome, String documento ){
       this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }



    public String getDocumento() {
        return documento;
    }

    // Métodos getters e setters para o documento podem ser adicionados conforme necessário
}
