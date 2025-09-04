import Animal.Bird;
import Animal.Fish;
import Animal.Mammal;
Public class Main {
    public static void main(String[] args) {
        Mammal dog = new Mammal("Dog");
        //Bird bird = new Bird();
        //Fish fish = new Fish();

        dog.move();
        dog.makeSound();
        dog.walk(); 
        dog.canWalk();
        dog.swim();
        dog.canSwim();
        //bird.move();
        //fish.move();
    }
}