package org.javalearning;

import java.util.Scanner;

public class Main {

    static void differentNumbersSort(float highestNumber, float medianNumber, float lowestNumber) {
        System.out.printf("The highest number is %.2f. " +
                "%nThe second highest number is %.2f. " +
                "%nThe lowest number is %.2f. %n", highestNumber, medianNumber, lowestNumber);
    }

    static void twoHighNumbersSort(float highestNumber, float lowestNumber) {
        System.out.printf("The highest equal numbers are %.2f. " +
                "%nThe lowest  number is %.2f. %n", highestNumber, lowestNumber);
    }

    static void twoLowNumbersSort(float highestNumber, float lowestNumber) {
        System.out.printf("The highest number is %.2f. " +
                "%nThe lowest equal numbers are %.2f. %n", highestNumber, lowestNumber);
    }

    public static void main(String[] args) {
        //A1 Exercise
        /*
        Numbers greater than zero are positive numbers and
        below zero are negative numbers.
        Zero is neither a positive nor a negative number.
        */
        System.out.println("A1 Exercise");

        int a1Variable = -10;

        if (a1Variable > 0) {
            System.out.println("The number " + a1Variable + " is a positive number");
        } else if (a1Variable == 0) {
            System.out.println("The number " + a1Variable + " is a neutral number");
        } else {
            System.out.println("The number " + a1Variable + " is a negative number");
        }

        //A2
        System.out.println("");
        System.out.println("A2 Exercise");

        float a2Variable= 0f;

        if(a2Variable == 0) {
            System.out.println("The number is equal to zero");
        } else if(a2Variable < 0) {
            System.out.println("The number " + a2Variable + " is a negative number.");
        } else {
            if(a2Variable < 1) {
                System.out.println("The number " + a2Variable + " is a small positive number.");
            } else if(a2Variable > 1000000) {
                System.out.println("The number " + a2Variable + " is a large positive number.");
            } else {
                System.out.println("The number " + a2Variable + " is a positive number.");
            }
        }

        //A3
        System.out.println("");
        System.out.println("A3 Exercise");

        int a3Variable = 3;

        //Using if Statement
        System.out.println("A3.a");

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
        System.out.println("A3.c");

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

        //A4
        System.out.println("");
        System.out.println("A4 Exercise");

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
        System.out.println("");
        System.out.println("A5 Exercise");

        int a5Variable = 9;

        String a5Result = (a5Variable % 2 == 0) ? "The number is even." : "The number is odd.";

        System.out.println(a5Result);

        //A6
        System.out.println("");
        System.out.println("A6 Exercise");

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

        //Advanced A6
        System.out.println("");
        System.out.println("Advanced A6 Exercise");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float firstNumber = input.nextFloat();

        System.out.print("Enter second number: ");
        float secondNumber = input.nextFloat();

        System.out.print("Enter third number: ");
        float thirdNumber = input.nextFloat();

/*        if (firstNumber > secondNumber) {
            if (secondNumber > thirdNumber) {
                differentNumbersSort(firstNumber, secondNumber, thirdNumber);
            } else if (thirdNumber > secondNumber) {
                if (firstNumber > thirdNumber) {
                    differentNumbersSort(firstNumber, thirdNumber, secondNumber);
                } else if (thirdNumber > firstNumber) {
                    differentNumbersSort(thirdNumber, firstNumber, secondNumber);
                } else { //firstNumber == thirdNumber
                    twoHighNumbersSort(firstNumber, secondNumber);
                }
            } else { //secondNumber == thirdNumber
                twoLowNumbersSort(firstNumber, thirdNumber);
            }
        } else if (secondNumber > firstNumber) {
            if (firstNumber > thirdNumber) {
                differentNumbersSort(secondNumber, firstNumber, thirdNumber);
            } else if (thirdNumber > firstNumber) {
                if (secondNumber > thirdNumber) {
                    differentNumbersSort(secondNumber, thirdNumber, firstNumber);
                } else if (thirdNumber > secondNumber) {
                    differentNumbersSort(thirdNumber, secondNumber, firstNumber);
                } else { //secondNumber == thirdNumber
                    twoHighNumbersSort(secondNumber, firstNumber);
                }
            } else { //firstNumber == thirdNumber
                twoLowNumbersSort(secondNumber, firstNumber);
            }
        } else { //firstNumber == secondNumber
            if (firstNumber > thirdNumber) {
                twoHighNumbersSort(firstNumber, thirdNumber);
            } else if ( thirdNumber > firstNumber) {
                twoLowNumbersSort(thirdNumber, firstNumber);
            } else {
                System.out.println("All three numbers are equal!");
            }
        }*/

/*        if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
            differentNumbersSort(firstNumber, secondNumber, thirdNumber);
        } else if ((firstNumber > secondNumber) && (secondNumber < thirdNumber)) {
            if (thirdNumber > firstNumber) {
                differentNumbersSort(thirdNumber, firstNumber, secondNumber);
            } else if (firstNumber > thirdNumber) {
                differentNumbersSort(firstNumber, thirdNumber, secondNumber);
            } else { //firstNumber == thirdNumber
                twoHighNumbersSort(firstNumber, secondNumber);
            }
        } else if ((firstNumber > secondNumber) && (secondNumber == thirdNumber)) {
            twoLowNumbersSort(firstNumber, secondNumber);
        } else if ((firstNumber < secondNumber) && (firstNumber > thirdNumber)) {
            differentNumbersSort(secondNumber, firstNumber, thirdNumber);
        } else if ((firstNumber < secondNumber) && (firstNumber < thirdNumber)) {
            if (secondNumber > thirdNumber) {
                differentNumbersSort(secondNumber, thirdNumber, firstNumber);
            } else if (secondNumber < thirdNumber) {
                differentNumbersSort(thirdNumber, secondNumber, firstNumber);
            } else { //secondNumber == thirdNumber
                twoHighNumbersSort(secondNumber, firstNumber);
            }
        } else if ((firstNumber < secondNumber) && (firstNumber == thirdNumber)) {
            twoLowNumbersSort(secondNumber, firstNumber);
        } else { // firstNumber == secondNumber
            if (firstNumber > thirdNumber) {
                twoHighNumbersSort(firstNumber, thirdNumber);
            } else if (firstNumber < thirdNumber) {
                twoLowNumbersSort(thirdNumber, firstNumber);
            } else {
                System.out.println("All numbers are equal!");
            }
        }*/





        input.close();

    }
}
