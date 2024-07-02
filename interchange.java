import java.util.Scanner;
class interchange{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter number: ");
int n=sc.nextInt();
int first=n%10;    //4567%10=7
int last=n/1000;    //4567/1000=4
int middle=(n/10)%100;  //4567/10=456 -->456%100=56

int interchange=first*1000+middle*10+last;
System.out.println("original number is:"+n);
System.out.println("Interchanged number is:"+interchange);
}
}
