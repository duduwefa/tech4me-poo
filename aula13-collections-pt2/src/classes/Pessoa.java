package classes;

public class Pessoa implements Comparable<Pessoa> {
    
    //atributos
    private String nome;
    private String cpf;

    //construtor 
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object obj) {
        //criterio de igualdade
        boolean igual = false;

        if(obj != null && obj instanceof Pessoa) {
            if(this.cpf == ((Pessoa)obj).cpf) {
                igual = true;
            } else {
                igual = false;
            }
        }

        return igual;
    }

    @Override
    public int compareTo(Pessoa p) {
        return getNome().compareTo(p.getNome());
    }
    

}
