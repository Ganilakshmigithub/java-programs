import java.util.Scanner;
public class sumofdigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int num=sc.nextInt();
int sum=0;
while(num!=0){
sum=sum+(num%10); // ex:123-->123%10=3  0+3=3  12%10-->2 3+2=5  1%10 -->1 3+2+1=6
num=num/10;  // 123/10-->12 12/10-->2 1/10-->0   now num is equals to 0 so execution stops
}
System.out.println(sum);
}
}


