package CSC325_Assignment2.main;

import CSC325_Assignment2.animal.Animal;
import java.util.ArrayList;
import java.util.Scanner;

public class ZooManager
{
    public static void menu(ArrayList<Animal> animals)
    { 
        Scanner scan = new Scanner(System.in);
        boolean y = true;
        while (y = true)
        {
            System.out.println("\nZoo Manager Menu:");
            System.out.println("1. List All Animals\n2. Make All Animals Move\n3. Make All Animals Make Noise\n4. Close ZooManager Menu");
            int x = scan.nextInt();
            if (x == 1)
            {
                for (Animal a : animals)
                {
                    System.out.println("\n" + a.getSpecies());
                }
                System.out.println();
            }
            else if (x == 2)
            {
                System.out.println("\nThe animals are all moving at once!");
                for (Animal a : animals)
                {
                    a.move();      
                }
                System.out.println();
            }
            else if (x == 3)
            {
                System.out.println("\nThe animals are making a ruckus!");
                for (Animal a : animals)
                {
                    a.makeSound();
                }
                System.out.println();
            }
            else if (x == 4)
            {
                System.out.println();
                y = false;
                break;
            }
            else
            {
                System.out.println("This isn't a valid input");
            }
        }
    }
}
