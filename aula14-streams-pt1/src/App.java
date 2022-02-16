import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import classes.Motorista;
import classes.Passageiro;
import classes.Pessoa;
import comparadores.ComparadorCpf;
import predicados.Contem3Predicado;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Passageiro("Passageiro 1", "123456", 20));
        pessoas.add(new Passageiro("Passageiro 2", "654321", 50));
        pessoas.add(new Motorista("Motorista 1", "56789", 60));
        pessoas.add(new Motorista("Motorista 3", "98765", 15));
        pessoas.add(new Motorista("Motorista 2", "15263", 60));

        IntSummaryStatistics resumo = pessoas.stream()
        .collect(Collectors.summarizingInt(Pessoa::getIdade));

        Double media = pessoas.stream()
        .collect(Collectors.summarizingInt(Pessoa::getIdade)).getAverage();

        Double media2 = pessoas.stream()
        .filter(p -> p instanceof Pessoa)
        .collect(Collectors.averagingInt(Pessoa::getIdade));

        System.out.println(media2);

        /* pessoas.add(new Passageiro("Passageiro 1", "123456"));
        pessoas.add(new Passageiro("Passageiro 2", "654321"));
        pessoas.add(new Motorista("Motorista 1", "56789"));
        pessoas.add(new Motorista("Motorista 3", "98765"));
        pessoas.add(new Motorista("Motorista 2", "15263")); */

        /* pessoas.stream()
        .filter(p -> p instanceof Motorista && p.getNome().contains("2"))
        .forEach(System.out::println); */

        /* List<Pessoa> pessoasFiltro = pessoas.stream()
        .filter(p -> p instanceof Motorista && p.getNome().contains("2"))
        .collect(Collectors.toList());

        pessoasFiltro.forEach(System.out::println); */

        /* List<Pessoa> pessoasFiltro = pessoas.stream()
        .filter(p -> p instanceof Passageiro)
        .sorted(Comparator.comparing(Pessoa::getCpf))
        .collect(Collectors.toList());

        pessoasFiltro.forEach(System.out::println); */

        /* System.out.println("Sem ordenação \n");

        for (Pessoa p : pessoas) {
            System.out.printf("%s-%s\n", p.getNome(), p.getCpf());
        }

        // pessoas.removeIf(new Contem3Predicado());
        pessoas.removeIf(p -> {
            boolean condicao = p.getNome().contains("3");
            return condicao;
        });
        
            pessoas.sort(new ComparadorCpf());
        System.out.println("Com ordenação \n");

        for (Pessoa p : pessoas) {
            System.out.printf("%s-%s\n", p.getNome(), p.getCpf());
        } */

        // pessoas.forEach(System.out::println);

    }
}
