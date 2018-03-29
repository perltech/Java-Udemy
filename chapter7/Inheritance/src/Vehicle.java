public class Vehicle {
    int speed;
    int gears;
    String steeringDirection;

    public Vehicle(int speed, int gears, String steeringDirection) {
        this.speed = speed;
        this.gears = gears;
        this.steeringDirection = steeringDirection;
    }

    public Vehicle(int speed, String steeringDirection) {
        this(0, "Standing Still.")
    }

    public String steering(String direction) {
        System.out.println("Vehicle.steering() run\n");
        System.out.println("Vehicle is in " + direction);
        return steeringDirection;
    }

    public int gearChange(int onGear, int speed) {

        if (onGear <= gears || gears >= 1) {
            System.out.println("Gear Changed.");
            changeSpeed(speed);
            onGear ++;
        } else {
            System.out.println("You can't go to that gear.");
        }
        return onGear;
    }

    public int changeSpeed(int speed) {
        System.out.println("changeSpeed() called.");
        System.out.println("Your old speed was, " + speed);
        speed += speed;
        System.out.println("You're now driving, " + speed);
        return speed;
    }

}
