import java.util.Scanner;
class negarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        System.out.println("enter elements in a array: ");
        int[] a=new int[n];
        int count=0;
        for(int i=1;i<a.length;i++){
            a[i]=sc.nextInt();
        }
       for(int s:a){
           if(s<0)
           count++;
       }
        System.out.print("count is:"+count);
        
    }
}
