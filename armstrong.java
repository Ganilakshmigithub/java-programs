import java.util.Scanner;
public class armstrong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter no:");
int num=sc.nextInt();
int temp,sum=0,rem=0;
temp=num;
while(num!=0){
rem=num%10;  //ex:153-->153%10=3 15%10=5  1%10=1
sum=sum+(rem*rem*rem); // 0+3*3*3=27 5*5*5=125 -->125+27=152  152+1=153
num=num/10; //153/10=15 15/10=1 1/10=0  exceution stops as n=0
}
if(temp==sum)
System.out.print("Given no is armstrong");
else
System.out.print("Given no is not armstrong");
}
}

