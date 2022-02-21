package classes;

public class Motorista extends Pessoa {
    //atributos
    private int matricula;
    private String habilitacao;

    //construtor
    public Motorista(String nome, String cpf) {
        super(nome, cpf);
    }

    public Motorista(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
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

    
}
