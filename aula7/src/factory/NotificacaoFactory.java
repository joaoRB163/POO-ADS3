package factory;

// Fábrica de notificações
public class NotificacaoFactory {

    // Método de fábrica para criar notificações
    public static Notificacao criar(String tipo) {
        // Lógica para decidir qual tipo de notificação criar
        switch (tipo.toLowerCase()) {
            case "email":
                return new EmailNotificacao(); // retorna um tipo de notificação específico
            case "sms":
                return new SmsNotificacao();
            case "push":
                return new PushNotificacao();
            default:
                throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        }
    }
}