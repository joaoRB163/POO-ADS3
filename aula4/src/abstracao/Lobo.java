package abstracao;

public class Lobo extends Animal{

    public Lobo(String raca) {
        super(raca);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("AUUUUUUUUUUUUUUUUU");
    }

    public void pedir(){
        System.out.println("MIM DÊ PAPAI\r\n"+
                        "BABY, I'M PREYING ON YOU TONIGHT\r\n" + 
                        "HUNT YOU DOWN EAT YOU ALIVE\r\n" + 
                        "JUST LIKE ANIMALS\r\n" + 
                        "ANIMALS\r\n" +
                        "LIKE ANIMALS-MALS");
    }
}
