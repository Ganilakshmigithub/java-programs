import java.util.Scanner;
class neonnumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number:");
int n=sc.nextInt();    //9
int sum=0;        
int square=(n*n);        //9*9=81          
while(square!=0){
sum=sum+square%10;       //8+1=9
square=square/10;       
}
if(n==sum)
System.out.print(n+",is a neon number");
else
System.out.print(n+",is not a neon number");
}
}

