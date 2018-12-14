import java.util.Arrays;

/*
    Aufgabe 1) Rekursion - Diverse Methoden
*/
public class Aufgabe1 {
    
    private static int printAndCountNumbers(int x, int y) {
        System.out.println(x);
        return (x < y) ? x + printAndCountNumbers(x + 1, y) : x;
    }
    
    private static int printAndCountNumbersDes(int x, int y) {
        System.out.println(y);
        return (y > x) ? y + printAndCountNumbersDes(x, y - 1) : y;
    }
    
    private static int calcMaxSumTriple(int[] array, int i) {
        if (i == array.length - 3) return array[i] + array[i+1] + array[i+2];
        int t = array[i] + array[i+1] + array[i+2];
        int u = calcMaxSumTriple(array, i + 1);
        return t > u ? t : u;
    }
    
    private static int calcMaxSumTriple(int[] array) {
        if (array.length == 3) return array[0] + array[1] + array[2];
        int t = array[0] + array[1] + array[2];
        int u = calcMaxSumTriple(Arrays.copyOfRange(array, 1, array.length));
        return t > u ? t : u;
    }
    
    private static int findMaxDiff(int[] array, int i) {
        int cMax = Integer.MIN_VALUE;

        for (int j = 0; j < i; j++)
        {
            int t = Math.abs(array[j] - array[j+1]);
            cMax = (t > cMax) ? t : cMax;
        }

        return cMax;
    }
    
    public static void main(String[] args) {
        System.out.println(printAndCountNumbers(10, 20));
        System.out.println();
        System.out.println(printAndCountNumbersDes(5, 15));
        System.out.println();
        
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 3, 8, 2, 7, 4, 3}, 0));
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 1, 8, 7, 3, 4, 3}, 0));
        System.out.println(calcMaxSumTriple(new int[]{7, 5, 3}, 0));
        
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 3, 8, 2, 7, 4, 3}));
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 1, 8, 7, 3, 4, 3}));
        System.out.println(calcMaxSumTriple(new int[]{7, 5, 3}));
        System.out.println();
        
        System.out.println(findMaxDiff(new int[]{5, 50, 7, 1, 20}, 4));
        System.out.println(findMaxDiff(new int[]{5, 8, 7, 1, 20}, 2));
        System.out.println(findMaxDiff(new int[]{5, 14, 5, 1, 2, 1, 20}, 6));
        System.out.println(findMaxDiff(new int[]{1, 1, 1, 1, 1, 1, 1}, 6));
        System.out.println(findMaxDiff(new int[]{2, 4}, 1));
    }
}
