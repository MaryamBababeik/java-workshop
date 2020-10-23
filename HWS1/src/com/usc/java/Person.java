package com.usc.java;

import java.util.Scanner;

public class Person {

    public int age;
    String name=new String();
  Scanner input=new Scanner(System.in);

 public void users(){
     System.out.println("enter name & age of each users ");
     for (int i = 1 ; i<=5 ; i++){
         for (int j = 0 ; j<20 ; j++){
             System.out.println(" name of user " +i+ ":");
         name[j]=input.nextLine();
         }
         System.out.println(" age of user " +i+ ":");
      age=input.nextInt();
     }

    }
}
