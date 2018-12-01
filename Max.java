import java.io.*;
import java.util.*;
class Max
{
  public static void main(String args[])
{
  int n;
  long  a[]=new  long[10000];
 Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
 int i;
long temp;
for(i=0;i<n;i++)
{
    a[i]=sc.nextLong();
 }
for(i=0;i<n;i++)
{
  for(int j=i+1;j<n;j++)
  {
      if(a[i]<a[j])
        {
           
             temp=a[i];
             a[i]=a[j];
              a[j]=temp;
         }
 }
}
for(i=0;i<n;i++)
 {
      System.out.print(a[i]);
     }
}
}    
    