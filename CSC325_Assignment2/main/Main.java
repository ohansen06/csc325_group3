package CSC325_Assignment2.main;

import CSC325_Assignment2.animal.Animal;
import CSC325_Assignment2.animal.Bird;
import CSC325_Assignment2.animal.Fish;
import CSC325_Assignment2.animal.Mammal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean y = true;
        Bird b1 = new Bird("Duck");
        Mammal m1 = new Mammal("Bear");
        Fish f1 = new Fish("Shark");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(b1);
        animals.add(m1);
        animals.add(f1);
        while (y = true)
        {
            System.out.println("What would you like to interact with?\n1. Bird\n2. Mammal\n3. Fish\n4. View ZooManager\n5. Close Program");
            int x = scan.nextInt();
            if (x == 1)
            {
                System.out.println("\nThis bird is a " + b1.getSpecies());
                b1.move();
                b1.canWalk();
                b1.walk();
                b1.canSwim();
                b1.swim();
                b1.makeSound();
                System.out.println();
            }
            else if (x == 2)
            {
                System.out.println("\nThis mammal is a " + m1.getSpecies());
                m1.move();
                m1.canWalk();
                m1.walk();
                m1.canSwim();
                m1.swim();
                m1.makeSound();
                System.out.println();
            }
            else if (x == 3)
            {
                System.out.println("\nThis fish is a " + f1.getSpecies());
                f1.move();
                f1.canSwim();
                f1.swim();
                f1.makeSound();
                System.out.println();
            }
            else if (x == 4)
            {
                ZooManager.menu(animals);
            }
            else if (x == 5)
            {
                System.out.println("Thanks for checking out the zoo! See you next time!");
                y = false;
                break;
            }
            else
            {
                System.out.println("This isn't a valid input");
                break;
            }
        }
    }
}
