package ex4_cctransfer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String ADMIN_ID = "admin";
        final String ADMIN_PW = "0000";
        String[] bad_words = {"킹", "시발", "꺼저", "미친"};
        String[] good_words = {"열", "사랑", "용기", "희망"};

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("[시스템] 유튜브 계정의 아이디를 입력하세요 {Ex - admin} : ");
            String id = scanner.nextLine();
            System.out.print("[시스템] 유튜브 계정의 비밀번호를 입력하세요 {Ex - 0000} : ");
            String pw = scanner.nextLine();

            if (!pw.equals(ADMIN_PW) || !id.equals(ADMIN_ID)) {
                System.out.println("[경고] 유튜브 계정의 아이디 및 비밀번호를 다시 확인해 주세요.");
                continue;
            }
            break;
        }

        System.out.println("[안내] 안녕하세요 " + ADMIN_ID +"님.");
        System.out.println("[안내] 유튜브 영상의 자막을 생성해 주세요.");
        String cc = scanner.nextLine();

        System.out.println("========================================");
        System.out.println("[알림] 프로그램의 금칙어 리스트입니다.");
        System.out.println("[킹, 시발, 꺼저, 미친]");
        System.out.println("========================================");
        System.out.println("[알림] 자막 순화 프로그램 결과입니다.");

        StringBuilder stringBuilder = new StringBuilder();

        // 비속어 후보 단어 하나하나 순회
        for(int i=0 ; i<bad_words.length ; i++){
            //하나하나 좋은단어로 치환해준다.
            cc = cc.replaceAll(bad_words[i], good_words[i]);
        }

        System.out.println(">>> " + cc);
        System.out.println("[안내] 프로그램을 종료합니다.");

    }
}
