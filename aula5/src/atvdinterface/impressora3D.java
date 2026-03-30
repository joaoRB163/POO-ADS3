package atvdinterface;

public class impressora3D implements Operavel {

    private String Modelo;

    public impressora3D(String modelo) {
        Modelo = modelo;
    }

    public String getModelo() {
        return Modelo;
    }

    @Override
    public void desligar() {
        System.out.println("A impressora 3d " + this.Modelo + " foi desligada!");
    }

    @Override
    public void ligar() {
        System.out.println("A impressora 3d " + this.Modelo + " está ligada");
    }

    @Override
    public void operando() {
        System.out.println("A impressora 3d " + this.Modelo + " está sendo operada");
    }

}
