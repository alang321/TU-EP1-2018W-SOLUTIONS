/*
    Aufgabe 1) Variablen, Datentypen, Typumwandlungen und Strings
*/
public class Aufgabe1 {

    public static void main(String[] args) {

        // A) Variablen Deklarationen und Typecasting

        //  a)
        float a = 1234e-3f;
        float b = 1.23f;
        double c = 1.234e3;
        double d = 43.21;
        long e = 1234L;
        int f = 0xa;
        int g = 014;
        char h = 'Z';
        char i = ' ';

        //  b)
        byte j = 123;
        short k = 4321;

        //  c)
        String out = a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " +
                g + ", " + h + ", " + i + ", " + j + ", " + k;
        System.out.println(out);

        //  d)
        double prod = (double) (int) a * (int) b * (int) c * (int) d * e * f * g * h * i * j * k;
        System.out.println(prod);

        //  e)
        int sum = (int) (a + b + c + d + e + f + g + h + i + j + k);
        System.out.println(sum);

        //  f)
        int sumOfBytes = (byte) a + (byte) b + (byte) c + (byte) d + (byte) e + (byte) f +
                (byte) g + (byte) h + (byte) i + (byte) j + (byte) k;
        System.out.println(sumOfBytes);

        //  z4)
        String st = "Lehrveranstaltung";
        System.out.println(st + i + c);
        System.out.println(i + c + st);


        // B) String API kennenlernen und anwenden
        // Link zum Nachlesen:
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

        String sentence = "Aufgabenblatt1 besteht aus 4 Aufgaben!";

        System.out.println();

        //  a)
        System.out.println(sentence.charAt(10));

        //  b)
        System.out.println(sentence.length());

        //  c)
        System.out.println(sentence.isEmpty());

        //  d)
        System.out.println(sentence.startsWith("Auf"));

        //  e)
        //      a.
        System.out.println(sentence.substring(27));
        //      b.
        String eb = sentence.substring(0, 13);
        System.out.println(eb);

        //  f)
        System.out.println(sentence.concat(eb));

        //  g)
        System.out.println(sentence.replace('e', 'X'));

        //  h)
        System.out.println(sentence.replace("aus", "AUS"));

        //  i)
        System.out.println(sentence.substring(27, 37).toUpperCase());

        //  j)
        System.out.println(sentence.toLowerCase());

    }
}




