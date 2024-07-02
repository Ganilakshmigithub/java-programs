import java.util.Scanner;
class duplicatecount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size: ");
        int n=sc.nextInt();
        System.out.println("enter elements in array:");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j])
                count++;
            }
        }
        if(count>0)
            System.out.print("count of duplicate elements is: "+count);
            count=0;
    }
}
