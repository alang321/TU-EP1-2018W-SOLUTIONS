/*
    Aufgabe 4) Zweidimensionale Arrays - Berechnungen
*/
public class Aufgabe4 {
    private static int[][] genFilledArray(int centerNumber) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        if (centerNumber%2==0) return null;
        int a[][] = new int[centerNumber][centerNumber];
        int c = 1;
        for (int i = 0; i < centerNumber; i++)
        {
            for (int j = 0; j < centerNumber; j++)
            {
                a[i][j] = c;
                if (j>=(int)((centerNumber+0.5)/2.0)) c--;
                else c++;
            }
            if (i>=centerNumber/2) c = centerNumber/2-(i-centerNumber/2);
            else c = i + 2;
        }
        return a;
    }
    
    private static int[][] calcSumInArray(int[][] workArray) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        int q = workArray[0].length;
        int a[][] = new int[q][q];
        for (int i = 0; i < q; i++)
        {
            for (int j = 0; j < q; j++)
            {
                int t = 0;
                t += (i > 0 && j > 0) ? workArray[i - 1][j - 1] : 0;
                t += (j > 0) ? workArray[i][j - 1] : 0;
                t += (i < q-1 && j > 0) ? workArray[i + 1][j - 1] : 0;
                t += (i > 0) ? workArray[i - 1][j] : 0;
                t += workArray[i][j];
                t += (i < q-1) ? workArray[i + 1][j] : 0;
                t += (i > 0 && j < q-1) ? workArray[i - 1][j + 1] : 0;
                t += (j < q-1) ? workArray[i][j + 1] : 0;
                t += (i < q-1 && j < q-1) ? workArray[i + 1][j + 1] : 0;
                a[i][j] = t;
            }
        }

        return a;
    }
    
    private static void print(int[][] workArray) {
        if(workArray != null) {
            for (int y = 0; y < workArray.length; y++) {
                for (int x = 0; x < workArray.length; x++) {
                    System.out.print(workArray[y][x] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] myArray;
        int[][] myResultArray;
        // Test für centerNumber = 5
        myArray = genFilledArray(5);
        print(myArray);
        myResultArray = calcSumInArray(myArray);
        print(myResultArray);
        //Test für centerNumber = 9
        myArray = genFilledArray(9);
        print(myArray);
        myResultArray = calcSumInArray(myArray);
        print(myResultArray);
    }
    
    
}
