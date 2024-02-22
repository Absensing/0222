package com.ohgiraffers.section01.polymorphism;

public class 호랭이 extends 동물{

    @Override
    public void 먹기() {
        System.out.println("호랭이가 토깽이를 뜯어먹습니다.");
    }

    @Override
    public void 달리기() {
        System.out.println("호랭이는 웬만해서는 달리지 않습니다. 어슬렁 어슬렁");
    }

    @Override
    public void 울기() {
        System.out.println("호랭이가 포효합니다. 우워어어어어어");
    }

    public void 물어뜯기() {
        System.out.println("호랭이가 물어뜯습니다. ㅎㅎㅎㅎㅎㅎ");
    }

}
