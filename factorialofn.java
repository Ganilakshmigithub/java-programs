import java.util.Scanner;
class factorialofn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int sum=1;
        int i=1;
        while(i<=n){
            sum=sum*i;
            i++;
        } 
                System.out.print("factor of numbers is,"+sum);

        }
}
