package exerc_decorator;

public class Leite extends TextDecorator {

    private double preco;

    public Leite(Bebida bebida) {
        super(bebida);
        this.preco = 1;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Leite";
    }

    @Override
    public String getPreco() {
        return bebida.getPreco() + " + R$" + this.preco;
    }
    
}
