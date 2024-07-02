import java.util.Scanner;
class matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] a1={{2,3,4},{4,5,2},{10,2,4}};
        int[][] a2={{12,6,3},{21,23,32},{13,14,2}};
        int sum[][]=new int[3][3];
        int mul[][]=new int[3][3];
        int div[][]=new int[3][3];
        int rem[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=a1[i][j]+a2[i][j];
            }
        }
        System.out.println("sum of two matrices are:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("product of two matrices are:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mul[i][j]=a1[i][j]*a2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("divison of two matrices are:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                div[i][j]=a1[i][j]/a2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(div[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("remainder of two matrices are:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                rem[i][j]=a1[i][j]%a2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(rem[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
        
    }
}

