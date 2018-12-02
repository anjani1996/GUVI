import java.io.*;
import java.util.*;

class Demo1{
    public static void main(String args[]){
        int j;long n,count=0;
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        for( j=0;j<n;j++)
        {
            if(a[j]==a[j+1])
            {
                count++;
}
        }
            System.out.println(count);
            
    }
 
}