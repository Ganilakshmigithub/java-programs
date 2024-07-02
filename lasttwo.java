import java.util.Scanner;
class lasttwo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter number:");
int n=sc.nextInt();
int swapped=0;
int last=n%10;     // getting first last digit   1223-->3
n=n/10;            // removing that digit
int secondlast=n%10;      //getting second last digit  122  -->2
n=n/10;                   //removing that digit
swapped=n*10+last;            //rebuilding in reverse to swap      ex:12 -->12*10+3-->123
swapped=swapped*10+secondlast;                 //123*10+2 -->1232
System.out.print("swapped number is:"+swapped);
}
}
