import java.util.Scanner;
class factor{
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.print("enter number: ");
         int n=sc.nextInt();
         int factor=0;
         for(int i=1;i<n;i++){
             if(n%i==0)
             System.out.println(i);
         if(n%i==0)
         factor++;
         }
         System.out.println("count of factors is: "+factor);
         if(factor>2)
         System.out.print(n+" is a even number");
         else
         System.out.print(n+ " is a prime number");
     }
}
