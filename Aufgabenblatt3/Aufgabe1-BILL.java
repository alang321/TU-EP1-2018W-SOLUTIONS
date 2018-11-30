/*
    Aufgabe 1) Methoden rufen Methoden auf und überladen von Methoden
    billy boy
*/
public class Aufgabe1 {

    public static void main(String[] args) {
        System.out.println(multNew(5,5));
    }
    
    //TODO: Implementieren Sie hier Ihre Lösung für "calcProduct"
    private static int calcProduct(int a, int b)
    {
        return a * b;
    }

    private static double calcProduct(double a, double b)
    {
        return a * b;
    }

    //TODO: Implementieren Sie hier Ihre Lösung für die Methode "multNew"
    public static int mult(int m, int n) {
        int result = 0;
        while (n > 0) {
            result += m;
            n--;
        }
        return result;
    }

    private static boolean gt(int a,int b){
        return a > b;
    }
    private static int sum(int a, int b)
    {
        return a + b;
    }
    private static int multNew(int a, int b) {
        int r = 0;
        while (gt(b,0)) {
            r = sum(r,a);
            b = sum(b,-1);
        }
        return r;
    }

    // ZUSATZFRAGEN
    // 1. Override
    // 2. Int wird zu double gecastet
}
