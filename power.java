class power{
    public static void main(String[]args){
        if(args.length==0)
        System.out.print("number us missing");
        int n=Integer.parseInt(args[0]); //parsing int value for args string value
         int m=Integer.parseInt(args[1]);
        System.out.println(Math.pow(n,m)); //for exponential
    }
}
