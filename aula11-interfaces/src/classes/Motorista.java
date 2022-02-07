package classes;

public class Motorista extends Pessoa {
    //atributos
    private int matricula;
    private String habilitacao;
    private Carro veiculoAtual;

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
    

    
}
