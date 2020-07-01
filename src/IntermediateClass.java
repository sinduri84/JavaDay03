public class IntermediateClass {
    public static void main(String[] args) {
        //A4
        System.out.println("\nA4 Exercise");

        int a4FirstVariable = 5;
        int a4SecondVariable = 6;

        if (a4FirstVariable > a4SecondVariable) {
            System.out.println(a4FirstVariable + " is the maximum of the two numbers");
        } else if (a4FirstVariable < a4SecondVariable) {
            System.out.println(a4SecondVariable + " is the maximum of the two numbers");
        } else {
            System.out.println("Both numbers are equal");
        }

        //A5
        System.out.println("\nA5 Exercise");

        int a5Variable = 9;

        String a5Result = (a5Variable % 2 == 0) ? "The number is even." : "The number is odd.";

        System.out.println(a5Result);

        //A6
        System.out.println("\nA6 Exercise");

        int a6Variable = 16;

        if ((a6Variable % 3 == 0) && (a6Variable % 5 == 0)) {
            System.out.println("FizzBuzz");
        } else if (a6Variable % 3 == 0) {
            System.out.println("Fizz");
        } else if (a6Variable % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("No Fizz or Buzz or FizzBuzz. Just " + a6Variable + ".");
        }
    }
}
