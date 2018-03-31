public class Sofa {
    private double length;
    private int peopleSitting;
    private String color;
    private boolean isSitting;

    public Sofa(double length, int peopleSitting, String color) {
        this.length = length;
        this.peopleSitting = peopleSitting;
        this.color = color;
    }

    public boolean sitDown() {
        System.out.println("sitDown() called.");
        if(isSitting) {
            System.out.println("You stood up.");
            isSitting = false;
        } else {
            System.out.println("You sat down.");
            isSitting = true;
        }

        return isSitting;
    }

    public double getLength() {
        return length;
    }

    public int getPeopleSitting() {
        return peopleSitting;
    }

    public String getColor() {
        return color;
    }
}
