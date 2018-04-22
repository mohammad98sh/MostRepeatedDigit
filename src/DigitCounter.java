/*
Uncomment *** lines and Run the project to UnderStand the operation Better ;)//TODO: << << <<
Wrote and Analyzed By Radium88 ;)
*/

import java.util.Scanner;

public class DigitCounter {


    public static int compare(int digit, int next_digit) {          //Checks Equality for each digit to next_digit

        return digit == next_digit ? 1 : 0;
    }


    public static void digitExtractor(int num) {
        int current_digit;                                          //Stores the value of the current digit
        int next_Digit;                                             //Stores the value of the next digit
        int last_digit = 0;
        int rest;                                                   //rest is the rest of processing number
        int counter = 0;                                            //TODO:Stores number of repeat of the digit
        int a = 0;                                                 //TODO:for Storing Data of counter
        int mr_digit = -1;                                         //mr is Most Repeated digit
        int last = 0;                                             //Stores number of repeat of the last digit
        int current;                                               //Stores number of repeat of the current digit

        while (num != 0) {
            current_digit = num % 10;
//            System.out.print(current_digit);    //***
            num = num / 10;                                         //Decreases one digit of number
            rest = num;
//            System.out.print(": ");    //***

            last = a;
            counter = 0;

            while (rest != 0) {                                       //Counts equal next_digits to each digit
                next_Digit = rest % 10;
//                System.out.print(next_Digit + " ");   //***
                counter = counter + compare(current_digit, next_Digit);
                rest = rest / 10;                                   //Decreases one digit of rest of number
            }
//            System.out.println("\n");    //***
            next_Digit = num % 10;                               //for returning the correct value to next_Digit
            current = counter;
            if (next_Digit != 0 && counter != 0) {
                if (last > current) {
                    mr_digit = last_digit;
//                    second = first;
                }
//                if (first == second) {                        //TODO: This block of code is for equality of number of >>
//mr_digit = Integer.parseInt(first+second+"");                 //TODO: Repeated digit of two digits ; as you see >>
//            }                                                //TODO: I didn't complete that ... ! (-_-)
                if (last < current) {
                    mr_digit = current_digit;                   //navigates the mostRepeated number to next
                    last_digit = current_digit;
                }
                a = counter;                                       //Last counter
            }
        }

        System.out.println("Most Repeated digit is : " + mr_digit);
    }

    public static void main(String[] args) {
        int a ;
        Scanner s = new Scanner(System.in);
            System.out.println("Enter a number :");
            a = s.nextInt();
            digitExtractor(a);                              //This is the magic Function of Exercise
    }


}
