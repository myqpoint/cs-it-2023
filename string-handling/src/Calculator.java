public class Calculator {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide three parameters...!");
        } else if (args.length > 3) {
            System.out.println("Please provide only three parameters...!");
        } else if (args.length < 3) {
            System.out.println("Please provide three parameters...!");
        } else {
            if (args[0].equalsIgnoreCase("sum")) {
                System.out.println(sum(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            } else if (args[0].equalsIgnoreCase("sub")) {
                System.out.println(sub(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            } else if (args[0].equalsIgnoreCase("mul")) {
                System.out.println(mul(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            } else if (args[0].equalsIgnoreCase("div")) {
                System.out.println(div(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            } else {
                System.out.println("You have entered wrong value");
            }
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

    public static int div(int number1, int number2) {
        return number1 / number2;
    }

}