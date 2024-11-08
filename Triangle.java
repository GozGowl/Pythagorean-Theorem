import java.util.Scanner;

public class Triangle {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // gets the user input
        System.out.println("Enter the value of the side A:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of the side B:");
        double b = sc.nextDouble();
        System.out.println("Enter the side C (hypotenuse):");
        double c = sc.nextDouble();
        sc.close();
        
        // calls the pythagorean theorem function
        double[] sides = {a, b, c};
        double triangle = getPythagorean(sides);
        System.out.println("The missing side is " + triangle);
    }

    // method to calculate the hypotenuse or the missing side of a triangle
    public static double getPythagorean(double[] params) {
        double a = params[0];
        double b = params[1];
        double c = params[2];

        // logic gates using logical operators, returns true only if two of the values are true
        boolean ab = a > 0 && b > 0;
        boolean bc = b > 0 && c > 0;
        boolean ac = a > 0 && c > 0;
        boolean x = ab || ac;
        boolean output = (x && !bc) || (!x && bc);

        // checks the missing value of the triangle to calculate
        double result = 0;
        if (output) {
            if (a == 0) {
                result = a = Math.sqrt((c * c) - (b * b));
            }
            if (b == 0) {
                result = b = Math.sqrt((c * c) - (a * a));
            }
            if (c == 0) {
                result = c = Math.sqrt((a * a) + (b * b));
            }
        } else if (a > 0 && b > 0 && c > 0) {
            throw new ArithmeticException("You have all values, there is nothing to calculate");
        } else {
            throw new ArithmeticException("Invalid input, at least two values are required");
        }
        return result;
    }
}