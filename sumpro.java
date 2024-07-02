import java.util.Scanner;
class sumpro{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int last=n%10;   //to get last number
        int first=n/1000;    //to get first number
        int sum=first+last;
        int mid=(n/10)%100;   //to get middle number
        int r=mid%10;          //get middle no last digit
        mid=mid/10;             //remove it
        int i=mid%10;            //get first digit of mid
        int pro=r*i;
        System.out.println("product is: "+pro);
        System.out.println("sum of first and last numbers:"+sum);
    }
}
