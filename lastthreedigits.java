import java.util.Scanner;
class lastthreedigits{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter number:");
int n=sc.nextInt();
int lastthree=n%1000;      //to get last 3 digits n should be divided by 1000
if(lastthree%3==0)
System.out.print(n+",is divisible by 3");
else
System.out.print(n+"is not divisible by 3");
}
}
