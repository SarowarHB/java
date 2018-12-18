package algorithom;

import java.util.Scanner;

public class Algorithom {

    public static void main(String[] args) {
        
        int a[]=new int[100];
       int n,i,j;
       
       Scanner hp = new Scanner(System.in);
        System.out.print("Enter number of element = ");
        n= hp.nextInt();
        System.out.print("enter elements = ");
        for ( i = 0; i < n; i++) {
            
           a[i]=hp.nextInt();
            
        }
        
        int max=a[0];
        System.out.print("largest number is = ");
        for ( i = 0; i < n; i++) {
            if(a[i]>max)
            {
               max=a[i]; 
            }
        }
        System.out.println(max);
        
       int min=a[0];
        System.out.print("smallest number is =");
        
        for ( i = 0; i < n; i++) {
            
            if(a[i]<min)
            {
                min=a[i];
            }
            
        }
        System.out.println(min);
        
        int avg,sum=0;
        System.out.print("average is = ");
        
        for ( i = 0; i < n ; i++) {
            
            sum=sum+a[i];
        }
        avg=sum/n;
        System.out.println(avg);
        
        
        System.out.print("Ascending short is =");
        int temp;
        
        for ( i = 0; i < n; i++) {
            for ( j = 0; j < n; j++) {
                
                if(a[j]>a[i])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
           
        }
        for ( i = 0; i < n; i++) {
            
        
         System.out.print(" "+a[i]+" "); 
        }
        System.out.println();
        
      
        System.out.print("Descending short is = ");
        for ( i = 0; i < n; i++) {
            for ( j = 0; j < n; j++) {
                
                if(a[j]<a[i])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
           
        }
        for ( i = 0; i < n; i++) {
            
        
         System.out.print(" "+a[i]+" "); 
        }
        System.out.println();
        
    }
    
}
