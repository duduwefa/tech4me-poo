package classes;

public class Motorista extends Pessoa {
    //atributos
    private int matricula;
    private String habilitacao;

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

    @Override
    public String cumprimentar() {
        return "Olá, passageiro!";
    }

    @Override
    public String cumprimentar(Pessoa outraPessoa) {
        // return String.format("Meu nome é %s e serei seu motorista nessa viagem!", getNome());
        String original = super.cumprimentar(outraPessoa);
        String complemento = " Meu nome é %s e serei seu motorista nessa viagem";
        return String.format(original + complemento, getNome());
    }

    
}
