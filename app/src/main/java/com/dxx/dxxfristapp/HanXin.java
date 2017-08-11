package com.dxx.dxxfristapp;

/**
 * Created by Administrator on 2017/4/15.
 */
public class HanXin extends Hero {
    //    int hp = 108;
    public HanXin(int newHp) {
        hp = newHp;
    }

    void haha(Hero hero) {
        hero.hp = hero.hp - 1;
    }

    void mama(Hero hero) {
        hero.hp = hero.hp - 5;
    }

    void lala() {
        hp = hp + 3;

    }
}
