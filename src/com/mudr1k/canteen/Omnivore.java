package com.mudr1k.canteen;

public interface Omnivore<T> extends Canteen<T> {

    @Override
    default void eat(Plant food) {
        System.out.println(getClass().getSimpleName() + " eat " + food.getClass().getSimpleName());
    }

    @Override
    default void eat(Flesh food) {
        System.out.println(getClass().getSimpleName() + " eat " + food.getClass().getSimpleName());
    }
}
