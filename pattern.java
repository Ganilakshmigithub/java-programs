import java.util.Scanner;
class pattern{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter rows: ");
int r=sc.nextInt();
for(int i=1;i<=r;i++){
if(i%2==0){
for(int j=1;j<=r;j++){
System.out.print("0"+" ");
}
}
else{
for(int j=1;j<=r;j++){
System.out.print("1"+" ");
}
}
System.out.println();
}
}
}
