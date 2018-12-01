import java.io.*;
import java.util.*;

class Demo{
    public static void main(String args[]){
        int n,j;
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        for( j=0;j<n;j++)
        {
            if(a[j]==a[j+1])
            {
                System.out.println(a[j]);
            }
        }
    }
}