mport java.util.Scanner;
class sumpro2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int last=n%10;
        int first=n/10000;
        int sum=first+last;
         System.out.println("sum of first and last numbers:"+sum);
        int mid=(n/10)%1000;
        int r=mid%10;
        mid=mid/10;
        int i=mid%10;
        mid=mid/10;
        int j=mid%10;
        int pro=r*i*j;
        System.out.println("product is: "+pro);
    }
}
