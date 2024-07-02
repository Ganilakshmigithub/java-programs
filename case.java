import java.util.Scanner;
class  case{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string 1:");
        String str=sc.nextLine();
        System.out.println("enter string 2:");
        String s=sc.nextLine();
        System.out.println("after converting into uppercase : "+str.toUpperCase());
        System.out.println("after converting into lowercase: "+str.toLowerCase());
    }
    }
