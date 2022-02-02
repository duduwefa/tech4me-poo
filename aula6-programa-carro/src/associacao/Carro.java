package associacao;

import java.util.InputMismatchException;

public class Carro {
    private String letrasPlaca;
    private int numerosPlaca;
    // private String placa;
    private int numChassi;
    private int velocidadeAtual;
    private Motorista motorista;

    public Carro() {}

    public Carro(String placa, int numChassi) {
        setPlaca(placa);
        this.numChassi = numChassi;
    }

    public Carro(String placa, int numChassi, Motorista motorista) {
        this(motorista);
        setPlaca(placa);
        this.numChassi = numChassi;
    }

    public Carro(Motorista motorista) {
        this.motorista = motorista;
        motorista.setVeiculoAtual(this);
    }

    void acelerar() {
        velocidadeAtual++;
    }

    void acelerar(int limite) {
        for(int i = velocidadeAtual; i < limite; i++) {
            acelerar();
        }
    }

    boolean frear() {
        return false;
    }

    //Métodos get/set

    public String getPlaca() {
        if("ERRO!!".equals(letrasPlaca)) {
            return letrasPlaca;
        } else {
            return letrasPlaca + numerosPlaca;
        }
    }

    public void setPlaca(String placa /*ABC1234*/) {
        /* if(placa.length() == 7 && placa != null && placa.matches("[A-Z]{3}\\d{4}")) {
            this.letrasPlaca = placa.substring(0, 3);
            this.numerosPlaca = Integer.parseInt(placa.substring(3));
        } else {
            // this.letrasPlaca = "ERRO!!";
            throw new InputMismatchException("Os 4 últimos dígitos devem ser numéricos");
        } */

        if(placa == null) {
            throw new NullPointerException("O valor da placa não pode ser nulo");
        }

        if(placa.length() != 7) {
            throw new InputMismatchException("A placa tem que ter 7 caracteres");
        }

        if(!placa.matches("[A-Z]{3}\\d{4}")) {
            throw new InputMismatchException("A placa tem que ser composta por 3 letras e 4 numeros");
        }

        this.letrasPlaca = placa.substring(0, 3);
        this.numerosPlaca = Integer.parseInt(placa.substring(3));
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s %s", getPlaca(), getNumChassi());
    }
}
