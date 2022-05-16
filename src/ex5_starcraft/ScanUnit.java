package ex5_starcraft;

import java.util.Scanner;

public class ScanUnit {
    private String name;
    private int offensePoint;
    private int defensePoint;
    private int hp;
    public void scanUnitInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 : ");
        this.name = scanner.nextLine();

        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 : (Ex 50) ");
        this.offensePoint = scanner.nextInt();

        System.out.print("[시스템] 유닛 [방어력] 을 입력해 주세요 : (Ex 1) ");
        this .defensePoint = scanner.nextInt();

        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 : (Ex 100) ");
        this.hp = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public int getOffensePoint() {
        return offensePoint;
    }

    public int getDefensePoint() {
        return defensePoint;
    }

    public int getHp() {
        return hp;
    }
}
