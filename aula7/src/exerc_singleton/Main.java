package exerc_singleton;

public class Main {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstance();
        Configuracao config2 = Configuracao.getInstance();
        
        config1.setNomeApp("Config1");
        config1.setVersao("1.0");
        config1.setIdioma("Português");

        System.out.println("Instancia 1:");
        System.out.println("Nome: " + config1.getNomeApp());
        System.out.println("Versão: " + config1.getVersao());
        System.out.println("Idioma: " + config1.getIdioma());

        System.out.println("================================");
        
        config2.setNomeApp("Config2");
        config2.setVersao("2.0");
        config2.setIdioma("Inglês");

        System.out.println("Instancia 1 alterada pela instancia 2:");
        System.out.println("Nome: " + config1.getNomeApp());
        System.out.println("Versão: " + config1.getVersao());
        System.out.println("Idioma: " + config1.getIdioma());

    }
}
