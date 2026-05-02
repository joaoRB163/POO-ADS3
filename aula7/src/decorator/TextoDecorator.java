package decorator;

// Classe modelo para os decoradores com referência ao objeto Texto
public abstract class TextoDecorator implements Texto {
    protected Texto texto;

    // Construtor que recebe um objeto do tipo Texto para decorar
    public TextoDecorator(Texto t) {
        this.texto = t;
    }

    // Método padrão que retorna o conteúdo do texto original
    @Override
    public String getConteudo() {
        return texto.getConteudo();
    }
}
