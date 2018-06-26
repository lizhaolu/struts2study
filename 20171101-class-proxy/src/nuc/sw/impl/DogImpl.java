package nuc.sw.impl;

import nuc.sw.dog.Dog;

/**
 * Created by superzhaolu on 2017/11/5.
 */
public class DogImpl implements Dog{
    @Override
    public void info() {
        System.out.println("这是一只二哈");
    }

    @Override
    public void run() {
        System.out.println("二哈在萌蠢的路上狂奔");
    }

    @Override
    public void cry() {
        System.out.println("二哈在对着二狗子师傅号叫");
    }
}
