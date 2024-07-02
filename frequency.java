import java.util.Scanner;
class frequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        System.out.print("enter elements in array:");
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter count value:");
        int c=sc.nextInt();
        int[] count=new int[c];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0)
            System.out.println(i+"frequency is "+count[i]);
        }
    }
}
