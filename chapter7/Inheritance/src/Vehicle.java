public class Vehicle {
    private int speed;
    private int gear;
    private String steeringDirection;

    public Vehicle(int speed, int gear, String steeringDirection) {
        this.speed = speed;
        this.gear = gear;
        this.steeringDirection = steeringDirection;
    }

    public Vehicle(int gear) {
        this(0,gear, "Standing Still.");
    }

    public String steering(String direction) {
        System.out.println("Vehicle.steering() run\n");
        System.out.println("Vehicle is in " + direction);
        return steeringDirection;
    }

    public int gearChange(int changeGear) {
        do {
            if (gear >= 1) {
                System.out.println("Gear Changed.");
                changeSpeed(speed);
                changeGear ++;
            } else {
                System.out.println("You can't go to that gear.");
            }
        } while(changeGear <= gear);
        return changeGear;
    }

    public int changeSpeed(int speedChange) {
        System.out.println("changeSpeed() called.");
        System.out.println("Your old speed was, " + speed);
        speed += speedChange;
        System.out.println("You're now driving, " + speed);
        return speed;
    }

}
