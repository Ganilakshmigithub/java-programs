import java.util.*;
class duplicateword{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1: ");
        String s1=sc.nextLine();
        System.out.print(resultstring(s1));
    }
    public static String resultstring( String str1){
        String[] words=str1.split("\\s+");
        Set<String> uniqueWords = new LinkedHashSet<>();  //used to store unqiue caharacters in a string
        Collections.addAll(uniqueWords,words);  // that words will be added into the hashset
        StringBuilder result=new StringBuilder();
        for(String word:uniqueWords){
            result.append(word).append(" ");  // result will be appended into string builder
        }
        return result.toString().trim();    // returns string builder class to string
    }
}
