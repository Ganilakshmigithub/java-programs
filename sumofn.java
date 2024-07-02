import java.util.Scanner;
class sumofn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n){
            sum=sum+i;
            i++;
        } 
                System.out.print("sum of numbers is,"+sum);

        }
}
