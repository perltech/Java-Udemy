public class Main {
    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;

        //float width = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        //7 decimal points precision

        float castedFloat = (float) 5.25;

        //double width = 64 (8 bytes)
        double myDoubleValue = 5 / 3d;
        //16 decimal points precision
        //double is default data type, faster, can be: 5.25 or 5.25d

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        int pounds = 160;
        double kilos = (double) pounds * 0.45259237d;
        System.out.println("Kilos: " + kilos);

    }
}
