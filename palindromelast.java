import java.util.Scanner;
class palindromelast{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int n=sc.nextInt();
        int last=n%1000;
        System.out.println("last three digits are: "+last);
        int sum=0;
        while(last!=0){
            sum=sum+last%10;
            last=last/10;
        }
        System.out.println("sum of last three digits are: "+sum);
        int reverse=0;
        int temp=sum;
        while(temp!=0){
            int d=sum%10;
            reverse=reverse*10+d;
            temp=temp/10;
        }
        System.out.println("reverse of sum is:"+reverse);
        if(sum==reverse){
            System.out.println("palindrome");
            
        }
        else{
            System.out.println(" not palindrome");
        }
    }
} 
