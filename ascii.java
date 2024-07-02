import java.util.*;
class ascii{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1: ");
        String s1=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            sb.append((int)c);    //if char is aeiou it prints the ascii value of that integer
        }
        else{
            sb.append(c);
        }
        }
        System.out.print(sb.toString());
        }
}
