package polimorfismo1;

public class Personagem {
    private int vida;

    public void atacar(){
        System.out.println("Personagem atacou!");
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
}