import conta.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        
        //instanciar uma classe
        Conta contaBancaria;
        contaBancaria = new Conta();

        //setar nome
        contaBancaria.setNome("Eduardo");

        //setar saldo inicial
        contaBancaria.setSaldo(10.0);
        System.out.println("Saldo atual é " + contaBancaria.getSaldo());
        System.out.println("\n");
        //depositar um novo valor
        contaBancaria.depositar(10.0);
        System.out.println("Saldo atual é " + contaBancaria.getSaldo());
        System.out.println("\n");
        //imprimir titular da conta
        System.out.println("O titular da conta é " + contaBancaria.getNome());

    }
}
