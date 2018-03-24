public class Main {

    public static void main(String[] args) {
        //int has a width of 32
        int myMinValue = -2_147_483_648;
        // Underscore can be substituted as a comma in large numbers
        int myMaxValue = 2_147_483_647;
        int myIntTotal = (myMinValue/2);

        //byte has a width of 8
        byte myByteMin = -128;
        byte myByteMax = 127;
        // Casting value to type byte
        byte myNewByteValue = (byte)(myByteMin/2);

        //short has a width of 16
        short myShortMin = -32768;
        short myShortMax = 32767;

        //long has a width of 64
        long myLongValue = 100L;
        //Range 2e10*63, 64-bit number
    }
}
