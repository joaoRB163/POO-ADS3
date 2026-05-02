package exerc_singleton;

public class Configuracao {

    private static Configuracao INSTANCE;
    private String nomeApp;
    private String versao;
    private String idioma;
    
    private Configuracao() {
    }

    public String getNomeApp() {
        return nomeApp;
    }

    public void setNomeApp(String nomeApp) {
        this.nomeApp = nomeApp;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public static Configuracao getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new Configuracao();
        }
        return INSTANCE;
    }

}
