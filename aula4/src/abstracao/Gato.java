package abstracao;

public class Gato extends Animal{

    public Gato(String raca) {
        super(raca);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
