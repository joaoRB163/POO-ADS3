package abstracao;

public class Cachorro extends Animal{

    public Cachorro(String raca) {
        super(raca);
    }
    
    @Override
    public void emitirSom() {   
        System.out.println("Au au");
    }
}
