public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public int getCardSlots() {
        return cardSlots;
    }
    public int getRamSlots() {
        return ramSlots;
    }
    public String getBios() {
        return bios;
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
}
