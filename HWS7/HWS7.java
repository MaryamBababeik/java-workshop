import java.util.*;
import java.lang.*;
public class Main
{
    static class Kala
    {
        int id;
        String info;
        String size;
        String exinfo;
        int price;
        
        //-------------------------------
        void addKala(int p1 , String p2 , String p3 , String p4 , int p5 )
        {
            id=p1;
            info=p2;
            size=p3;
            exinfo=p4;
            price=p5;
        }
        //-------------------------------
        void printKala()
        {
            System.out.println();
            System.out.println("Kalay Shomareh "+(id+1));
            System.out.println("-----------------");
            System.out.println("Moshakhasat : "+info);
            System.out.println("Item Size = "+size);
            System.out.println("price per 1 Item = "+price);
            System.out.println();
            System.out.println("Addition Info: "+exinfo);
        }
        //-------------------------------
        void virayesh()
        {
            int en;
            Scanner vr = new Scanner(System.in);
            System.out.println("Which of item to be modified : ");
            System.out.println(" 1) info");
            System.out.println(" 2) size");
            System.out.println(" 3) price");
            System.out.println(" 4) addition info");

	        System.out.println(" enter your select ");
	        en = vr.nextInt();
	        //-------------------------------
	        switch(en)
	        {
	            case 1 : System.out.println("enter new info : ");
	                     info=vr.next();
	                     break;
	                     
	            case 2 : System.out.println("enter new size : ");
	                     size=vr.next();
	                     break;
	                     
	            case 3 : System.out.println("enter new price : ");
	                     price=vr.nextInt();
	                     break;
	                     
	            case 4 : System.out.println("enter new addition info : ");
	                     exinfo=vr.next();
	                     break;
	                     
	            default : break;
	        }
        }
        //-------------------------------
        void deleteKala()
        {
            id=-1;
            info="";
            size="";
            exinfo="";
            price=-1;
        }
        //-------------------------------

        
    }  //end class
    static void cls()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
//**************************************************    
	public static void main(String[] args) 
	{
	    //-------------------------------
	    //   Moarefi 
	    Scanner input = new Scanner(System.in);
	    int flag=1 , en ;
        String inf;
        String sz;
        String exf;
        int pr;
	    int i , m , t , shomareh_kala=0 ;
	    String str;
	    Kala K[] = new Kala[50];
	    //-------------------------------
	    //  Nemayesh menu
	    while(flag==1)
	    {
            System.out.println(" 1) sabt mahsool");	        
	        System.out.println(" 2) nemayesh mahsoolat");
            System.out.println(" 3) nemayesh mahsool");

            System.out.println(" 4) virayesh mahsool");
            System.out.println(" 5) hazf mahsool");
            System.out.println(" 0) khorooj az barnameh");
            System.out.println("----------------------------------");
	        System.out.println("  entekhab khod ra vared konid : ");
	        en = input.nextInt();
	        //-------------------------------
	        switch(en)
	        {
	            case 1 :
	                    K[shomareh_kala] = new Kala();
	                    cls();
                        System.out.println("enter info : ");
                        inf=input.next();
                        System.out.println("enter size : ");
	                    sz=input.next();
	                    System.out.println("enter price : ");
	                    pr=input.nextInt();
                    	System.out.println("enter addition info : ");
	                    exf=input.next();
	                    K[shomareh_kala].addKala(shomareh_kala,inf,sz,exf,pr);
	                    System.out.println("Kala ba moshakhasat zir darj shod: ");
	                    K[shomareh_kala].printKala();

                        shomareh_kala++;
                        break;
                //-------------------------------    
                case 2:
	                    cls();
	                    System.out.println("Kalahay Sherkat: " );
	                    for(i=0;i<shomareh_kala;i++)
	                    {
	                        System.out.println("ID= "+K[i].id);
	                        System.out.println("Name= "+K[i].info);
	                    }
	                     
	                    break; 
                //-------------------------------  
                case 3:
	                    cls();
	                    System.out.print("ID kala ra vared konid :");
	                    t = input.nextInt();
	                    if((t>shomareh_kala) | (t<0)) 
	                      System.out.println("shomareh kala sahih nist!!!!");
                        else 
	                      K[t].printKala();
	                    break;
	            //-------------------------------  
                case 4:
	                    cls();
	                    System.out.print("ID kala ra vared konid :");
	                    t = input.nextInt();
	                    if((t>shomareh_kala) | (t<0)) 
	                      System.out.println("shomareh hesab sahih nist!!!!");
                        else 
	                        K[t].virayesh();
	                    break;
	            //-------------------------------  
                case 5:
	                    cls();
	                    System.out.print("ID kala ra vared konid :");
	                    t = input.nextInt();
	                    if((t>shomareh_kala) | (t<0)) 
	                      System.out.println("shomareh hesab sahih nist!!!!");
                        else 
	                        K[t].deleteKala();
	                    break;
	                   
	            //-------------------------------  
     
                default : flag=0;        
	        }  // end weitch
	    } // end while 
	} // end main
}
