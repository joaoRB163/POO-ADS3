package aula02;

public class Carro {

    String marca;
    String modelo;
    int ano;
    double velocidade = 0;

    public void Acelerar(double delta){
        this.velocidade += delta;
    }
    public void Frear(double delta){
        if((this.velocidade-delta) < 0){
            this.velocidade = 0;
        } else {
            this.velocidade -=delta;
        }
    }
}
