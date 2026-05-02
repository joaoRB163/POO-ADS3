package exerc_strategy;

public class Carrinho {

    EstrategiaDesconto estrategiaDesconto;
    double valorTotal;

    public Carrinho(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double calcularValorFinal() {
        return estrategiaDesconto.calcularDesconto(valorTotal);
    }

    public void setEstrategiaDesconto(EstrategiaDesconto estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
