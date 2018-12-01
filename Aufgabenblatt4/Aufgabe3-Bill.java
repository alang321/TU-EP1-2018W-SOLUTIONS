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
    
    public static void main(String[] args) {
        String[] sentences1 = extractSentences("Ich gehe jetzt einkaufen.Das Auto ist rot.Morgen gehen wir ins Kino.");
        printArray(sentences1);
        String[][] countedWordLength1 = countSentenceLength(sentences1);
        printArray(countedWordLength1);
        System.out.println();
        
        String[] sentences2 = extractSentences("Ich bin der erste Satz.Ich bin der zweite Satz ohne Punkt");
        printArray(sentences2);
        String[][] countedWordLength2 = countSentenceLength(sentences2);
        printArray(countedWordLength2);
        System.out.println();
        
        String[] sentences3 = extractSentences("Das ist ein Satz ohne Punkt");
        printArray(sentences3);
        String[][] countedWordLength3 = countSentenceLength(sentences3);
        printArray(countedWordLength3);
    }
}


