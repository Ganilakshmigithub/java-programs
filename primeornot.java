import java.util.Scanner;
public class primeornot{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int num=sc.nextInt();
int count=0;
for(int i=2;i<n;i++){
if(n%i==0){
count++;
}
if(count==0){
System.out.print(n+"is a prime number");
}
}
}
}
