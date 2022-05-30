package ex10_kakaoriding;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        RacingCar car = new RacingCar();
        car.start();
        String userName = car.getUserName();
        car.accelerate();
        car.accelerate_booster(2);
        car.drift();
        car.decelerateAs();

        RacingCarV2 upgradedCar = new RacingCarV2();
        upgradedCar.start(userName);
        upgradedCar.accelerate();
        upgradedCar.accelerate_booster(2);
        upgradedCar.drift();
        upgradedCar.decelerateAs();
        sc.close();

        Car car1 = new Car();
        //car.start(racingCar2Start());
    }

    public static IRacing racingCarStart(){
        return new RacingCar();
    }

    public static IRacing racingCar2Start(){
        return new RacingCarV2();
    }
}
