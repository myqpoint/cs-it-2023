import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        try {
            byte[] b = new byte[10];
            System.out.print("Enter any number: ");
            System.in.read(b);
            String str = new String(b);
            String trimmedNumber = str.trim();
            int number = Integer.parseInt(trimmedNumber);
            System.out.println(number);
        } catch (IOException ie) {
            System.err.println(ie);
        }
    }
}
