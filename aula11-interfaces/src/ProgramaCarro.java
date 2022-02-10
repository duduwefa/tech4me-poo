import java.util.InputMismatchException;

import classes.*;
import exceptions.PlacaInvalidaException;
import interfaces.Acelerador;

public class ProgramaCarro {
    public static void main(String[] args) {
        
        /* Acelerador[] aceleradores = new Acelerador[3]; 
        Motorista m1 = new Motorista(123, "ABDKSAJ12");


        try {
            aceleradores[0] = new Carro("ABC1234", 123112312, m1);
            aceleradores[1] = new Carro("XYZ5678", 2983982, new Motorista(1235, "khsd"));
            aceleradores[2] = m1;
        } catch (PlacaInvalidaException e) {
            e.getMessage();
        }

        for (Acelerador a : aceleradores) {
            System.out.printf("Chamada do metodo em objeto do tipo %s", a.getClass().getSimpleName());
            System.out.printf(" - Velocidade atual: %d\n", a.acelerar());
        } */

        Autenticador aut = new Autenticador();

        //Testar a entrada de um motorista
        Motorista m1 = new Motorista(123, "AAJSDHA");
        m1.setCpf("123");
        m1.setMatricula(321);
        //cpf-habilitacao : 123-321

        if(aut.autenticar(m1)) {
            System.out.println("O ACESSO FOI AUTORIZADO!");
        } else {
            System.out.println("ACESSO NEGADO!!");
        }

        

    }
}
