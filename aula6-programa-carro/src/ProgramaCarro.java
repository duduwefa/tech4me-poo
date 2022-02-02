import javax.swing.plaf.synth.SynthSplitPaneUI;

import associacao.Carro;
import associacao.Motorista;

public class ProgramaCarro {
    public static void main(String[] args) throws Exception {
        
        Carro c1 = new Carro("ABC1234", 12345678);
        Motorista m1 = new Motorista(c1);

        System.out.println("Velocidade atual do carro: " + c1.getVelocidadeAtual());
        System.out.println("PASSAGEIRO: MOTORISTA, Acelera o carro até 50km/h");
        System.out.println("MOTORISTA: É pra já!");
        m1.acelerar(50);

        System.out.println("Velocidade atual do carro: " + c1.getVelocidadeAtual());

        Motorista m2 = new Motorista("Edu", 1234);
        Carro c2 = new Carro("XYZ5678", 21345678, m2);

        System.out.println("Velocidade atual do carro: " + c2.getVelocidadeAtual());
        System.out.println("PASSAGEIRO: MOTORISTA, Acelera o carro até 100km/h");
        System.out.println("MOTORISTA: É pra já!");
        c2.getMotorista().acelerar(100);

        System.out.println("Velocidade atual do carro: " + c2.getVelocidadeAtual());

    }
}
