import java.util.Scanner;
public class primeupton{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter number:");
int num =sc.nextInt();
int count=0;
for(int i=2;i<=num;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
count=1;
break;
}
}
if(count==0)
System.out.println(i);
count=0;
}
}
}
