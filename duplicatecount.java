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
            int count=1; //every item will have atleast count of 1
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                count++;
                a[j]=-1; //visted item will be -1
                }
            }
        if(a[i]!=-1&&count>1){  //if item isnt visited and have a count more than 1
            System.out.println(a[i]+" element occurs "+count+" times");
            count=0;
        }
        }
    }
}

