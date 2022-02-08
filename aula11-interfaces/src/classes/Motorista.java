package classes;

import interfaces.Acelerador;

public class Motorista extends Pessoa implements Acelerador {
    //atributos
    private int matricula;
    private String habilitacao;
    private Carro veiculoAtual;

    //construtores
    public Motorista(int matricula, String habilitacao) {
        this.matricula = matricula;
        this.habilitacao = habilitacao;
    }

    //getters e setters
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getHabilitacao() {
        return habilitacao;
    }
    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }
    public Carro getVeiculoAtual() {
        return veiculoAtual;
    }
    public void setVeiculoAtual(Carro veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    @Override
    public int acelerar() {
        return veiculoAtual.acelerar();
    }

    @Override
    public int acelerar(int limite) {
        return veiculoAtual.acelerar(limite);
    }
   
    
    

    
}
