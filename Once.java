import java.io.*;
import java.util.*;
class Once
{
 public static void main(String args[])
{ 
   long a[]=new long[10000];
     int i,j;
     long n,c=0;
   Scanner sc=new Scanner(System.in);
           n=sc.nextLong();

        for(i=0;i<n;i++)
          {
              a[i]=sc.nextLong();
            }
         for (i=0;i<n;i++) 
        { 
        //int j; 
        for (j=0; j<n; j++) 
            if (i != j && a[i]==a[j]) 
                break; 
        if (j == n) 
            System.out.print(a[i]+" ");
        }
} 
}