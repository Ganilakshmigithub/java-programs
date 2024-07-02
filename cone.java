import java.util.Scanner;
class cone{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius: ");
        int r=sc.nextInt();
        System.out.println("enter height: ");
        int h=sc.nextInt();
        double volume=1.0/3.0 * Math.PI * r * r * h;
        System.out.println("cone volume is: "+volume);
        double slantheight=Math.sqrt(r*r+h*h);
        System.out.println("slant height is: "+slantheight);
        double area=Math.PI*r*(r+slantheight);
        System.out.print("area is: "+area);
    }
}
