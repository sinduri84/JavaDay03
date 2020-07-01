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

    static void numbersMaxMinMedIf(float firstNumber, float secondNumber, float thirdNumber) {
        if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
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
        }
    }

    static void numbersMaxMinMedTernary (float firstNumber, float secondNumber, float thirdNumber) {
        float highestNumber = ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) ? firstNumber
                : (secondNumber >= firstNumber) && (secondNumber >= thirdNumber) ? secondNumber
                : (thirdNumber >= firstNumber) && (thirdNumber >= secondNumber) ? thirdNumber
                : 0;

        float lowestNumber = ((firstNumber <= secondNumber) && (firstNumber <= thirdNumber)) ? firstNumber
                : (secondNumber <= firstNumber) && (secondNumber <= thirdNumber) ? secondNumber
                : (thirdNumber <= firstNumber) && (thirdNumber <= secondNumber) ? thirdNumber
                : 0;

        float medianNumber = (((firstNumber >= thirdNumber) && (firstNumber <= secondNumber)) ||
                ((firstNumber <= thirdNumber) && (firstNumber >= secondNumber))) ? firstNumber
                : (((secondNumber >= firstNumber) && (secondNumber <= thirdNumber)) ||
                ((secondNumber <= firstNumber) && (secondNumber >= thirdNumber))) ? secondNumber
                : (((thirdNumber >= firstNumber) && (thirdNumber <= secondNumber)) ||
                ((thirdNumber <= firstNumber) && (thirdNumber >= secondNumber))) ? thirdNumber
                : 0;

        differentNumbersSort(highestNumber, medianNumber, lowestNumber);
    }

    public static void main(String[] args) {
        //Advanced A6
        System.out.println("\nAdvanced A6 Exercise\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float firstNumber = input.nextFloat();

        System.out.print("Enter second number: ");
        float secondNumber = input.nextFloat();

        System.out.print("Enter third number: ");
        float thirdNumber = input.nextFloat();

        //If-Else without using Logical operators
        System.out.println("if else");

        if (firstNumber > secondNumber) {
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
        }

        //If-Else option using Logical Operators
        System.out.println("\nUsing if else");
        numbersMaxMinMedIf(firstNumber, secondNumber, thirdNumber);

        //Using Ternary Operators
        System.out.println("\nUsing Ternary Operators");

        numbersMaxMinMedTernary(firstNumber, secondNumber, thirdNumber);

        input.close();

    }
}
