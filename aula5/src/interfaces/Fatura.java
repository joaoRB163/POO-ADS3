package interfaces;

public class Fatura implements Pagavel {

    private double valorBase;

    public Fatura(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    // implementação do método gerarPagamento da interface Pagavel
    @Override
    public double gerarPagamento() {
        return this.valorBase * 1.2;
    }
    
}
