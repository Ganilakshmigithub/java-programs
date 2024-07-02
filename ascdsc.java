import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class ascdsc{
    public static void main(String[] java){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        System.out.println("enter the elements in a array:");
        Integer[] a=new Integer[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("asc order is:");
        Arrays.sort(a);
        for(int num:a){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("dsc order is:");
         Arrays.sort(a,Collections.reverseOrder());   //Collections.reverseOrder() method is used to print descending array
            for(int s:a){
                System.out.print(s+" ");
        }
    }
}
