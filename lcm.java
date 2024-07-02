import java.util.Scanner;
public class lcm{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
int gcd=0;
for(int i=1;i<=a;i++){
if(a%i==0&&b%i==0)
{
gcd=i;                    // finding gcd by finding highest divisor of both a and b
}
}
int lcm=a*b/gcd;     //lcm=a*b/gcd
System.out.print("lcm of  a and b is,"+lcm);
}
}
