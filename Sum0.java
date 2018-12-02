import java.io.*;
import java.util.*;

class Sum0{
    public static void main(String args[]){
        int j,i;long n,count=0;
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
 for(i=0;i<n;i++)
 {
       for(j=i+1;j<n;j++)
          {
             if(a[i]+a[j]==0)
                 {
                    System.out.print(a[i]+" "+a[j]);
}
}
}
    
}
}