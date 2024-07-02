import java.util.*;
class alphastring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1: ");
        String s1=sc.nextLine();
        char[] array=s1.toCharArray();  //converting string into char array
        Arrays.sort(array);             //sorting the array to get alphabetical order
        String sort=new String(array);  // again converting into string 
        System.out.print("string after alphabetical order: "+sort);
    }
}
