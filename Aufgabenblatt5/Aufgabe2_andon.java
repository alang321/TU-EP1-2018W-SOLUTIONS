/*
    Aufgabe 2) Rekursion mit Strings
*/
public class Aufgabe2 {
    
    private static String insertIndex(String s) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        return (s.length() <= 1) ? (s.length() == 0) ? "" : (s.length()-1) + s : insertIndex(s.substring(0, s.length()-1)) + (s.length()-1) + s.substring(s.length()-1);
    }
    
    private static String mixStrings(String s1, String s2) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methodes
        s2 += s2.charAt(0);
        return (s1.length() > 0) ? "" + s1.charAt(0) + s2.charAt(0) + mixStrings(s1.substring(1), s2.substring(1)) : "";
    }
    
    private static String shiftMinCharLeft(String s) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        if(s.length() <= 1) return s;
        String sNew = shiftMinCharLeft(s.substring(0,s.length()-1));
        //wenn rechtester ("aktueller") char kleiner als linkester (also bisher kleinster) ist dann aktuellen an anfang schreiben und sonstige alte ordung ohne "aktuellen" char behalten, wenn nicht einfach "aktuellen" char an neuen string anhängen
        return sNew.charAt(0) > s.charAt(s.length()-1) ? s.charAt(s.length()-1) + s.substring(0,s.length()-1) : sNew + s.charAt(s.length()-1);
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


