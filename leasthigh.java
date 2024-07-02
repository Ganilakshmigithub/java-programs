import java.util.*;
class leasthigh{
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        System.out.print("enter size of array: ");
        int n=sc.nextInt();
        System.out.println("enter elements:");
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int s:a){
            System.out.print(s+" ");
        }
        System.out.println();
            if(a.length>=2){
                int sec=a[a.length-2];
                System.out.println("second highest is "+sec);
            }
            else{
                System.out.println("invalid length");
            }
            if(a.length>=2)
        System.out.print("second least element is:"+a[1]);
}
}

