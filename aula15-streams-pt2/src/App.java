import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.text.DateFormatter;

import classes.Motorista;
import classes.Passageiro;
import classes.Pessoa;
import classes.Viagem;
import comparadores.ComparadorCpf;
import predicados.Contem3Predicado;

public class App {
    public static void main(String[] args) throws Exception {
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Viagem> viagens = obterDados();

        Map<LocalDate, List<Viagem>> viagensData = viagens.stream()
        .collect(Collectors.groupingBy(Viagem::getData));

        viagensData.entrySet().forEach(item -> System.out.printf("\nDia %s: Viagens:\n %s \n", item.getKey().format(df), item.getValue()));
        
        System.out.println("---------");

        System.out.println(Arrays.asList(viagensData));

        System.out.println("---------");

        System.out.println(Collections.singletonList(viagensData));

        System.out.println("Valores medios---------");

        Map<LocalDate, Double> valoresMedios = viagens.stream()
        .collect(Collectors.groupingBy(Viagem::getData, Collectors.averagingDouble(Viagem::getValor)));

        valoresMedios.entrySet().forEach(item -> System.out.printf("\nDia %s: - Valor médio do ticker: %s \n", item.getKey().format(df), item.getValue()));

    }

    private static List<Viagem> obterDados() {
        List<Viagem> viagens = new ArrayList<>();

        viagens.add(new Viagem(LocalDate.parse("2022-02-12"), new Motorista("Motorista 1", "56789", 60), new Passageiro("Passageiro 1", "123456", 20), 14));
        viagens.add(new Viagem(LocalDate.parse("2022-02-13"), new Motorista("Motorista 1", "56789", 60), new Passageiro("Passageiro 1", "123456", 20), 70));
        viagens.add(new Viagem(LocalDate.parse("2022-02-13"), new Motorista("Motorista 3", "98765", 15), new Passageiro("Passageiro 1", "123456", 20), 14));
        viagens.add(new Viagem(LocalDate.parse("2022-02-14"), new Motorista("Motorista 3", "98765", 15), new Passageiro("Passageiro 2", "654321", 50), 6));
        viagens.add(new Viagem(LocalDate.parse("2022-02-14"), new Motorista("Motorista 2", "15263", 60), new Passageiro("Passageiro 2", "654321", 50), 43));
        viagens.add(new Viagem(LocalDate.parse("2022-02-14"), new Motorista("Motorista 2", "15263", 60), new Passageiro("Passageiro 2", "654321", 50), 22));

        return viagens;
    }
}
