package atvdinterface;

public class Retroescavadeira implements Operavel {
    
    private String Modelo;

    public Retroescavadeira(String modelo) {
        Modelo = modelo;
    }

    public String getModelo() {
        return Modelo;
    }

    
    @Override
    public void desligar() {
        System.out.println("A Retroescavadeira " + this.Modelo + " foi desligada!");
    }

    @Override
    public void ligar() {
        System.out.println("A Retroescavadeira " + this.Modelo + " está ligada");
    }

    @Override
    public void operando() {
        System.out.println("A Retroescavadeira " + this.Modelo + " está sendo operada");
    }        
}
