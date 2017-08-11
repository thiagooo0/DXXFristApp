package com.dxx.dxxfristapp;

/**
 * Created by Administrator on 2017/4/15.
 */
public class LuBan extends Hero {
    //血量;
    int minHp = 0;

    public LuBan(int newHp)
    {
        hp = newHp;
    }

    void shot(Hero hero){
        hero.hp = hero.hp-1;
    }

}
