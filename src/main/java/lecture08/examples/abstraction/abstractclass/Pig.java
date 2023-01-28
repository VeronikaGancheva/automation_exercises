package lecture08.examples.abstraction.abstractclass;

import lecture08.examples.abstraction.abstractclass.Animal;

public class Pig extends Animal {
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}
