package com.smm;

import java.util.Scanner;


public class AddNumbers {

    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int a;
        int b;
        int c;
        System.out.println("enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("sum of the entered two numbers : "+c);



    }
}
