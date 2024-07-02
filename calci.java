import java.util.*;
class calci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number 1:");
               int a=sc.nextInt();
       System.out.print("enter number 2:");
       int b=sc.nextInt();
       System.out.println("addition: "+a+b);
              System.out.println("subtraction "+(a-b));
                     System.out.println("multiplication: "+a*b);
                            System.out.println("divison is: "+a/b);
           System.out.println("remainder is: "+a%b);
           System.out.println("mod is: "+(a|b));
                  
}
}
