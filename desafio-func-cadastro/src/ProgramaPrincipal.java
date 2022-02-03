import java.util.Scanner;

import funcionario.Funcionario;

public class ProgramaPrincipal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);

        int qtdFuncionarios;
        int cont = 0;
        double somaSalario = 0;

        System.out.println("Informe a quantidade de funcionários que deseja cadastrar:");
        qtdFuncionarios = ler.nextInt();

        do {

            Funcionario f = new Funcionario();

            System.out.print("Matricula: ");
            f.setMat(ler.nextInt()); 
            ler.nextLine();

            System.out.print("Nome: ");
            f.setNome(ler.nextLine());

            System.out.print("Salario: ");
            double salario = ler.nextDouble();
            f.setSalario(salario);
            ler.nextLine();

            somaSalario += salario;

            cont++;

        } while(cont < qtdFuncionarios);

        System.out.println("\n\nMédia de salário" + (somaSalario/qtdFuncionarios));

        ler.close();

    }
}
