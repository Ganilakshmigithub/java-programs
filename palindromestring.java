import java.util.Scanner;
public class palindromestring{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter a string:");
String s=sc.nextLine();
String r="";
char letters[]=s.toCharArray();
for(int i=letters.length-1;i>=0;i--){
    r=r+letters[i];
}
if(s.equals(r))
System.out.print(s+",is a palindrome string");
else
System.out.print(s+",is not a palindrome string");
}
}

