import java.util.Scanner;
class deleteword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter sentence: ");
        String s=sc.nextLine();
        System.out.print("enter word to delete: ");
        String d=sc.nextLine();
        String m=s.replace(d,"");
        m=m.trim();
        System.out.print(m);
    }
}
