package abstracao;

public class Leao extends Animal{

    public Leao(String raca) {
        super(raca);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Raaawwwn");
    }
}
