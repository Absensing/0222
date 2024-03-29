package com.ohgiraffers.section01.polymorphism;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용해서 객체 배열을 만들어 인스턴스를 연속 처리 해보자. */

        동물[] animals = new 동물[5];
        animals[0] = new 토깽이();
        animals[1] = new 호랭이();
        animals[2] = new 토깽이();
        animals[3] = new 호랭이();
        animals[4] = new 토깽이();

        /* 필기. 동물 클래스가 가지는 메소드를 오버라이딩 한 메소드 호출 시 동적 바인딩 이용. */
        for(int i = 0; i < animals.length; i++) {
            animals[i].울기();
        }

        /* 필기.
         *   각 클래스별 고유한 메소드(점프, 물어뜯기) 를 동작시키기 위해서는
         *   down-casting을 명시적으로 해야하는데
         *   ClassCastException을 방지하기 위해 instanceof 연산자를 이용해야 한다.
         *  */

        for(int i = 0; i < animals.length; i++) {

            // 동물들아 만약에 너가 토끼면 점프를 뛰고, 호랑이면 물어라!!!
            if(animals[i] instanceof 토깽이) {
                ((토깽이) animals[i]).점프();
            } else if(animals[i] instanceof 호랭이) {
                ((호랭이)animals[i]).물어뜯기();
            } else {
                System.out.println("토끼나 호랑이가 아닙니다.");
            }

        }

    }
}