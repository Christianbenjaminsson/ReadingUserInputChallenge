package com.example.readinguserinputchallenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0, sum= 0;

        while(true) {
            int order = counter +1;
            System.out.print("Enter number # " + order + ": ");

            boolean isAnInt = scan.hasNextInt();

            if(isAnInt) {
                int number = scan.nextInt();
                counter++;
                sum += number;
                if(counter == 10) {
                    break;
                }
            } else {
                System.out.print("Invalid number");
            }

            scan.nextLine();
        }

        System.out.print("Sum = " + sum);
        scan.close();
    }
}
