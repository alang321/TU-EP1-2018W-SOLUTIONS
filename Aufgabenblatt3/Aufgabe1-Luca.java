/*
    Aufgabe 1) Methoden rufen Methoden auf und überladen von Methoden
*/
public class Aufgabe1 {
    
    public static void main(String[] args) {

    }

    public static int calcProduct(int a, int b) {
        return a * b;
    }

    public static double calcProduct(double a, double b) {
        return a * b;
    }

    /*
     *  Zusatzfragen:
     *  1)  Es können zwei Methoden mit dem gleichen Namen vorkommen, solange die Parameter verschieden sind
     *  2)  Der int wird als double interpretiert, also die methode mit zwei doubles ausgeführt
     */

    public static int multNew(int m, int n) {
        int result = 0;
        while (isGreater(n, 0)) {
            result = add(result, m);
            n = add(n, -1);
        }
        return result;
    }

    private static boolean isGreater(int n, int i) {
        return n > i;
    }

    private static int add(int result, int m) {
        return result + m;
    }

    public static int mult(int m, int n) {
        int result = 0;
        while (n > 0) {
            result += m;
            n--;
        }
        return result;
    }
}
