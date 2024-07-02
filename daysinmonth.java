import java.util.Scanner;
class daysinmonth{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter month:m-->");
        int m=sc.nextInt();
        System.out.print("enter year:y-->");
        int y=sc.nextInt();
        if((m==2)&&(y%4==0)||((y%100!=0)&&(y%400==0)))
            System.out.print("number of days in month is 29 days");
        else if(m==2)
        System.out.print("number of days in month is 28 days");
        else if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
        System.out.print("number of days in month is 31 days");
        else
        System.out.print("number of 30 days");
    }
}
