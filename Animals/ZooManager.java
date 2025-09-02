package Animals;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class ZooManager {


static ArrayList<Animal> collection = new ArrayList<>();
static Scanner scn = new Scanner(System.in);

/**
 * Lists all animals in the collection. If the collection is empty, prompts the user to add animals.
 */
public static void listAll() {

   if (collection.isEmpty()) {
         System.out.println("Please add animals to collection and try again.");
   }else {
    System.out.println(collection);
   }
   
}   

/**
 * Prompts user to add an animal, asks for species and category (mammal, bird, or fish), and adds the animal to the collection.
 */
public static void addAnimal() {
     System.out.println("Enter Animal Species: ");
        String species = scn.next();
        System.out.println("Is it a Mammal, Bird, or Fish?");
        String category = scn.next();
        if (category.equalsIgnoreCase("fish")) {
            Animal newAnimal = new Fish(species);
            collection.add(newAnimal);
        } else if (category.equalsIgnoreCase("mammal")) {
            Animal newAnimal = new Mammal(species);
            collection.add(newAnimal);
        } else if (category.equalsIgnoreCase("bird")) {
            Animal newAnimal = new Bird(species);
            collection.add(newAnimal);
        } else {
            System.out.println("Invalid category, try again.");
        }
    }
/**
 * Prompts user to remove an animal by index, checks if index is valid, and removes the animal from the collection.
 */
static void removeAnimal() {
    listAll();
    System.out.println("Enter the index of the animal to remove: ");
    int index = scn.nextInt();
    try{
    if (index >= 0 && index < collection.size()) {
        System.out.println(collection.get(index) + " was removed,");
        collection.remove(index);
        System.out.println(" collection now: ");
        listAll();
        
    } else {
        System.out.println("Invalid index, try again.");
    }
} catch (InputMismatchException e) {
    System.out.println("Please enter a valid number.");
    scn.next(); 
} catch (IndexOutOfBoundsException e) {
    System.out.println("Index out of range.");
    scn.next();
}
}


/**
 * Iterates through the collection and calls the move method on each animal.
 */
public static void makeAllMove() {
    for(Animal a : collection) {
        a.move();
    }
    }

/**
 * Iterates through the collection and calls the makeSound method on each animal.
 */
public static void makeAnimalBand() {
    for(Animal a : collection){
        a.makeSound();
    }
}

/**
 * Displays the menu options and prompts the user to select an option, then calls the appropriate method based on the user's choice.
 */
public static void menu() {
    System.out.println("Zoo Manager Menu: ");
    System.out.println("1. Add Animal \n2. Remove Animal \n3. List All Animals \n4. Make All Animals Move \n5. Make All Animals Sound\n6. Exit");

    boolean menuOpen = true;
    while (menuOpen) {
        try {
            System.out.println("Enter Number to Select an Option: ");
            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    removeAnimal();
                    break;
                case 3:
                    listAll();
                    break;
                case 4:
                    makeAllMove();
                    break;
                case 5:
                    makeAnimalBand();
                    break;
                case 6:
                    menuOpen = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            scn.next(); 
        }
    }
}
}




