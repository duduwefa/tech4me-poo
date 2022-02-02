package classes;

public class Passageiro extends Pessoa {
    //atributos
    private int codigoCliente;

    //getters e setters
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String cumprimentar() {
        return "Olá, motorista!";
    }



}
