import java.util.*;
class insertword{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1: ");
        String s1=sc.nextLine();
        System.out.println("enter string to insert: ");
        String s2=sc.nextLine();
        System.out.print("enter position: ");
        int p=sc.nextInt();
        StringBuilder sb=new StringBuilder(s1);
        sb.insert(p,s2);
        System.out.println("after inserting the word:"+sb);
    }
}
