import java.util.InputMismatchException;

import carro.*;

public class ProgramaCarro {
    public static void main(String[] args) throws Exception {
        
        //criar instância do objeto carro
        Carro carro; 
        carro = new Carro();

        //dar valores aos seus atributos
        try {
            //trecho de código que pode vir a lançar uma exceção
            carro.setPlaca(null);
        } catch(InputMismatchException ex) {
            //ação a ser tomada quando eu tenho um problema de incompatibilidade de entrada
            System.out.println(ex.getMessage());
            System.out.println("Programa encerrado!");
            return;
        } catch(NullPointerException ex) {
            //ação a ser tomada quando eu tenho um problema de apontamento nulo
            System.out.println(ex.getMessage());
            System.out.println("O programa continuará com a placa ABC1234");
            carro.setPlaca("ABC1234");
        } 

        
        
        carro.setNumChassi(8927139);

        //imprimir o resultado
        System.out.println("Placa do carro cadastrado é " + carro.getPlaca());

    }
}
