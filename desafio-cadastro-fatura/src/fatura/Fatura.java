package fatura;

public class Fatura {
    
    private String numero;
    private String descricao;
    private int quant_item;
    private double preco_item;

    public Fatura () {}

    public Fatura (String numero, String descricao, int quant_item, double preco_item) {
        this.numero = numero;
        this.descricao = descricao;
        this.quant_item = quant_item;
        setPreco_item (preco_item);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuant_item() {
        return quant_item;
    }

    public void setQuant_item(int quant_item) {
        this.quant_item = quant_item;
    }

    public double getPreco_item() {
        return preco_item;
    }

    public void setPreco_item(double preco_item) {
        if(preco_item < 0.0)
            this.preco_item = 0.0;
        else    
            this.preco_item = preco_item;
    }

    public double getTotalFatura() {
        double totalFatura;
        totalFatura = getQuant_item() * getPreco_item();
        if (totalFatura < 0.0)
            return 0.0;

        return totalFatura;
    }

    public double getTotalFatura (double quant_item) {
        double totalFatura;
        totalFatura = quant_item * getPreco_item();
        if (totalFatura < 0.0)
            return 0.0;

        return totalFatura;
    }

}
