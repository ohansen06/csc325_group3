package Animals;
public class Fish extends Animal {
    private final  String species;

    public Fish(String s) {
        species = s;
    }
    @Override
    public void move() {
        System.out.println("The " + species + " swam around.");
}
    @Override
    public void makeSound() {
        System.out.println("The " + species + " blubbed.");
    }
    @Override
    public String toString() {
        return species;
    }
}
