import java.util.Scanner;
class digitsspaces{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter  string: ");
        String s=sc.nextLine();
        int countdigit=0;
        int countspace=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        if(c>='0'&&c<='9')
        countdigit++;
        else
        countspace++;
        }
        System.out.println(countdigit);
        System.out.print(countspace);
        
    }
}
