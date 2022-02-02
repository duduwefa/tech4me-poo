import fatura.Fatura;

public class App {
    public static void main(String[] args) throws Exception {
        
        Fatura f1 = new Fatura();

        f1.setDescricao("Computador Positivo 8gb RAM 500GB SSD");
        f1.setNumero("A123");
        f1.setQuant_item(10);
        f1.setPreco_item(1399.99);

        double totalFatura = f1.getTotalFatura();
        String totalFatura2 = Double.toString(totalFatura);
        String format = String.format("%,d", totalFatura2);

        System.out.printf("Valor total fatura (construtor vazio): %,d", totalFatura);

        Fatura f2 = new Fatura("B123", "Impressora EPOSON E305", 6, 790.90);

        System.out.println();

    }
}
