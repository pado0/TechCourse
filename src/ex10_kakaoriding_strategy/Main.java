package ex10_kakaoriding_strategy;

import ex10_kakaoriding.RacingCar;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        RacingCarSelect racingCarSelect = new RacingCarSelect();

        racingCarSelect.start(selectRacingCarLevel1());
        racingCarSelect.accelerate(selectRacingCarLevel1());
        racingCarSelect.accelerate(selectRacingCarLevel1());
        // 해결방안 1. 싱글톤까지 적용한다
        // 해결방안 2. 다른 패턴을 적용한다.

        // 추가, 전략패턴 사용시 장점 정리
    }


    /* 전략패턴 적용 전
    ex10_kakaoriding.RacingCar car = new RacingCar();
    car.start();
    String userName = car.getUserName();
    car.accelerate();
    car.accelerate_booster(2);
    car.drift();
    car.decelerateAs();
    */

    public static RacingCarLevel1 selectRacingCarLevel1(){
        return new RacingCarLevel1();
    }

    public static RacingCarLevel2 selectRacingCarLevel2(){
        return new RacingCarLevel2();
    }
}
