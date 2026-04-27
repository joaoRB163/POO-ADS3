package factory;

public class NotificacaoFactory {
    public static Notificacao criar(String tipo) {
        switch (tipo.toLowerCase()) {
            case "email":
                return new EmailNotificacao();
            case "sms":
                return new SmsNotificacao();
            case "push":
                return new PushNotificacao();
            default:
                throw new IllegalArgumentException("Tipo desconhecido: " +
                        tipo);
        }
    }
}