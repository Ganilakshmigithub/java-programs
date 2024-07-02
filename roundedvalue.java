import java.util.Scanner;

class roundedvalue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a float number: ");
        float number = scanner.nextFloat();
        scanner.close();

        // Round to nearest integer
        long rounded = Math.round(number);

        // Display original and rounded values
        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + rounded);
    }
}

