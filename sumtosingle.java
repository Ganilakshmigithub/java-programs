import java.util.Scanner;
class sumtosingle{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter a number");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++){
sum=sum+i;
}
while(sum>9)
{
int temp=0;
while(sum>0){
temp=temp+sum%10;
sum=sum/10;
}
sum=temp;
}
System.out.print("sum is"+sum);
}
}

