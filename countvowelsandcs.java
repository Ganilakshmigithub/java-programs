import java.util.Scanner;
class countvowelsandcs{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
        String s=sc.nextLine();
        int vcount=0;
        int cscount=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            vcount++;
            else
            cscount++;
        }
        System.out.println(s+" contains "+vcount+"  no of vowels");
        System.out.println(s+" contains "+cscount+" no of consonants");
    }
}
        
