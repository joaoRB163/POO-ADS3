package decorator;

// Decorador para aplicar formatação em itálico ao texto
public class Italico extends TextoDecorator {
    // Construtor que recebe um objeto do tipo Texto para decorar
    public Italico(Texto t) {
        super(t);
    }

    // Sobrescreve o método para adicionar a formatação em itálico
    @Override
    public String getConteudo() {
        
        // busca o conteúdo do texto original e adiciona a formatação em itálico
        return "_" + texto.getConteudo() + "_";
    }
}