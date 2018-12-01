/*
    Aufgabe 1) Code-Analyse - Eindimensionale Arrays
*/
public class Aufgabe1 {

    private static void genArray(int[] filledArray) {
        int value = 1;
        for (int i = 0; i < filledArray.length; i++) {
            filledArray[i] = value;
            value += 3;
        }
    }

    private static void printFilteredArrayContent(int[] workArray) {
        int[] copiedArray = workArray;
        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] % 4 == 0) {
                copiedArray[i] = 0;
            }
        }
        printArray(copiedArray);
    }

    private static void genNewArrayContent(int[] workArray) {
        int[] helpArray = new int[15];
        int value = 2;
        for (int i = 0; i < helpArray.length; i++) {
            helpArray[i] = value;
            value += 5;
        }
        workArray = helpArray;
        printArray(workArray);
    }

    private static void printArray(int[] workArray) {
        // for (int i = 0; i <= twerkArray.length; i++)
        for (int i = 0; i < workArray.length; i++) {
            System.out.print(workArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] filledArray = new int[15];
        genArray(filledArray);
        printArray(filledArray);

        printFilteredArrayContent(filledArray);
        printArray(filledArray);

        filledArray[filledArray.length - 1] = 333;
        printArray(filledArray);

        genNewArrayContent(filledArray);
        printArray(filledArray);
    }

    //**************************************************************************
    //** Ich bin ein fetter Loser, der alles von GitHub schamlos kopiert hat. **
    //**************************************************************************
    //Frage 1:
    // Der letzte Index in einem Array ist um 1 kleiner als .length .
    //Frage 2:
    // Die Methode verändert den filledArray direkt.
    //Frage 3:
    // copiedArray zeigt auf dem gleichen Array wie workArray.
    //Frage 4:
    // Das Referenz wird nur in der Methode geändert, in main() bleibt jedoch
    // dies ungeverändert
    //Z 1:
    // int
    //Z 2:
    // Der Array selbst schon, deren Inhalte aber nicht -> wird aber
    // automautomatisch befüllt.
    //Z 3:
    // Short Answer: gar nicht.
    // Long Answer: Neuer Array, Daten kopieren .
    //Z 4:
    // .clone()
}
