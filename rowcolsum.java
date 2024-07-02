
import java.util.Scanner;

public class rowcolsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int r = sc.nextInt();
        System.out.print("Enter col size: ");
        int c = sc.nextInt();
        System.out.println("Enter elements in array:");
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("row sum is: ");
        for (int i = 0; i < r; i++) {
            int rsum=0;
            for (int j = 0; j < c; j++) {
                rsum=rsum+mat[i][j];
        }
        System.out.println("row "+(i+1)+"value is:"+rsum);
        }
        System.out.println("col sum is: ");
         for (int j = 0; j< c; j++) {
            int csum=0;
            for (int i = 0; i < r; i++) {
                csum=csum+mat[i][j];
        }
        System.out.println("col "+(j+1)+"value is:"+csum);
        }
    }
}

