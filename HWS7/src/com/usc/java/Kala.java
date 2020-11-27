package com.usc.java;

import java.util.Scanner;

public class Kala {
        int id;
        String name;
        String size;   //andaze ya meqdare kala
        String exinfo;  //tozihe ezafe darmorede kala
        double price;


        void addKala(int p1 , String p2 , String p3 , String p4 , double p5 )
        {
            id=p1;
            name=p2;
            size=p3;
            exinfo=p4;
            price=p5;
        }


        void printKala()
        {
            System.out.println();
            System.out.println(" Shomareh Kala : "+(id+1));
            System.out.println("-----------------");
            System.out.println(" Name Kala : "+name);
            System.out.println(" Size Kala : "+size);
            System.out.println(" Qeimate kala : "+price);
            System.out.println();
            System.out.println(" Addition Info: "+exinfo);
        }


        void virayeshKala()
        {
            int select;
            Scanner sc = new Scanner(System.in);
            System.out.println("Which of item to be modified : ");
            System.out.println(" 1) info");
            System.out.println(" 2) size");
            System.out.println(" 3) price");
            System.out.println(" 4) addition info");

            System.out.println(" enter your select :");


            select= sc.nextInt();

            switch(select)
            {
                case 1 :
                    System.out.println("enter new name : ");
                    name=sc.next();
                    break;

                case 2 :
                    System.out.println("enter new size : ");
                    size=sc.next();
                    break;

                case 3 :
                    System.out.println("enter new price : ");
                    price=sc.nextInt();
                    break;

                case 4 :
                    System.out.println("enter new addition info : ");
                    exinfo=sc.next();
                    break;

                default :
                    break;
            }
        }


        void deleteKala()
        {
            id=-1;
            name="";
            size="";
            exinfo="";
            price=-1;
        }
    }


