import java.util.*;
class capsfirst{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1: ");
        String s1=sc.nextLine();
        System.out.print(resultstring(s1));
    }
    public static String resultstring(String str1){
        String[] words=str1.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
        if(!words[i].isEmpty()){  // if string isnt empty
            sb.append(Character.toUpperCase(words[i].charAt(0)));  //coverts first letter of string into uppercase
            sb.append(words[i].substring(1).toLowerCase());       //converts remanining letters into lowercase
        }
if(i<words.length-1){   //used to provide space at the end of word
    sb.append(" ");
}
    }
      return sb.toString();
    }
}
