import java.io.*;
import java.util.*;

class Sub{
    public static void main(String args[]){
        int j,i;long n,k=-1,m;
        long a[]=new long[10000];
           long b[]=new long[10000];
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
       m=sc.nextLong();
        for(i=0;i<n;i++){
            a[i]=sc.nextLong();

        }
       for(j=0;j<m;j++){
            b[j]=sc.nextLong();

        }

 for(i=0;i<n;i++)
 {
       for(j=0;j<m;j++)
          {
             if(a[i]==a[j])
                 {
                    k++;
                    
                 }
          }
    }
    if((k+1)==m)
   {
    System.out.print("YESll");
}
else if(k==0&&m==1)
{
  System.out.print("YES");

}
else
{
  System.out.print("NO");
}
}
}