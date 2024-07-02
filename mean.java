import java.util.*;
class mean{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int size=sc.nextInt();
        System.out.println("enter elements in a array:");
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("mean is: "+mean(a));
    }
        
        public static double mean(int[] numbers){
            double sum=0;
            for(int s:numbers){
                sum=sum+s;
            }
           double mean=sum/numbers.length;
           return mean;
        }
    }
