package classes;

public class Passageiro extends Pessoa {
    //atributos
    private int codigoCliente;

    //construtor
    public Passageiro(String nome, String cpf) {
        super(nome, cpf);
    }

    //getters e setters
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }



}
