package ex10_kakaoriding_strategy;

import ex10_kakaoriding.RacingCar;



import java.util.Scanner;

// 전략패턴
/*
특징: 실행중에 알고리즘을 선택할 수 있게 하는 디자인 패턴.
특정한 계열의 알고리즘 (본 예제에서는 자동차 동작) 을 정의하고,
각 알고리즘을 캡슐화하여 계열 안에서 상호 교체가 가능하게 만든다.

전략은 알고리즘을 사용하는 클라이언트와는 독립적으로 다양하게 만든다.
(본 예제 클라이언트는 Main 클래스)

조건문을 대체하는 용도로 사용될 수 있다.

관련 블로그:
https://velog.io/@kyle/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4-%EC%A0%84%EB%9E%B5%ED%8C%A8%ED%84%B4%EC%9D%B4%EB%9E%80

* */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        RacingCarSelect racingCarSelect = new RacingCarSelect();

        racingCarSelect.start(selectRacingCarLevel1());
        racingCarSelect.accelerate(selectRacingCarLevel1());
        racingCarSelect.accelerate(selectRacingCarLevel1());

        racingCarSelect.start(selectRacingCarLevel2());
        racingCarSelect.accelerate(selectRacingCarLevel2());
        racingCarSelect.accelerate(selectRacingCarLevel2());

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
