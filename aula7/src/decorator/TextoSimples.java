package decorator;

// Representa o texto simples, sem formatação
public class TextoSimples implements Texto {
    private String conteudo;

    // Construtor que inicializa o conteúdo do texto simples
    public TextoSimples(String c) {
        this.conteudo = c;
    }

    // Retorna o conteúdo do texto simples
    @Override
    public String getConteudo() {
        return conteudo;
    }
}