public class FibonacciSeries {
    public static void main(String[] args) {
        series(10);
    }

    public static void series(int range) {
        int n1 = 0, n2 = 1, n3;
        System.out.print("0" + " " + "1");
        for (int i = 2; i < range; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
