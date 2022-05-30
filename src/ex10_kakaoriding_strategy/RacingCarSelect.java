package ex10_kakaoriding_strategy;

public class RacingCarSelect {

    public void start(RacingCar racingCar){
        racingCar.start();
    }

    public void accelerate(RacingCar racingCar){
        racingCar.accelerate();
    }

    public void accelerate_booster(RacingCar racingCar, int speed_lv){
        racingCar.accelerate_booster(speed_lv);
    }

    public void drift(RacingCar racingCar){
        racingCar.drift();
    }

    public void decelerateAs(RacingCar racingCar){
        racingCar.decelerateAs();
    }
}
