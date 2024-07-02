import java.util.Scanner;
class productandsum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter start:");
int s=sc.nextInt();
System.out.print("enter end:");
int e=sc.nextInt();
int sum=0;
int product=1;
for(int i=s;i<=e;i++){
if(i%2==0)
sum=sum+i;
else
product=product*i;
}
System.out.println("sum of even numbers is:"+sum);
System.out.println("product of odd numbers is:"+product);
}
}

