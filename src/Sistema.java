public class Sistema {

    public static void main(String[] args) {

        Cliente cl = new Cliente("Cliente",  "524.645.635.98");

        Empresa em = new Empresa("Empresa", " 46.379 400 0001 55");
        em.adicionarTaxa("saque",0.5);



     double valorDeposito = 100;
         em.depositar(valorDeposito);
     double valoSaque = 70.0;
        boolean saqueEfetuado = em.sacar(valoSaque);


     if (saqueEfetuado){
         System.out.println("Saque Efetuado pelo o cliente");
     }
       else {
         System.out.println(" Saldo empresa insuficiente ");
     }

        System.out.printf("Saldo empresa = " + em.getSaldo());


    }



}
