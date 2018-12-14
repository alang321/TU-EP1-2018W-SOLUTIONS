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
        int cMax = Integer.MIN_VALUE;

        for (int j = 0; j < array.length - 2; j++)
        {
            int t = array[j] + array[j+1] + array[j+2];
            cMax = (t > cMax) ? t : cMax;
        }

        return cMax;
    }
    
    private static int calcMaxSumTriple(int[] array) {
        int cMax = Integer.MIN_VALUE;

        for (int j = 0; j < array.length - 2; j++)
        {
            int t = array[j] + array[j+1] + array[j+2];
            cMax = (t > cMax) ? t : cMax;
        }

        return cMax;
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


