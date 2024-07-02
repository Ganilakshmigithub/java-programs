import java.util.Scanner;
class permcomb{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value: ");
        int n=sc.nextInt();
        System.out.println("enter r value: ");
        int r=sc.nextInt();
        if(r>n){
            System.out.println("error r value should be less than n try again");
        }
        else{
            int npr=factorial(n)/factorial(n-r);
            System.out.println(n+" and "+r+"permutation is: "+npr);
            int ncr=factorial(n)/(factorial(r)*factorial(n-r));
            System.out.println(n+" and "+r+"combination is: "+ncr);
            
        }
    }
    public static int factorial(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
}
