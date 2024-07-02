import java.util.*;
class duplicatechar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1: ");
        String s1=sc.nextLine();
        System.out.print(resultstring(s1));
    }
    public static String resultstring( String str1){
        LinkedHashSet<Character> uniqueWords = new LinkedHashSet<>();    //hashmap to store unqiue                                                                     characters
        for(int i=0;i<str1.length();i++){            //iterate string and add every char into hashmap                                                                                    
            uniqueWords.add(str1.charAt(i)); 
        }
        StringBuilder result=new StringBuilder(); 
        //create string builder class to append and return it
        for(Character c:uniqueWords){          // create a string builder class and add the unqiue chars into  chars and return it
            result.append(c);
        }
        return result.toString();
        
}
}
