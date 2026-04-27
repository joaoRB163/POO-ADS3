package singleton;

public class Main {

    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.log("Aplicação iniciada");
        log2.log("Usuário fez login");

        System.out.println(log1 == log2);
    }
}
