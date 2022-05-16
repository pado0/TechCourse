package ex5_starcraft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* 게임 시작 */
        System.out.println("[안내] TRPG 스타크래프트 시작합니다.");

        /* 스캐너 세팅 */
        ScanUnit scanUnit = new ScanUnit();

        /* 내 유닛 정보 입력 및 출력 */
        System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");
        scanUnit.scanUnitInfo(); // 정보입력함수
        Unit myUnit = new Unit(scanUnit.getName(),
                                scanUnit.getOffensePoint(),
                                scanUnit.getDefensePoint(),
                                scanUnit.getHp()); // 생성자로 정보 세팅
        myUnit.printUnitInfo(); // 유닛 정보 출력함수
        System.out.println("========================================");

        /* 상대 유닛 정보 입력 및 출력 */
        System.out.println("[안내] 상대 유닛 정보를 입력해 주세요.");
        scanUnit.scanUnitInfo(); // 정보입력함수
        Unit enemyUnit = new Unit(scanUnit.getName(),
                                    scanUnit.getOffensePoint(),
                                    scanUnit.getDefensePoint(),
                                    scanUnit.getHp()); // 생성자로 정보 세팅
        enemyUnit.printUnitInfo(); // 유닛 정보 출력함수
        System.out.println("========================================");

        /* 상대 유닛 세팅 */
        myUnit.setEnemy(enemyUnit);

        /* 상대 유닛 공격 시작 */
        myUnit.attackLoop();

        /* 공격 완료시 게임 종료 및 유닛 삭제 */
        myUnit.printUnitDeleted();
    }
}
