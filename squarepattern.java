import java.util.Scanner;
class squarepattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(i==1||i==size||j==1||j==size)
                System.out.print("*");
                else
                System.out.print(" ");
                if(j!=size){
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}

