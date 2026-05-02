package exerc_decorator;

public class Chocolate extends TextDecorator {

    private double preco;

    public Chocolate(Bebida bebida) {
        super(bebida);
        this.preco = 1.5;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Chocolate";
    }

    @Override
    public String getPreco() {
        return bebida.getPreco() + " + R$" + this.preco;
    }
    
}
