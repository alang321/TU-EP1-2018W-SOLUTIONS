/*
    Aufgabe 2) Rekursion mit Strings
*/
public class Aufgabe2 {
    
    private static String insertIndex(String s) {
        if (s.length() == 0) return s;
        if (s.length() == 1) return s.length() - 1 + s;
        return insertIndex(s.substring(0, s.length() - 1)) + (s.length() - 1) + s.charAt(s.length() - 1);
    }
    
    private static String mixStrings(String s1, String s2) {
        if (s1.length() == 0) return s1;
        int t = s1.length();
        while (t > s2.length()) t -= s2.length();
        return mixStrings(s1.substring(0, s1.length()-1), s2) + s1.substring(s1.length()-1) + s2.charAt(t - 1);
    }
    
    private static String shiftMinCharLeft(String s) {
        if (s.length() == 0) return s;
        char cLow = Character.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) cLow = (s.charAt(i) < cLow) ? s.charAt(i) : cLow;
        int j = s.indexOf(cLow);
        if (j == 1) return s.substring(0, j - 1) + cLow + s.charAt(j - 1) + s.substring(j + 1);
        else return shiftMinCharLeft(s.substring(0, j - 1) + cLow + s.charAt(j - 1) + s.substring(j + 1));
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


