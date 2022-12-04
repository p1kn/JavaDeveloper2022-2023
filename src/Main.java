import creatures.Animal;
import devices.Car;

public class Main {
    public static void main(String[] args) {
/*        devices.Phone nokia = new devices.Phone();
        nokia.id = 1;
        nokia.producer = "Nokia";
        nokia.screenSize = 1.2;
        nokia.isAndroid = false;
        nokia.model = "3310";

        devices.Phone iphone = new devices.Phone();
        iphone.id = 2;
        iphone.producer = "Apple";
        iphone.screenSize = 2.1;
        iphone.isAndroid = false;
        iphone.model = "14";

        System.out.println("Moje telefony:");
        System.out.println("Producent: " + nokia.producer);
        System.out.println("Model: " + nokia.model);
        System.out.println();
        System.out.println("Producent: " + iphone.producer);
        System.out.println("Model: " + iphone.model);*/

        System.out.println();

        Animal dog = new Animal("canis");
        dog.name = "diabeł";

        Animal cat = new Animal("felis");

        System.out.println();

        System.out.println(dog.species);


        System.out.println(cat.species);



        System.out.println("Waga psa przed karmirniem: ");

        dog.feed(2.0);
        System.out.println("Waga psa po karmieniu: ");


        dog.takeForAWalk(1.0);
        dog.takeForAWalk(2.0);
        dog.takeForAWalk(2.0);

        dog.checkIfItIsAlive();
        dog.feed(3.0);
        dog.takeForAWalk(1.0);
        dog.checkIfItIsAlive();
        System.out.println("Waga psa po karmieniu: ");

        System.out.println();

        Car fiat = new Car(17, "Vw", "passat");

        fiat.milleage = 32165251.0;




/*        devices.Car car = new devices.Car();
        car.color = "red";
        car.gearbox = "automatic";
        car.horsepower = 280d;
        car.TypeOfFuel = "petrol";

        creatures.Human maciek = new creatures.Human();
        maciek.firstName = "Maciek";
        maciek.lastName = "Plandowski";
        maciek.pet = dog;
        maciek.vehicle = car;

        System.out.println(car.PRODUCER);
        System.out.println(car.MODEL);
        System.out.println(car.color);

        System.out.println(maciek.lastName);*/
    }
}