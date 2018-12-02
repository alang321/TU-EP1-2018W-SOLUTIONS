/*
    Aufgabe 3) Ein-/Zweidimensionale Arrays - Arbeiten mit String-Arrays
*/
public class Aufgabe3 {

    private static String[] extractSentences(String longString) {
        int sentenceCount = 0;
        for (int i = 0; i < longString.length(); i++) {
            if (longString.charAt(i) == '.') sentenceCount++;
        }
        String[] sentences = new String[sentenceCount];
        int pos = 0;
        String substring = "";
        for (int i = 0; i < longString.length(); i++) {
            char currentChar = longString.charAt(i);
            substring += currentChar;
            if (currentChar == '.') {
                sentences[pos++] = substring;
                substring = "";
            }
        }
        return sentences;
    }

    private static void printArray(String[] workArray) {
        for (String str : workArray) System.out.println(str);
    }

    private static String[][] countSentenceLength(String[] workArray) {
        String[][] results = new String[workArray.length][2];
        for (int i = 0; i < workArray.length; i++) {
            results[i][0] = workArray[i];
            results[i][1] = Integer.toString(workArray[i].length());
        }
        return results;
    }

    private static void printArray(String[][] workArray) {
        for (String[] row : workArray) {
            for (int i = 0; i < row.length; i++) {
                if (i != 0) System.out.print(" 8=> ");
                System.out.print(row[i]);
            }
            System.out.println();
        }
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

        String[] sentences3 = extractSentences("Das alles ist von GitHub kopiert");
        printArray(sentences3);
        String[][] countedWordLength3 = countSentenceLength(sentences3);
        printArray(countedWordLength3);
    }
}


