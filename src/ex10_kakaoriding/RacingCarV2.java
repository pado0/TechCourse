package ex10_kakaoriding;

public class RacingCarV2 extends RacingCar{
    //V1의 start()를 override
    @Override
    public void start() {
        System.out.printf("%s님, 차량 업그레이드를 진행하였습니다.\n", userName);
    }

    public void start(String userName){
        this.userName = userName;
        start();
    }
    //V1의 accelerate()를 override
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
}
