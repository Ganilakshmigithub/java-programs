import java.util.Scanner;
class twoarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    System.out.print("enter size of array row: ");
    int r=sc.nextInt();
    System.out.print("enter size of column: ");
    int c=sc.nextInt();
    System.out.println("enter rows and cols: ");
    int[][] matrix=new int[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            matrix[i][j]=sc.nextInt();
        }
}
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        System.out.print(matrix[i][j]+" ");
    }
    System.out.println(); // new line for each row
}
    
    }
}
