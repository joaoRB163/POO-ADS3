package exerc_decorator;

public abstract class TextDecorator implements Bebida {
    
    protected Bebida bebida;

    public TextDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return this.bebida.getDescricao();
    }

    @Override
    public String getPreco() {
        return this.bebida.getPreco();
    }

}
