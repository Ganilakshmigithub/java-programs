import java.util.*;
class anagrams{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string1: ");
        String s1=sc.nextLine();
        System.out.print("enter string2: ");
        String s2=sc.nextLine();
        boolean status=true;
        String str1=s1.replace("\\s",""); //removes spaces if string have any
        String str2=s2.replace("\\s","");
        if(str1.length()!=str2.length())  //checks both length are same or not
        status=false;
        else{
        char c1[]=str1.toLowerCase().toCharArray();  //creates char array and converts to lowercse
        char c2[]=str2.toLowerCase().toCharArray();
        Arrays.sort(c1);  //sorts two char arrays to know same alphabets
        Arrays.sort(c2);
        status=Arrays.equals(c1,c2);  //cecks both have same character or not
        }
        if(status)
        System.out.print("anagrams");
        else
        System.out.print("not anagrams");
        }
}
