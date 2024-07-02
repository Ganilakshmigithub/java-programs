import java.util.Scanner;
public class Strong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp,sum=0;
temp=n;
while(n!=0){
int r=n%10;
int fact=1;
for(int i=1;i<=r;i++){
fact=fact*i;
}
sum=sum+fact;
n=n/10;
}
if(temp==sum)
System.out.print("Strong number"+n);
else
System.out.print("not a strong number"+n);
}
}
