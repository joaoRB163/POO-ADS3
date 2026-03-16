package abstracao;

public class Main {
    public static void main(String[] args) {
        
        Gato gato = new Gato("Laranja");
        Cachorro cachorro = new Cachorro("Golden Retriever");
        Leao leao = new Leao("Africano");

        Animal[] animais = new Animal[]{gato, cachorro, leao};

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
