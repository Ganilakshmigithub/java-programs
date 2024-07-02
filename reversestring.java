import java.util.Scanner;
public class reversestring{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter name:");
String name=sc.nextLine();
char letters[]=name.toCharArray(); //creates a characters from name string gani  [g, a, n, i]
for(int i=letters.length-1;i>=0;i--){
System.out.print(letters[i]);
}
System.out.print(letters.length);
}
}
