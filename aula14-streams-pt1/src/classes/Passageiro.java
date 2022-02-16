package classes;

public class Passageiro extends Pessoa {
    //atributos
    private int codigoCliente;

    //construtor
    public Passageiro(String nome, String cpf) {
        super(nome, cpf);
    }

    public Passageiro(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    //getters e setters
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }



}
