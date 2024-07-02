import java.util.Scanner;
class factors{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the number:");
int n=sc.nextInt();
int i=1;
while(i<=n){
if(n%i==0)
System.out.println("factors of given number is:"+i);
i++;
}
}
}
