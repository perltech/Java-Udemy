public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("Animal",1,1,5,5);
//        Dog dog = new Dog("Yorkie", 2, 25, 4, 4, 1, 20, "Shaggy");
//        dog.eat();
//
//        //dog.walk();
//        dog.run();

        Vehicle vehicle = new Vehicle(4, 5, "right");
        System.out.println(vehicle.changeSpeed(5));
        System.out.println(vehicle.gearChange(2));
    }

}
