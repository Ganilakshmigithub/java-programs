import java.util.Scanner;
class  eachword{
     public static String reverseword(String str){
        StringBuilder sb=new StringBuilder();
        for(String words:str.split(" ")){         // split each word in string 
            sb.append(new StringBuilder(words).reverse()).append(" ");     //each word will have string builder and after reversing each word it will append to sb 
        }
        return sb.toString().trim();  // removes extra spaces after converting string builder class into string
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        System.out.print(reverseword(str));
    }
    }
