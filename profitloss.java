import java.util.*;
class profitloss{
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        System.out.print("enter selling price:");
        double sp=sc.nextInt();
        System.out.print("enter cost price: ");
        double cp=sc.nextInt();
        double loss=cp-sp;
       double lp=loss/cp*100;
        if(sp>cp){
        double profit=sp-cp;
        System.out.println("profit is:"+profit);
        double pp=profit/cp*100;
        System.out.println("profit percentage is: "+pp+"%");
        }
        else{
        System.out.println("loss is: "+loss);
        System.out.println("loss percentage is:"+lp+"%");
    }
}
}

