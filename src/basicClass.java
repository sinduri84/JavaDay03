public class BasicClass {

    static void signA2Number(float a2Variable) {
        if (a2Variable == 0) {
            System.out.println("The number is equal to zero");
        } else if (a2Variable < 0) {
            System.out.println("The number " + a2Variable + " is a negative number.");
        } else {
            if (a2Variable < 1) {
                System.out.println("The number " + a2Variable + " is a small positive number.");
            } else if (a2Variable > 1000000) {
                System.out.println("The number " + a2Variable + " is a large positive number.");
            } else {
                System.out.println("The number " + a2Variable + " is a positive number.");
            }
        }
    }

    public static void main(String[] args) {
        //A1 Exercise
        /*
        Numbers greater than zero are positive numbers and
        below zero are negative numbers.
        Zero is neither a positive nor a negative number.
        */
        System.out.println("\nA1 Exercise");

        int a1Variable = -10;

        if (a1Variable > 0) {
            System.out.println("The number " + a1Variable + " is a positive number");
        } else if (a1Variable == 0) {
            System.out.println("The number " + a1Variable + " is a neutral number");
        } else {
            System.out.println("The number " + a1Variable + " is a negative number");
        }

        //A2
        System.out.println("\nA2 Exercise");

        signA2Number(2000000);
        signA2Number(0);
        signA2Number(0.01f);
        signA2Number(-16.5f);


        //A3
        System.out.println("\nA3 Exercise");

        int a3Variable = 3;

        //Using if Statement
        System.out.println("\nA3.a - Using if else");

        if (a3Variable == 1) {
            System.out.println("Today is Monday");
        } else if (a3Variable == 2) {
            System.out.println("Today is Tuesday");
        } else if (a3Variable == 3) {
            System.out.println("Today is Wednesday");
        } else if (a3Variable == 4) {
            System.out.println("Today is Thursday");
        } else if (a3Variable == 5) {
            System.out.println("Today is Friday");
        } else if (a3Variable == 6) {
            System.out.println("Today is Saturday");
        } else if (a3Variable == 7) {
            System.out.println("Today is Sunday");
        } else {
            System.out.println("You entered " + a3Variable + ". A week has only 7 days");
        }

        //Using Switch Statement
        System.out.println("\nA3.c - Using Switch");

        switch (a3Variable) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("You entered " + a3Variable + ". A week has only 7 days");
        }
    }
}
