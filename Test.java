import java.util.*;
import java.io.*;

class Test
{
   public static void main(String args[]) throws IOException
   {
       String name;
       int hr;
       double ra,tax,gpay,net;
       int i=0;
  
       Scanner scan = new Scanner(System.in);

       while(i<10)
       {
           System.out.println("Enter Name or -999");
           name=scan.next();

           if(name.equals("-999")) System.exit(0);

           System.out.println("Enter Hours");
           hr=scan.nextInt();
           
              
           System.out.println("Enter Rate");
           ra=scan.nextDouble();
           

           gpay=hr*ra;

           if(gpay>=600)
               tax=gpay*21/100;
           else if(gpay>=300)
               tax=gpay*18/100;
           else if (gpay>=100)
               tax=gpay*12/100;
           else
               tax=gpay*6/100;

           net = gpay-tax;
           File outFile = new File ("Payout.txt");
           FileWriter fWriter = new FileWriter (outFile);
           PrintWriter pWriter = new PrintWriter (fWriter);
           pWriter.println (name+","+hr+","+ra+","+tax+","+gpay+","+net);
  
       }
   }
}