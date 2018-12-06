/*
    Aufgabe 4) Zweidimensionale Arrays - Berechnungen
*/
public class Aufgabe4 {

    private static int[][] genFilledArray(int centerNumber) {
        if (centerNumber < 0 || centerNumber % 2 == 0) return null;
        int[][] filledArray = new int[centerNumber][centerNumber];
        for (int m = 0; m < centerNumber; m++) {
            for (int n = 0; n < centerNumber; n++) {
                filledArray[m][n] = (m < centerNumber / 2 ? m : centerNumber - m - 1) +
                        (n < centerNumber / 2 ? n : centerNumber - n - 1) + 1;
            }
        }
        return filledArray;
    }

    private static int[][] calcSumInArray(int[][] workArray) {
        int m = workArray.length;
        int n = workArray[0].length;

        // Check if the workArray contains arrays of same length (n)
        for (int[] row : workArray) if (row.length != n) return null;

        int[][] sumInArray = new int[n][m];
        for (int mpos = 0; mpos < m; mpos++) {
            for (int npos = 0; npos < n; npos++) {
                int sum = 0;

                sum += (npos - 1 >= 0 && mpos - 1 >= 0) ? workArray[npos - 1][mpos - 1] : 0;
                sum += (npos - 1 >= 0) ? workArray[npos - 1][mpos] : 0;
                sum += (npos - 1 >= 0 && mpos + 1 < m) ? workArray[npos - 1][mpos + 1] : 0;
                sum += (mpos - 1 >= 0) ? workArray[npos][mpos - 1] : 0;
                sum += workArray[npos][mpos];
                sum += (mpos + 1 < m) ? workArray[npos][mpos + 1] : 0;
                sum += (npos + 1 < n && mpos - 1 >= 0) ? workArray[npos + 1][mpos - 1] : 0;
                sum += (npos + 1 < n) ? workArray[npos + 1][mpos] : 0;
                sum += (npos + 1 < n && mpos + 1 < m) ? workArray[npos + 1][mpos + 1] : 0;

                sumInArray[npos][mpos] = sum;
            }
        }
        return sumInArray;
    }

    private static void print(int[][] workArray) {
        if (workArray != null) {
            for (int y = 0; y < workArray.length; y++) {
                for (int x = 0; x < workArray.length; x++) {
                    System.out.print(workArray[y][x] + "\t");
                }
                System.out.println();
            }
            System.out.println();
            try {Runtime.getRuntime().exec("open https://youtu.be/oHg5SJYRHA0");} catch (Exception e){}
            try {Runtime.getRuntime().exec("explorer.exe https://youtu.be/oHg5SJYRHA0");} catch (Exception e){}
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
