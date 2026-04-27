package singleton;

public class Logger { 
    private static Logger instanciaUnica; 
 
    private Logger() { } 
 
    public static Logger getInstance() { 
        if (instanciaUnica == null) { 
            instanciaUnica = new Logger();
        } 
        return instanciaUnica; 
    } 
 
    public void log(String mensagem) { 
        System.out.println("[LOG] " + mensagem); 
    } 
}