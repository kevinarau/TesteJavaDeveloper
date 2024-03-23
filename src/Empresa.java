import java.util.HashMap;
import java.util.Map;

public class Empresa extends Pessoa{
    private String cnpj;
    private Map<String,Double> taxa;



    public Empresa(String nome, String cnpj) {
        super(nome, cnpj);
        this.cnpj = cnpj;
        this.taxa = new HashMap<>();

    }

    public void adicionarTaxa(String tipoTaxa, double valor) {
          taxa.put(tipoTaxa, valor);

    }

    public double getTaxa(String tipotaxa) {
        return taxa.getOrDefault(tipotaxa, 0.0);
    }


    public void depositar(double valor) {
        double saldo = valor;
    }


    public boolean sacar(double valor) {
        double taxaSaque = getTaxa("saque");
        double valorComTaxa = valor + taxaSaque;
        double saldo = 1000;
        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            return true;
        } else {
            return false;
        }
    }

    public String getSaldo() {
        return null;
    }
}








