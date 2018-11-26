/*
    Aufgabe 1) Methoden rufen Methoden auf und überladen von Methoden
*/
public class Aufgabe1 {

    public static void main(String[] args) {
    }

    //a
    public static int calcProduct(int m, int n) {
        return m * n;
    }

    //b
    public static double calcProduct(double m, double n) {
        return m * n;
    }

    //c
    public static int multNew(int m, int n) {
        int result = 0;
        while (isGreater(n, 0)) {
            result = sum(result, m);
            n = sum(n, -1);
        }
        return result;
    }

    private static boolean isGreater(int m, int n) {
        return m > n;
    }

    private static int sum(int m, int n) {
        return m + n;
    }

    //
    public static int mult(int m, int n) {
        int result = 0;
        while (n > 0) {
            result += m;
            n--;
        }
        return result;
    }
}
