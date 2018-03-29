public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27in Beast", "Acer", 27,
        new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("Bj-200", 4,6,"v.244");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        thePC.powerUp();
        //thePC.getTheMonitor().drawPixelAt(1550,1200,"red");
        //thePC.getTheMotherboard().loadProgram("DOOM");
    }
}
