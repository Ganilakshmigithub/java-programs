import java.util.*;
class  missing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
               int n=sc.nextInt();
               System.out.print("enter elements: ");
               int[] a=new int[n];
               for(int i=0;i<a.length;i++){
                   a[i]=sc.nextInt();
               }
               for(int i=0;i<a.length;i++){
                   System.out.print(a[i]+" ");
               }
               System.out.print("enter range:");
               int s=sc.nextInt();
               int sum1=0;
               for(int i=0;i<a.length;i++){
                   sum1=sum1+a[i];
               }
               System.out.println("sum of elements in the array:"+sum1);
               int sum2=0;
               for(int i=1;i<=s;i++){
                   sum2=sum2+i;
               }
               System.out.println("sum of elements in the range is:"+sum2);
               
               System.out.println("the missing number is: "+(sum2-sum1));
}
}
