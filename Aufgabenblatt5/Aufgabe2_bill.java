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
        if (s.length() <= 1) return s;
        boolean t = s.charAt(s.length() - 1) > s.charAt(s.length() - 2);
        char sChar = s.charAt(s.length() - ((t) ? 2 : 1));
        char bChar = s.charAt(s.length() - ((t) ? 1 : 2));
        return shiftMinCharLeft(s.substring(0, s.length() - 2) + sChar) + bChar;
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


