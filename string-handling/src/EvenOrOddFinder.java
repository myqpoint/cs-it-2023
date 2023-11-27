
public class EvenOrOddFinder {

    public static void main(String args[])  {

        if (isEven(11)) {
            System.out.println("Even number...!");
        } else {
            System.out.println("Odd number...!");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

}

