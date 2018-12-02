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
        for (int i = 0; i <= workArray.length; i++) {
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
    //**** i dont speak deutsch :(( sehr traurig alexa bitte spiel despacito ***
    //**************************************************************************
    //Frage 1:
    // i <= workArray.length is not a valid index
    // you should do i < workArray.length; instead
    //Frage 2:
    // a return is not needed, since a reference
    // to the array is passed in the function parameters
    //Frage 3:
    // copiedArray is assigned to a reference to filledArray
    //Frage 4:
    // new int[15] changes the reference. this means the workArray
    // in main() won't be changed

    // ZUSATZ FRAGEN
    // 1. int. short, byte, char also work since they are casted to int
    // 2. no. it is automatically filled with 0's if you do new int[x]
    // 3. You can't resize a java array. you need to make a new array with a different size and copy the contents of the old array over.
    // 4. you can use Object.clone(),
}

