import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {


    private static final Logger logger = LogManager.getLogger(Calculator.class);

    static double x, y, z;
    static int option;
    static boolean check = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        while (check) {
            System.out.println("--- CHOOSE YOUR OPTIONS ---\n 1:CALCULATE FACTORIAL \t 2:CALCULATE SQUARE ROOT \t 3:CALCULATE POWER \t 4:CALCULATE NATURAL LOG \t 5:EXIT");
            System.out.print("ENTER YOUR CHOICE:::");
            try {
                option = sc.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Invalid input entered!!!");
                return;
            }
            switch (option) {
                case 1:
                    int factorial;
                    try {
                        System.out.print("Enter a number to calculate its factorial:::");
                        factorial = sc.nextInt();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid Input, Please enter correct number!!!");
                        return;
                    }
                    if (factorial < 0)
                        System.out.println("Factorial of negative number can not be calculated!!!");
                    else
                        System.out.println("The factorial is: " + fact(factorial));
                    break;

                case 2:
                    try {
                        System.out.print("Enter a number to calculate its square-root:::");
                        x = sc.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid Input, Please enter correct number!!!");
                        return;
                    }
                    if (x < 0)
                        System.out.println("Square root of negative number can not be calculated!!!");

                    else
                        System.out.println("The resultant output is: " + sqrt(x));
                    break;

                case 3:
                    try {
                        System.out.print("Enter two numbers separated by space for calculating power(x^y: x y):::");
                        x = sc.nextDouble();
                        y = sc.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid Input, Please enter correct number!!!");
                        return;
                    }
                    z = pow(x, y);
                    System.out.println("The Power output is: " + z);
                    break;

                case 4:
                    try {
                        System.out.print("Enter a number to calculate its natural log:::");
                        x = sc.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid Input, Please enter correct number!!!");
                        return;
                    }
                    if (x < 0)
                        System.out.println("Input number can not be less than or equal to zero for finding log!!!");
                    else
                        System.out.println("The log output is: " + log(x));
                    break;

                case 5:
                    System.out.println("!!!THANK YOU!!!");
                    check = false;
                    break;
                default:
                    System.out.println("----------- You entered wrong option,please choose a valid option!!! -----------");
                    return;
            }
        }
    }


    public static Double fact(int f) {
        double ans = 1;
        logger.info("Calculating factorial of given number:" + f);
        if (f < 0)
            ans = -1;
        else {
            try {
                if (f == 0 || f == 1) return 1.0;

                for (int i = 1; i <= f; i++) {
                    ans *= i;
                }
            } catch (Exception e) {
                logger.info("Exception occured!!");
            }
        }
        logger.info("Factorial of Input : "+ f + "is : " + ans);
        return ans;
    }

    public static double sqrt(double num) {
        double ans = 0;
        logger.info("Calculating square root of given number:" + num);
        if (num < 0)
            ans = -1;
        else
            ans = Math.sqrt(num);
        logger.info("Square root of Input : "+num+ "is : " + ans);
        return ans;
    }

    public static double pow(double num1, double num2) {
        double ans = 0;
        logger.info("Calculating power function of given numbers:" + num1 + "," + num2);
        if (num1 == 0)
            return 0;
        if (num2 == 0)
            return 1;
        try {
            ans = Math.pow(num1, num2);
        } catch (Exception e) {
            logger.info("Exception occured!!");
        }
        logger.info("Power of "+ num1 + "to "+"num2" + "is : " + ans);
        return ans;
    }


    public static double log(double num) {
        double ans = 0;
        logger.info("Calculating natural log of given number:" + num);
        if (num <= 0)
            ans = -1;
        else
            ans = Math.log(num);
        logger.info("Natural Log of "+ num+ "is : " + ans);
        return ans;
    }
}

