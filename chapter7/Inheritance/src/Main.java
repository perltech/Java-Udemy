public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Yorkie", 2, 25, 4, 4, 1, 20, "Shaggy");
        dog.eat();

        //dog.walk();
        dog.run();
    }

}
