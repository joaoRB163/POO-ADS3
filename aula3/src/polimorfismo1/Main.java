package polimorfismo1;

public class Main {
    public static void main(String[] args) {
        Personagem[] personagens = new Personagem[4];
        personagens[0] = new Arqueiro();
        personagens[1] = new Mago();
        personagens[2] = new Guerreiro();
        personagens[3] = new Personagem();

        for (Personagem personagem : personagens) {
            personagem.atacar();
        }
    }
}
