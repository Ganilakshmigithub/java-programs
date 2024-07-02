import java.util.Scanner;
public class circle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius:");
        double radius =sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        double circumference=2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + circumference);
        double diameter=2 * radius;
        System.out.println("diameter of the circle is: "+diameter);
    }
}

