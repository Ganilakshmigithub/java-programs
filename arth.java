import java.util.Scanner;
class arth{
    public static void add(int a,int b){
        int sum=a+b;
        System.out.println("addition: "+sum);
    }
    public int mul(int c,int d){
        int mul=c*d;
        return mul;
    }
    public static void div(int g,int h){
        double d=g/h;
        System.out.println("divison: "+d);
    }
    public double rem(int i,int j){
        double r=i%j;
        return r;
    }
    public int sub(int k,int l){
        int sub=k-l;
        return sub;
    }
    public static void mod(int r,int p){
        int mod=r|p;
        System.out.println("modulus: "+mod);
    }

public static void main(String args[]){
    arth a=new arth();
    add(10,20);
    System.out.println("multiplication: "+a.mul(10,20));
    div(20,10);
    System.out.println("remainder: "+a.rem(20,10));
    System.out.println("subtraction: "+a.sub(30,10));
    mod(200,10);
}
}
