package com.mudr1k.canteen;

public interface Canteen<T> {
    default void eat(T food) {
        System.out.println(getClass().getSimpleName() + " doesn't eat " + food.getClass().getSimpleName() +
                " - No cannibals allowed");
    }

    void eat(Plant food);

    void eat(Flesh food);
}
