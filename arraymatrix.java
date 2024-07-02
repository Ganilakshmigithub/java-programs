// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class arraymatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of row 1: ");
        int r=sc.nextInt();
        System.out.print("enter size of col 1: ");
        int c=sc.nextInt();
        System.out.println("enter elements in the first matrix");
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("enter size of row 2: ");
        int r2=sc.nextInt();
        System.out.print("enter size of col 2: ");
        int c2=sc.nextInt();
        System.out.println("enter elements in the second matrix");
        int[][] a2=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                a2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("enter range of row to add matrix: ");
        int rr=sc.nextInt();
        System.out.print("enter range of col to add matrix: ");
        int cc=sc.nextInt();
       int sum[][]=new int [3][3];
       for(int i=0;i<rr;i++){
           for(int j=0;j<cc;j++){
               sum[i][j]=a[i][j]+a2[i][j];
           }
       }
       System.out.println("sum of two matrix is: ");
       for(int i=0;i<rr;i++){
           for(int j=0;j<cc;j++){
               System.out.print(sum[i][j]+" ");
           }
           System.out.println(" ");
       }
              int mul[][]=new int [3][3];
       for(int i=0;i<rr;i++){
           for(int j=0;j<cc;j++){
               mul[i][j]=a[i][j]*a2[i][j];
           }
       }
       System.out.println("multipication of two matrix is: ");
       for(int i=0;i<rr;i++){
           for(int j=0;j<cc;j++){
               System.out.print(mul[i][j]+" ");
           }
           System.out.println(" ");
       }

       
    }
}
