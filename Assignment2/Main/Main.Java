import Animal.Bird;
import Animal.Fish;
import Animal.Mammal;
Public class Main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal("Dog");
        Bird bird = new Bird("pigeon");
        Fish fish = new Fish("Goldfish");

        mammal.move();
        mammal.makeSound();
        mammal.walk(); 
        mammal.canWalk();
        mammal.swim();
        mammal.canSwim();
        
        bird.move();
        bird.makeSound();
        bird.walk();
        bird.canWalk();
        bird.swim();
        bird.canSwim();
        bird.fly();
        
        fish.move();
        fish.makeSound();
        fish.swim();
        fish.canSwim();
    }
}