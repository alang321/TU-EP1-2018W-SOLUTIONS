import java.util.Scanner;

/*
    Aufgabe 2) Verschachtelte Schleifen und Verzweigungen
*/
public class Aufgabe2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("figHeight eingeben: ");
        int figHeight = sc.nextInt();
        if (figHeight > 0 && figHeight % 2 != 1) {
            System.err.println("figHeight darf nur positive ungerade Werte annehmen");
            return;
        }

        for (int row = 0; row < figHeight; row++) {
            int rowCountFromMiddle = Math.abs(row - figHeight / 2);
            for (int col = 0; col <= figHeight; col++) {
                if (col < rowCountFromMiddle || (figHeight - col) < rowCountFromMiddle) System.out.print('+');
                else if ((col == rowCountFromMiddle || (figHeight - col) == rowCountFromMiddle) && rowCountFromMiddle == 0)
                    System.out.print('|');
                else if (col == rowCountFromMiddle) System.out.print((row > figHeight / 2) ? '\\' : '/');
                else if ((figHeight - col) == rowCountFromMiddle) System.out.print((row > figHeight / 2) ? '/' : '\\');
                else System.out.print('O');
            }
            System.out.println();
        }


    }

    /*
    Z1: for-loop, laufindex von 0 bis figHeight*(figHeight+1)
    col = i % (figHeight+1)
    row = i / (figHeight+1)
    */
}

