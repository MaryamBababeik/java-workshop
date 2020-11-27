package com.usc.java;

import java.util.Scanner;

public class Main {
    static void cls()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int flag=1 , choice ;
        String inf;
        String sz;
        String exf;
        int pr;
        int i , number , shomarehKala=0 ;
        String str;
        Kala K[] = new Kala[15];


        //  Nemayeshe menu
        while(flag==1)
        {
            System.out.println(" 1) sabt mahsool");
            System.out.println(" 2) nemayesh mahsoolat"); //namayeshe hameye mahsolate vared shode
            System.out.println(" 3) nemayesh mahsool");  //namayeshe mahsole khaste shode
            System.out.println(" 4) virayesh mahsool");
            System.out.println(" 5) hazf mahsool");
            System.out.println(" 0) khorooj az barnameh");
            System.out.println("----------------------------------");
            System.out.println("  addade morede nazare khod ra vared konid : ");


            choice = input.nextInt();

            switch(choice)
            {
                case 1 :
                    K[shomarehKala] = new Kala();
                    cls();
                    System.out.println("enter name : ");
                    inf=input.next();
                    System.out.println("enter size : ");
                    sz=input.next();
                    System.out.println("enter price : ");
                    pr=input.nextInt();
                    System.out.println("enter addition info : ");
                    exf=input.next();
                    K[shomarehKala].addKala(shomarehKala,inf,sz,exf,pr);
                    System.out.println("Kala ba moshakhasat zir darj shod: ");
                    K[shomarehKala].printKala();

                    shomarehKala++;
                    break;


                case 2:
                    cls();
                    System.out.println("Kalahay Sherkat: " );
                    for(i=0 ; i<shomarehKala ; i++)
                    {
                        System.out.println("ID= "+K[i].id);
                        System.out.println("Name= "+K[i].name);
                    }
                    break;


                case 3:
                    cls();
                    System.out.print("ID kala ra vared konid :");
                    number = input.nextInt();
                    if(( number>shomarehKala) | (number<0))
                        System.out.println("shomareh kala sahih nist!!!!");
                    else
                        K[number].printKala();
                    break;


                case 4:
                    cls();
                    System.out.print("ID kala ra vared konid :");
                    number = input.nextInt();
                    if((number>shomarehKala) | (number<0))
                        System.out.println("shomareh kala sahih nist!!!!");
                    else
                        K[number].virayeshKala();
                    break;


                case 5:
                    cls();
                    System.out.print("ID kala ra vared konid :");
                    number = input.nextInt();
                    if((number>shomarehKala) | (number<0))
                        System.out.println("shomareh kala sahih nist!!!!");
                    else
                        K[number].deleteKala();
                    break;



                default :
                    flag=0;
            }
        }
    }
}
