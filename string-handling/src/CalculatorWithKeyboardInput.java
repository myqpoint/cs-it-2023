import java.io.IOException;

public class CalculatorWithKeyboardInput {
    public static void main(String[] args) {
        try {


            //Taking input as number1
            byte[] forNumber1 = new byte[10];
            System.out.print("Enter number 1: ");
            System.in.read(forNumber1);
            String str1 = new String(forNumber1);
            String trimmedNumber1 = str1.trim();
            int number1 = Integer.parseInt(trimmedNumber1);
            System.out.println(number1);

            System.out.println();

            //Taking input as number2
            byte[] forNumber2 = new byte[10];
            System.out.print("Enter number 2: ");
            System.in.read(forNumber2);
            String str2 = new String(forNumber2);
            String trimmedNumber2 = str2.trim();
            int number2 = Integer.parseInt(trimmedNumber2);
            System.out.println(number2);

            byte[] operation = new byte[10];
            System.out.println("Enter the operation ");
            System.out.println("1 for Addition ");
            System.out.println("2 for Subtraction");
            System.out.println("3 for Multiplication ");
            System.out.println("4 for Division");

            System.in.read(operation);
            String str3 = new String(operation);
            String operation2 = str3.trim();
            int operations = Integer.parseInt(operation2);
            System.out.println(operations);
            if (operations == 1) {
                System.out.println("The Addition is " + sum(number1, number2));
            } else if (operations == 2) {
                System.out.println("The Subtraction is " + sub(number1 , number2));
            } else if (operations == 3) {
                System.out.println("The Multiplication is " + mul(number1 , number2));
            } else if (operations == 4) {
                System.out.println("The Division is " + div(number1 , number2));
            } else {
                System.out.println("Invalid choice");
            }


        } catch (IOException | NumberFormatException ie) {
            System.err.println(ie);
        }
    }

        public static int sum(int number1, int number2) {

            return number1 + number2;
        }

        public static int sub(int number1, int number2) {

            return number1 - number2;
        }

        public static int mul(int number1, int number2) {

            return number1 * number2;
        }

        public static float div( float number1, float number2) {

            return number1 / number2;




    }
}

