import java.util.Scanner;
class whitespaces{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string: ");
        String n=sc.nextLine();
       String whitespaces=n.replaceAll("\\s","");  // \\s is white space replaced with nothing
       System.out.print("string without whitespaces is:"+whitespaces);
    }
}
