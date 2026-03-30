package atvdinterface;

public class Drone implements Operavel {

    private String Modelo;

    public Drone(String modelo) {
        Modelo = modelo;
    }

    public String getModelo() {
        return Modelo;
    }

    @Override
    public void desligar() {
        System.out.println("O Drone " + this.Modelo + " foi desligado!");
    }

    @Override
    public void ligar() {
        System.out.println("O Drone " + this.Modelo + " está ligado");
    }

    @Override
    public void operando() {
        System.out.println("O Drone " + this.Modelo + " está sendo operado");
    }

}
