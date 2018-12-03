import java.io.*;
import java.util.*;
//import java.Collections.*;
class Large
{
     public static void main(String args[])
     {
         int i,j;
        long n,k,temp;
     long a[]=new long[10000];
     Scanner sc=new Scanner(System.in);
           n=sc.nextLong();
           k=sc.nextLong();
           
         for(i=0;i<n;i++)
          {
              a[i]=sc.nextLong();
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                 {
                     if(a[i]>a[j])
                     {
                         temp=a[i];
                          a[i]=a[j];
                          a[j]=temp;
                        }
                      }
            }
                
         
         for(i=0;i<n;i++)
          {
              if(k-1==i)
                {
                       System.out.print(a[i]);
                           break;
                    }
           }
}
}      