import java.util.ArrayList;

import classes.Motorista;
import classes.Passageiro;
import classes.Pessoa;
import comparadores.ComparadorCpf;
import predicados.Contem3Predicado;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Passageiro("Passageiro 1", "123456"));
        pessoas.add(new Passageiro("Passageiro 2", "654321"));
        pessoas.add(new Motorista("Motorista 1", "56789"));
        pessoas.add(new Motorista("Motorista 3", "98765"));
        pessoas.add(new Motorista("Motorista 2", "15263"));

        System.out.println("Sem ordenação \n");

        for (Pessoa p : pessoas) {
            System.out.printf("%s-%s\n", p.getNome(), p.getCpf());
        }

        // pessoas.removeIf(new Contem3Predicado());
        pessoas.removeIf(p -> p.getNome().contains("3"));
        pessoas.sort(new ComparadorCpf());
        System.out.println("Com ordenação \n");

        for (Pessoa p : pessoas) {
            System.out.printf("%s-%s\n", p.getNome(), p.getCpf());
        }

    }
}
