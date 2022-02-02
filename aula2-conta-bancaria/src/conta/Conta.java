package conta;

public class Conta {
    private String nome;
    private double saldo;

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo = this.saldo + (valor * 1.10);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

    

}