package com.ohgiraffers.section01.polymorphism;

public class 토깽이 extends 동물{

    @Override
    public void 먹기() {
        System.out.println("토깽이가 당근을 씹어먹고 있습니다. 우걱 우걱");
    }

    @Override
    public void 달리기() {
        System.out.println("토깽이가 들판을 뛰어다닙니다. 깡총 깡총");

    }

    @Override
    public void 울기() {
        System.out.println("토끼가 울음소리를 냅니다. 끼익 끼익");
    }

    public void 점프() {
        System.out.println("토깽이가 점프를 합니다. 점핑 점핑");
    }
}
