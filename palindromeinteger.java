import java.util.Scanner;
class palindromeinteger{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
int reverse=0;
int temp;
temp=n;
while(n!=0){
int d=n%10;           //1234%10=4       123%10=3      12%10=2      1%10=1
reverse=reverse*10+d;  //0*10+4=4      4*10+3=43        43*10+2=432     432*10+1=4321
n=n/10;                //1234/10=123  123/10=12           12/10=1        1/10=0 n is 0 now exceution stops 
}
if(temp==reverse)
System.out.print(temp+"is a palindrome number");
else
System.out.print(temp+"is not a palindrome number");
}
}
