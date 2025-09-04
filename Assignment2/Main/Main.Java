import Animal.Bird;
import Animal.Fish;
import Animal.Mammal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Mammal mammal = new Mammal("Dog");
        Bird bird = new Bird("pigeon");
        Fish fish = new Fish("Goldfish");
        System.out.println("Enter 0 to see info on a dog, 1 to see info on a pidgeon, 2 to see info on a goldfish , enter 3 to exit");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(mammal);
        animals.add(bird);
        animals.add(fish);
        if (imput == 0){
            mammal.move();
            mammal.makeSound();
            mammal.walk(); 
            mammal.canWalk();
            mammal.swim();
            mammal.canSwim();
        }
        else if (input == 1){
            bird.move();
            bird.makeSound();
            bird.walk();
            bird.canWalk();
            bird.swim();
            bird.canSwim();
            bird.fly();
        }
        else if (input == 2){
            fish.move();
            fish.makeSound();
            fish.swim();
            fish.canSwim();
        }
        else if (input == 3){
            System.out.println("Exiting program.");
            System.exit(0);
        }
        else {
            System.out.println("Invalid input. Please enter a number between 0 and 3.");
        }
        
    }
}