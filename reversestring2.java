import java.util.Scanner;
class reversestring2{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
        String n=sc.nextLine();
        StringBuilder r=new StringBuilder(n);
        r.reverse();
        System.out.print(r);
    }
}
