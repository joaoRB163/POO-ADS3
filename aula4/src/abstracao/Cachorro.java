package abstracao;

public class Cachorro extends Animal{

    public Cachorro(String raca) {
        super(raca);
    }
    
    @Override
    public void emitirSom() {   
        System.out.println("Au au");
    }

    public void abanarRabo(){
        System.out.println(getraca() + " abanou o rabo");
    }
}
