import java.util.Scanner;
public class swap{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter first number:");
int a=sc.nextInt();
System.out.println("enter second number:");
int b=sc.nextInt();
a=((a+b)-(b=a));
System.out.println("after swapping a value,"+a);
System.out.println("after swapping b value,"+b);
}
}
