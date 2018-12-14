/*
    Aufgabe 2) Rekursion mit Strings
*/
public class Aufgabe2 {
    
    private static String insertIndex(String s) {
        String ret = "";
        for (int i = 0; i < s.length(); i++)
        {
            ret += Integer.toString(i) + s.charAt(i);
        }
        return ret;
    }
    
    private static String mixStrings(String s1, String s2) {
        String ret = "";
        for (int i = 0, j = 0; i < s1.length(); i++, j++)
        {
            if (j == s2.length()) j = 0;
            ret += "" + s1.charAt(i) + s2.charAt(j);
        }
        return ret;
    }
    
    private static String shiftMinCharLeft(String s) {
        char cLow = Character.MAX_VALUE;
        int iCLow = -1;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) < cLow) {
                cLow =  s.charAt(i);
                iCLow = i;
            }
        }
        return (iCLow > -1) ? cLow + s.substring(0, iCLow) + s.substring(iCLow + 1) : s;
    }

    public static void main(String[] args) {
        System.out.println(insertIndex("Hallo"));
        System.out.println(insertIndex("Fahrkarten!"));
        System.out.println(insertIndex(""));
        
        System.out.println(mixStrings("GROSS", "klein"));
        System.out.println(mixStrings("ABC", "klein"));
        System.out.println(mixStrings("GROESSER", "klein"));
        
        System.out.println(shiftMinCharLeft("xdbycfjadfmk"));
        System.out.println(shiftMinCharLeft("bcdefghijklmnoa"));
        System.out.println(shiftMinCharLeft(""));
    }
}


