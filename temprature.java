import java.util.Scanner;
class temprature{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter kalvins:k-->");
        double k=sc.nextDouble();
        System.out.print("enter celsius:c-->");
         double c=sc.nextDouble();
         System.out.print("enter fahrenheit:f-->");
         double fah=sc.nextDouble();
        double f=(k-273.15)*9/5+32;   // kelvin to fahrenheit
        double kelvin=c+273.15;       //celsius to kelvin
        double cel=(f-32)*5/9;           //fahrenheit to celsius
        System.out.println(f+"F");
        System.out.println(kelvin+"K");
        System.out.println(cel+"C");
    }
}
