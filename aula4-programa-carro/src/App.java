import carro.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        //criando objetos c1 e c2
        Carro c1, c2;

        //instanciando o objeto c1 com um Construtor vazio
        c1 = new Carro();

        c1.setPlaca("ABC1234");
        c1.setNumChassi(123456);
        
        //instanciando o objeto c2 com um Construtor Personalizado
        c2 = new Carro("XYZ5678", 56778);

        // c2.setPlaca();

        System.out.println("Placa do carro 1: " + c1.getPlaca());
        System.out.println("Placa do carro 2: " + c2.getPlaca());
        System.out.println("------------------------------------");
        Carro c3;

        c3 = new Carro("EFG0987", 198273);

        System.out.println("Velocidade atual do carro: " + c3.getVelocidadeAtual());

        // c3.acelerar();

        // System.out.println("Velocidade atual do carro: " + c3.getVelocidadeAtual());

        for (int i = 0; i < 10; i++) {
             c3.acelerar();
        }

        System.out.println("Velocidade atual do carro sem sobrecarga: " + c3.getVelocidadeAtual());

        c3.acelerar(50);

        System.out.println("Velocidade atual do carro com sobrecarga: " + c3.getVelocidadeAtual());
    }
}
