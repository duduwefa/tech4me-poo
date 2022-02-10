import java.util.ArrayList;

import classes.Motorista;
import classes.Passageiro;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Passageiro("Passageiro 1", "123123"));
        pessoas.add(new Passageiro("Passageiro 2", "456654"));
        pessoas.add(new Motorista("Motorista 1", "123456"));

        System.out.println("Total de pessoas é " + pessoas.size());

        if(pessoas.contains(new Motorista("Motorista 2", "123456"))) {
            System.out.println("Já existe pessoa com esse CPF!!");
        } else {
            System.out.println("Pessoa não encontrada!!!");
        }

        Pessoa p2 = pessoas.remove(0);
        System.out.printf("A pessoa %s foi removida! Tamanho atual é %d \n", p2.getNome(), pessoas.size());

        ArrayList<Pessoa> novasPessoas = new ArrayList<>();

        pessoas.add(new Motorista("Motorista 3", "123123"));
        pessoas.add(new Passageiro("Passageiro 3", "456654"));

        pessoas.addAll(novasPessoas);

        System.out.println("Total de pessoas é " + pessoas.size());

        System.out.println("Pessoas da lista: \n");

        for (Pessoa p : pessoas) {
            System.out.printf("Nome: %s - CPF: %s - Tipo: %s\n", p.getNome(), p.getCpf(), p.getClass().getSimpleName());
        }

    }
}
