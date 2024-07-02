import java.util.Scanner;
class stringswap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1: ");
        String s=sc.nextLine();
        int length=s.length();
        char last=s.charAt(0);
        char first=s.charAt(length-1);
        String m=first+s.substring(1,length-1)+last;
        System.out.print("modified string is: "+m);
    }
}
