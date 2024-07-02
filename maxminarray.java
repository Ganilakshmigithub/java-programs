import java.util.Scanner;
class maxminarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        System.out.print("enter elements: ");
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
            max=a[i];
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("maximum element in this array is: "+max);
        System.out.println("minimum element in this array is: "+min);
    }
}
