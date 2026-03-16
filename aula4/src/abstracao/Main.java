package abstracao;

public class Main {
    public static void main(String[] args) {
        
        Gato gato = new Gato("Laranja");
        Cachorro cachorro = new Cachorro("Golden Retriever");
        Lobo leao = new Lobo("Africano");

        Animal[] animais = new Animal[]{gato, cachorro, leao};

        for (Animal animal : animais) {
            animal.emitirSom();

            if(animal instanceof Cachorro ){
                ((Cachorro)animal).abanarRabo(); // downcast
            } else  if (animal instanceof Lobo){
                ((Lobo)animal).pedir();
            }
        }
    }
}
