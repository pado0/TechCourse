package designPattern;

public class ProxyPattern {
    public static void main(String[] args) {
        MailSender mailSender = new ProxyMailSender();
        //MailSender realSender = new RealMailSender();

        mailSender.send("hello");
        //System.out.println("----");
        //realSender.send("real hello");
    }
}
