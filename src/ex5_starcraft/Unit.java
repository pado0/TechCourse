package ex5_starcraft;

// 이름 / 공격력 / 방어력 / 체력
public class Unit {
    private String name;
    private int offensePoint;
    private int defensePoint;
    private int hp;
    private Unit enemy;

    public Unit(String name, int offensePoint, int defensePoint, int hp) {
        this.name = name;
        this.offensePoint = offensePoint;
        this.defensePoint = defensePoint;
        this.hp = hp;
    }

    // getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOffensePoint() {
        return offensePoint;
    }

    public void setOffensePoint(int offensePoint) {
        this.offensePoint = offensePoint;
    }

    public int getDefensePoint() {
        return defensePoint;
    }

    public void setDefensePoint(int defensePoint) {
        this.defensePoint = defensePoint;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Unit getEnemy() {
        return enemy;
    }

    public void setEnemy(Unit enemy) {
        this.enemy = enemy;
    }

    /* 행동 수행 */
    // 공격 시작함수
    public void attackLoop() {
        while (true) {
            System.out.println("----------------------------------------");
            if (this.enemy.getHp() > 0) this.attack();
            else {
                System.out.println("[안내] 더 이상 공격할 수 없습니다.");
                break;
            }
        }
    }

    // 공격 세팅 함수
    public void attack() {
        System.out.println("[안내] [" + this.name + "] 유닛이 [공격] 하였습니다.");
        int hp = this.enemy.getHp();
        int leftHp = hp - this.offensePoint;

        if (leftHp >= 0) this.enemy.setHp(leftHp);
        else {
            leftHp = 0;
            this.enemy.setHp(0);
        }
        // 상대 유닛 체력 출력
        printLeftHp(leftHp);
    }


    /* 정보출력 */
    // 상대방의 남은 체력 출력
    public void printLeftHp(int hp) {
        System.out.println("[안내] 상대 유닛 " + this.enemy.getName()
                            + "의 남은 [체력] 은 " + this.enemy.getHp() + " 입니다.");
    }

    // 유닛 정보 출력
    public void printUnitInfo() {
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.println("[안내]" + this.name + " 유닛이 게임에 참여하였습니다.");
        System.out.println("[공격력] : " + this.offensePoint);
        System.out.println("[방어력] : " + this.defensePoint);
        System.out.println("[체력] : " + this.hp);
    }

    // 유닛 삭제 출력
    public void printUnitDeleted() {
        System.out.println("\n[안내] 상대 유닛이 제거되었습니다.");
    }
}
