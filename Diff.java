import java.io.*;
import java.util.*;
class Diff
{
  public static void main(String args[])
{
  int n;
  long  a[]=new  long[10000];

  long  b[]=new long[10000];

 Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
 int i,j;
long temp;
for(i=0;i<n;i++)
{
    a[i]=sc.nextLong();
 }
int k=n;long l=0;
for(i=0,j=0;i<n;i++)
{
    if(a[i]==i)
      {
          b[j] =a[i]; 
            l++;
          j++; 
      }

}
       
for(i=0;i<l;i++)
{
  for(j=i+1;j<l;j++)
  {
      if(b[i]>b[j])
        {
           
             temp=b[i];
             b[i]=b[j];
              b[j]=temp;
         }
 }
}
for(i=0;i<l;i++)
 {
      System.out.print(b[i]+" ");
     }

}   
} 
    