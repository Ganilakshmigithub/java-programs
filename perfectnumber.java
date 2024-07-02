import java.util.Scanner;
public class perfectnumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
int sum=0;                         //to add proper divisors of n in sum except n
for (int i=1;i<n;i++){           // ex: divisors of 6=1+2+3 -->6 so i will iterate from 1 to 5 
if(n%i==0)                       // for ex 6%1=0 6%2=0 so 1,2 will be added into sum next 3 also will be added it will contiune upto 5
sum=sum+i; 
}                  //0=0+2-->0=0+1+2+3=6 so its a perfect number
if(sum==n)
System.out.print(n+"is a perfect number");
else
System.out.print(n+"is a not perfect number");
}
}
