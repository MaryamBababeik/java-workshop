package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please enter the Sides of Triangle ");
        float a;
        float b;
        float c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Side 1: ");
        a=sc.nextInt();
        System.out.println("enter Side 2: ");
        b=sc.nextInt();
        System.out.println("enter Side 3: ");
        c=sc.nextInt();
        System.out.println("Is it triangle? ");
                if ((a+b>c) && (a+c>b) && (b+c>a))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }