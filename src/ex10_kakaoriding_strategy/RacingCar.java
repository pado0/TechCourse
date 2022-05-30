package ex10_kakaoriding_strategy;

public interface RacingCar {
    void start();
    void accelerate();
    void accelerate_booster(int speed_lv);
    void drift();
    void decelerateAs();
}
