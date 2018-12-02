import java.io.*;
import java.util.*;
import java.lang.String.*;
//import// java.String.*;
 class Paa
{
    public static void main(String[] args)
    {
        //System.out.println("Enter string to reverse:");
        int i,j;
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String rev = "";
           for (j=str.length()-1;j>=0;j--) 
	   {
		
		rev=rev+ str.charAt(j);
	   }
            if(rev.equals(str))
           {
                System.out.print("YES");
}
else
{
 System.out.print("NO");
}
	   
	}
}