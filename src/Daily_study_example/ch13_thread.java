package Daily_study_example;

import javax.swing.*;

public class ch13_thread{
    static long startTime = System.currentTimeMillis();

    public static void main(String[] args) {

        ThreadTest test = new ThreadTest();
        Thread thread = new Thread(test);

        // 새로운 쓰레드 실행
        thread.start();

        // 메인 쓰레드에서는 입력 받기
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은 " + input + " 입니다.");

    }


    static class ThreadTest implements Runnable{
        @Override
        public void run() {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        }
    }

}
