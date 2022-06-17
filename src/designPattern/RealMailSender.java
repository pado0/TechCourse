package designPattern;

public class RealMailSender implements MailSender{
    @Override
    public void send(String message) {
        System.out.println("real send: " + message);
    }
}
