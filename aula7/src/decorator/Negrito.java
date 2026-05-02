package decorator;

// Decorador para aplicar formatação em negrito ao texto
public class Negrito extends TextoDecorator {
    // Construtor que recebe um objeto do tipo Texto para decorar
    public Negrito(Texto t) {
        super(t);
    }

    // Sobrescreve o método para adicionar a formatação em negrito
    @Override
    public String getConteudo() {

        // busca o conteúdo do texto original e adiciona a formatação em negrito
        return "**" + texto.getConteudo() + "**";
    }
}
