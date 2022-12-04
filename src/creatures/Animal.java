package creatures;

public class Animal {
    public static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public static final Double DEFAULT_DOG_WEIGHT = 6.0;
    public static final Double DEFAULT_CAT_WEIGHT = 2.0;
    public static final Double DEFAULT_HORSE_WEIGHT = 2.0;
    public final String species;
    public  String name;
    private Double weight;
    private Boolean isAlive;

    public Animal(String species){
        this.isAlive = true;
        this.species = species;


        switch (species) {
            case "canis" :
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "felis" :
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "eqqus" :
                this.weight = DEFAULT_HORSE_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
                break;
        }
    }

    public Double getWeight() {
        return this.weight;
    }

    public void checkIfItIsAlive() {
        if (isAlive) {
            System.out.println("Jasne, że żyję!");
        } else {
            System.out.println("no niestety już za późno");
        }
    }

    public void feed(Double foodWeight) {

        if (isAlive) {
            weight += (0.3 * foodWeight);
            System.out.println("dzięki za żarcie :) ");
        } else {
            System.out.println("Twój pies zdechł z głodu bezduszny kacie ");
        }
    }

    public void takeForAWalk(Double distanceInKm) {
        if (!isAlive) {
            System.out.println("Halo Policja!");
        } else {
            weight -= (distanceInKm * 0.1);
            if (weight <= 0.0) {
                isAlive = false;
            } else {
                System.out.println("dzięki za spacer");
            }
        }
    }
}
