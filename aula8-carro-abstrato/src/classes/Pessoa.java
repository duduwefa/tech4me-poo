package classes;

public abstract class Pessoa {
    
    //atributos
    private String nome;
    private String cpf;

    //construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {}

    //getters e setters
    public String getNome() {
        return nome;
    }
    
    public abstract void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract String cumprimentar();

    

}
