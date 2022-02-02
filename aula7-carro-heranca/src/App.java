import java.util.Scanner;

import classes.Motorista;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);
        int param = 5;
        Motorista[] vetorMot = new Motorista[param];

        for(int i = 0; i < param; i++) {
            //lendo um nome
            String nome = ler.nextLine();
            //instanciando um motorista
            Motorista m = new Motorista();
            //setar um nome
            m.setNome(nome);
            //colocando o novo motorista M no vetor de motoristas
            vetorMot[i] = m;
        }

        System.out.println("-------------");
        System.out.println("Nomes: \n");
        for(int i = 0; i < param; i++) {
            System.out.println(vetorMot[i].getNome());
        }

        //System.out.printf("HABILITACAO DO MOTORISTA %s É: %s", m1.getNome(), m1.getHabilitacao());

    }
}
