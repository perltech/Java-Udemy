public class FourRunner extends Car {
    private int skiRackCount;

    public FourRunner(int speed, String steeringDirection, int skiRackCount) {
        super(speed, 4, steeringDirection, 4, "silver");
        this.skiRackCount = skiRackCount;
    }

    @Override
    public int gearChange(int changeGear) {
        System.out.println("Toyota gearChange ran.");
        return super.gearChange(changeGear);
    }
}
