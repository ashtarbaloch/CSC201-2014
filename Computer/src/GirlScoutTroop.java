import java.util.Scanner;
public class GirlScoutTroop
{
	 public static void main(String args[]) {  
         int b1=0,b2=0,b3=0,b4=0,b5=0;  
         int i ;
         Scanner in=new Scanner(System.in);
         System.out.print("Total number of girls in the troop ");
         int n=in.nextInt();        
         for(i = 0 ; i < n ; i++) {  
             System.out.print("Boxes of cookies for girl #");
             System.out.print(i+1);
             System.out.print(" \t");
             int m=in.nextInt();        	 
        	 if(m>=0&&m<=10)b1++;
        	 else if(m>=11&&m<=20)b2++;
        	 else if(m>=21&&m<=30)b3++;
        	 else if(m>=31&&m<=40)b4++;
        	 else if(m>=41)b5++;
         }  
         in.close();
    	 System.out.print("TOTAL_BOXES\tNUMBER OF GIRL SCOUTS\n");
         System.out.print("0 to 10 \t");
         System.out.print(b1);
         System.out.print(" \n");
         System.out.print("11 to 20 \t");
         System.out.print(b2);
         System.out.print(" \n");
         System.out.print("21 to 30 \t");
         System.out.print(b3);
         System.out.print(" \n");
         System.out.print("31 to 40 \t");
         System.out.print(b4);
         System.out.print(" \n");
         System.out.print("41 or more \t");
         System.out.print(b5);
         System.out.print(" \n");
     } 
}