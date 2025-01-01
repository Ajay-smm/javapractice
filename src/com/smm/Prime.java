package com.smm;

import java.util.Scanner;

public class Prime {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter a num: ");
        num=sc.nextInt();

        switch(num) {
            case 1:
                    System.out.println("number is not prime");
                    break;
            case 2:
                    System.out.println("number is prime");

            default:
                if (num % 2 == 0) {
                    System.out.println("number is not prime");
                }
                else {
                    boolean isPrime = true;
                    for (int i = 3; i <= Math.sqrt(num); i += 2) {
                        if (num % i == 0) {
                            System.out.println("number is not prime");
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println("number is prime");
                    }
                }
            break;

        }

    }
}
