import java.util.Scanner;
class removevowels{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
        String n=sc.nextLine();
        System.out.print("result is:"+removevowels(n));
    }
    public static String removevowels(String n){
        String vowels="aeiouAEIOU";
        String result="";
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
        if(vowels.indexOf(c)==-1)
            result=result+c;
        }
         return result;
    }
}

