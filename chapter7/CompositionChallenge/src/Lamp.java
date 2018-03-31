public class Lamp {
    private int brightness;
    private String color;
    private boolean isOn;


    public Lamp(int brightness, String color, boolean onOrOff) {
        this.brightness = brightness;
        this.color = color;
        this.isOn = isOn;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }

    private boolean turnOnLamp(boolean isOn) {
        if(isOn) {
            System.out.println("Turned lamp off.");
            isOn = false;
        } else {
            System.out.println("Turned lamp on.");
            isOn = true;
        }
        return isOn;
    }
}
