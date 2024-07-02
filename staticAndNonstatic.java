class Bank {
    static int amount=1000;
    public static void gani(){
        System.out.println("Hello,Iam Gani");
    }
    
    public void deposit(int money){
        amount=amount+money;
        System.out.println("Amount deposited successfully");
    }
    public static void withdrawl(int money){
        amount=amount-money;
        System.out.println("Amount withdrawed successfully");

    }

    pu
    public int getcurrent(){
        return amount;
    }
    public static void main(String[] args) {
        Bank b=new Bank();
        
        gani();
        
        b.deposit(300);
        withdrawl(100);
        
        System.out.println(" after depositing amount is," + b.getcurrent());
        System.out.println(" after withdrawl amount is," + b.getcurrent());

        
        
    }
}