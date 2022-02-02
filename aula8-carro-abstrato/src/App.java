import java.util.Scanner;

import classes.Motorista;
import classes.Passageiro;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);
        int param = 5;
        Motorista[] vetorMot = new Motorista[param];

        //instaciar = criar um objeto a partir de um modelo
        // Pessoa p = new Pessoa();

        for(int i = 0; i < param; i++) {
            //lendo um nome
            String nome = ler.nextLine();
            //instanciando um motorista
            Motorista m = new Motorista();
            //setar um nome
            m.setNome(nome);
            //colocando o novo motorista M no vetor de motoristas
            vetorMot[i] = m;
            //m = [0]Roberto, [1]Alice, [2]Pedro, 
        }

        System.out.println("-------------");
        System.out.println("Nomes: \n");
        for(int i = 0; i < param; i++) {
            System.out.println(vetorMot[i].getNome());
        }

        //1 - entrada (ler um valor)
        //2 - comparar (estrutura de comparação)
        //3 - repetir

        //System.out.printf("HABILITACAO DO MOTORISTA %s É: %s", m1.getNome(), m1.getHabilitacao());

        //-----
        System.out.println("-------------");
        Motorista m2 = new Motorista();
        Passageiro p2 = new Passageiro();

        m2.setNome("Edu");
        p2.setNome("Dan");

        System.out.println(m2.cumprimentar());
        System.out.println(p2.cumprimentar());

    }
}
