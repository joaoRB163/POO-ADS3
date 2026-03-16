package abstracao;

public abstract class Animal {

    private String raca;

    public Animal(String raca) {
        this.raca = raca;
    }

    public abstract void emitirSom(); 
    
    public String getraca() {
        return raca;
    }

    public void setraca(String raca) {
        this.raca = raca;
    }

}
