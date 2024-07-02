import java.util.Scanner;
public class reverseofineteger{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
reverse=0;
while(n!=0){
int rem=n%10;                // ex:1234%10=4     123%10=
reverse=reverse*10+rem;          //0*10+4=4         123
n=n/10;                        //1234/10=123
}
System.out.println("reversed integer is"+reverse);
}
}

