package ex10_kakaoriding_strategy;

public class RacingCarLevel2 implements RacingCar {
    protected int ctrlCount = 0;
    protected int distance; //총 누적 거리
    static final int DEFAULT_SPEED = 10;
    static final int CTRL_TIME = 1;
    static final String kmh = "km/h";
    protected String userName;
    public String getUserName() {
        return userName;
    }
    /*
     * 가속할 때 default 시간은 control 1회당 1초이고,
     * default 속력은 10km/h이다.
     *
     * 매 게임 컨트롤 후 누적 컨트롤 횟수와 컨트롤 실행 별 주행 거리를 출력해야 한다.
     * */

    //        void start();  //게임시작  - 문구 출력
    @Override
    public void start() {
        System.out.printf("%s님, 레벨업을 진행합니다.\n", this.userName);
    }

    //        void accelerate(); //가속
    @Override
    public void accelerate() {
        System.out.println("-".repeat(50));
        System.out.println("[가속]");
        System.out.println("| * " + "컨트롤 횟수: " + ++ctrlCount);
        int accDistance = CTRL_TIME * (DEFAULT_SPEED * 2);
        distance += accDistance;
        System.out.println("| * " + "주행 거리: " + distance + kmh);
        System.out.println("-".repeat(50));
    }
    //V1의 accelerate_booster()를 override
    @Override
    public void accelerate_booster(int speed_lv) {
        System.out.println("-".repeat(50));
        System.out.printf("[부스터 가속 %s 단계]", speed_lv);
        System.out.println("| * " + "컨트롤 횟수: " + ++ctrlCount);
        int accDistance = CTRL_TIME * (DEFAULT_SPEED * 2) * (speed_lv + 1);
        distance += accDistance;
        System.out.println("| * " + "주행 거리: " + distance + kmh);
        System.out.println("-".repeat(50));
    }

    //        void drift(); : 왼쪽 오른쪽 회전 방향에 따라 절반의 속도로 이동
    @Override
    public void drift() {
        System.out.println("-".repeat(50));
        System.out.println("[방향 회전]");
        while (true) {
            System.out.println("| * 회전 방향 입력 [<][>]: ");
            String direction = Main.sc.nextLine();
            if (direction.equals("<")) {
                System.out.println("| * 왼쪽으로 회전합니다.");
            } else if (direction.equals(">")) {
                System.out.println("| * 오른쪽으로 회전합니다.");
            } else {
                System.out.println("| * 이동할 수 있는 방향이 아닙니다.");
                continue;
            }
            break;
        }
        System.out.println("| * " + "컨트롤 횟수: " + ++ctrlCount);
        int driftSpeed = DEFAULT_SPEED / 2;
        int accDistance = CTRL_TIME * driftSpeed;
        distance += accDistance;
        System.out.println("| * " + "주행 거리: " + distance + kmh);
        System.out.println("-".repeat(50));

    }

    //        void decelerateAs(); //절반의 속도로 후진
    @Override
    public void decelerateAs() {
        System.out.println("-".repeat(50));
        System.out.printf("[후진]\n");
        System.out.println("| * " + "컨트롤 횟수: " + ++ctrlCount);
        int accDistance = CTRL_TIME * (DEFAULT_SPEED / 2);
        distance -= accDistance;
        System.out.println("| * " + "주행 거리: " + distance + kmh);
        System.out.println("-".repeat(50));
    }
}
