package abstracao;

public class Lobo extends Animal{

    public Lobo(String raca) {
        super(raca);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("AUUUUUUUUUUUUUUUUU");
    }

    public void pidao(){
        System.out.println("MIM DÊ PAPAI");
    }
}
