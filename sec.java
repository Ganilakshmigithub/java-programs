// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class sec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of row:");
        int r=sc.nextInt();
        System.out.print("enter size of col:");
        int c=sc.nextInt();
        System.out.println("enter elements in the array:");
        int [][] m=new int[r][c];
        for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            m[i][j]=sc.nextInt();
        }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("row sum is: ");
        for(int i=0;i<r;i++){
            int rsum=0;
            for(int j=0;j<c;j++){
                rsum=rsum+m[i][j];
                }
           System.out.println((i+1)+"row value is:"+rsum);
        }
        System.out.println("col sum is:");
        for(int j=0;j<c;j++){
            int colsum=0;
            for(int i=0;i<r;i++){
                colsum=colsum+m[i][j];
  
        }
      System.out.println((j+1)+"col value is:"+colsum);
            
    }
}
}
