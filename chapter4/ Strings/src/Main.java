public class Main {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2018";
        System.out.println(myString);

        // Numbers are converted into string whens they're concatenated together by default
    }
}
