package quadratic;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter coefficient a: ");
                double a = scanner.nextDouble();

                System.out.print("Enter coefficient b: ");
                double b = scanner.nextDouble();

                System.out.print("Enter coefficient c: ");
                double c = scanner.nextDouble();

                double discriminant = b * b - 4 * a * c;

                if (discriminant > 0) {
                    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.println("The equation has two real roots: " + root1 + " and " + root2);
                } else if (discriminant == 0) {
                    double root = -b / (2 * a);
                    System.out.println("The equation you provided has one  root: " + root);
                } else {
                    System.out.println("The equation you provided has no roots.");
                }

                scanner.close();
            }
        }


