public class Car extends Vehicle {
    int doors;
    String color;

    public Car(int speed, int gear, String steeringDirection, int doors, String color) {
        super(speed, gear, steeringDirection);
        this.doors = doors;
        this.color = color;
    }

    @Override
    public int gearChange(int changeGear) {
        return super.gearChange(changeGear);
    }

    @Override
    public String steering(String direction) {
        return super.steering(direction);
    }

    @Override
    public int changeSpeed(int speed) {
        return super.changeSpeed(speed);
    }
}
