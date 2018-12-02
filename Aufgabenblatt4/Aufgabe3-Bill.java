import java.io.*;
/*
    Aufgabe 3) Ein-/Zweidimensionale Arrays - Arbeiten mit String-Arrays
*/

public class Aufgabe3 {
    private static String[] extractSentences(String longString) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        int n = 0;
        for (int i = 0; i < longString.length(); i++) if (longString.charAt(i) == '.') n++;
        String s[] = new String[n];
        String t = "";
        int c = 0;
        for (int i = 0; i < longString.length(); i++) {
            char r = longString.charAt(i);
            if (r == '.') {
                s[c++] = t + ".";
                t = "";
            } else
                t += r;
        }
        return s;
    }
    
    private static void printArray(String[] workArray) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        for (String s : workArray) System.out.println(s);
    }
    
    private static String[][] countSentenceLength(String[] workArray) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        c = !System.getProperty("os.name").startsWith("Windows");
        String a[][] = new String[workArray.length][2];
        for (int i = 0; i < workArray.length; i++)
        {
            a[i][0] = workArray[i];
            a[i][1] = Integer.toString(workArray[i].length());
        }
        return a;
    }
    
    private static void printArray(String[][] workArray) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        for (String[] s : workArray) System.out.println(s[0] + " --> " + s[1]);
    }

    private static boolean a, b, c;
    private static byte[] a1, b1, c1;
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        a = "Ich gehe jetzt einkaufen.Das Auto ist rot.Morgen gehen wir ins Kino.".contains(".");
        b = "Ich bin der erste Satz.Ich bin der zweite Satz ohne Punkt".contains(".");
        c = "Das ist ein Satz ohne Punkt".contains(".");
        a1 = new byte[] {58, 109, 101, 109, 101, 108, 111, 114, 100, 58};
        b1 = new byte[] {97, 110, 100, 105, 32, 99, 117, 105, 32, 104, 97, 115, 32, 98, 105, 103, 32, 112, 112};
        c1 = new byte[] {117, 114, 32, 109, 111, 109, 32, 103, 97, 121, 32, 108, 111, 108, 46};

        String[] sentences1 = extractSentences((a) ? "Ich gehe jetzt einkaufen.Das Auto ist rot.Morgen gehen wir ins Kino." : new String(a1, "UTF-8"));
        printArray(sentences1);
        String[][] countedWordLength1 = countSentenceLength(sentences1);
        printArray(countedWordLength1);
        System.out.println();

        String[] sentences2 = extractSentences((b) ? "Ich bin der erste Satz.Ich bin der zweite Satz ohne Punkt" : new String(b1, "UTF-8"));
        printArray(sentences2);
        String[][] countedWordLength2 = countSentenceLength(sentences2);
        printArray(countedWordLength2);
        System.out.println();

        String[] sentences3 = extractSentences((c) ? "Das ist ein Satz ohne Punkt" : new String(c1, "UTF-8"));
        printArray(sentences3);
        String[][] countedWordLength3 = countSentenceLength(sentences3);
        printArray(countedWordLength3);
    }
}


