package designPattern;

import java.util.Objects;

public class ProxyMailSender implements MailSender {

    private MailSender mailSender = null;

    public ProxyMailSender(){ }

    @Override
    public void send(String message) {
        if (Objects.isNull(mailSender)) {
            mailSender = new RealMailSender();
        }

        System.out.println("proxy before process");

        // main에서는 real 대신 프록시를 호출
        // 프록시가 Real을 대신 호출
        // real class를 참조. real 클래스의 앞뒤로 처리 가능
        mailSender.send(message); // real mail sender가 호출됨.

        System.out.println("proxy after process");
    }
}
