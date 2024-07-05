import java.util.*;
class Argsprime{
    public static void main(String[] args){
        if(args.length==0){
            System.out.print("number is missing");
            return;
        }
        int n=Integer.parseInt(args[0]);
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            prime=false;
            break;
        }
        if(prime)
        System.out.println(n+" is a prime number");
        else
        System.out.println(n+"  is not a prime number");
    }
}
