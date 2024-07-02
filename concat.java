import java.util.Scanner;
class concat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string 1: ");
        String n1=sc.nextLine();
        System.out.print("enter a string 2: ");
        String n2=sc.nextLine();
        String result=n1+" "+n2;
        System.out.println("the concatnated string is: "+result);
        
    }
}
