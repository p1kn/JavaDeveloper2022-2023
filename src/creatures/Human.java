package creatures;

import creatures.Animal;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;

    public Human() {
        super("homo sapiens");
    }
}
