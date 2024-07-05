class argsprime{
    public static void main(String[] args){
        if(args.length==0){
            System.out.print("number is missing");
        }
        int n=Integer.parseInt(args[0]);
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0)
            prime=false;
        }
        if(prime=="true)
        System.out.println(n+" is a prime number");
        else
        System.out.println(n+"  is not a prime number");
    }
}
