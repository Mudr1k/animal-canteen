package com.mudr1k;

import com.mudr1k.canteen.animal.*;
import com.mudr1k.canteen.plant.Grass;

public class Runner {

    public static void main(String[] args) {
        Lion<Lion> lion = new Lion<>();
        Grass grass = new Grass();
        Cow<Cow> cow = new Cow<>();
        Goat<Goat> goat = new Goat<>();
        Rat<Rat> rat = new Rat<>();

        Panda<Panda> panda = new Panda<>();
        WhiteBear<WhiteBear> whiteBear = new WhiteBear<>();
        BrownBear<BrownBear> brownBear = new BrownBear<>();


        lion.eat(cow);
        lion.eat(grass);
        lion.eat(lion);
        lion.eat(goat);
        lion.eat(rat);
        lion.eat(panda);
        lion.eat(whiteBear);
        lion.eat(brownBear);

        goat.eat(cow);
        goat.eat(grass);
        goat.eat(lion);
        goat.eat(goat);
        goat.eat(rat);
        goat.eat(panda);
        goat.eat(whiteBear);
        goat.eat(brownBear);

        rat.eat(cow);
        rat.eat(grass);
        rat.eat(lion);
        rat.eat(goat);
        rat.eat(rat);
        rat.eat(panda);
        rat.eat(whiteBear);
        rat.eat(brownBear);


        panda.eat(lion);
        panda.eat(goat);
        panda.eat(cow);
        panda.eat(grass);
        panda.eat(panda);
        panda.eat(whiteBear);
        panda.eat(rat);
        panda.eat(brownBear);

        whiteBear.eat(lion);
        whiteBear.eat(goat);
        whiteBear.eat(cow);
        whiteBear.eat(grass);
        whiteBear.eat(panda);
        whiteBear.eat(whiteBear);
        whiteBear.eat(rat);
        whiteBear.eat(brownBear);

        brownBear.eat(lion);
        brownBear.eat(goat);
        brownBear.eat(cow);
        brownBear.eat(grass);
        brownBear.eat(panda);
        brownBear.eat(whiteBear);
        brownBear.eat(rat);
        brownBear.eat(brownBear);
    }
}
