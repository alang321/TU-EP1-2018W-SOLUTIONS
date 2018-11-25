/*
    Aufgabe 2) Verzweigungen
*/
public class Aufgabe2 {

    public static void main(String[] args) {

        //A) Gewichtskategorisierung

        int weight = (int) (Math.random() * 60);

        //  1)
        if (weight < 50) {
            if (weight <= 24) {
                if (weight <= 9) {
                    if (weight < 5) System.out.println("Gewicht --> Extra Leicht");
                    else System.out.println("Gewicht --> Leicht");
                } else System.out.println("Gewicht --> Mittelschwer");

            } else System.out.println("Gewicht --> Schwer");


        } else System.out.println("Gewicht --> Extra Schwer");

        //  2)
        if (weight < 5) System.out.println("Gewicht --> Extra Leicht");
        else if (weight <= 9) System.out.println("Gewicht --> Leicht");
        else if (weight <= 24) System.out.println("Gewicht --> Mittelschwer");
        else if (weight <= 49) System.out.println("Gewicht --> Schwer");
        else System.out.println("Gewicht --> Extra Schwer");

        //B) Zahlenumrechner: Hexadezimalzahlen zwischen 0x0 und 0xF werden auf 4 Bits abgebildet.

        System.out.println();

        int hexNumber = 0x0;
        String binaryStr;

        switch (hexNumber) {
            case 0x0:
                binaryStr = "0000";
                break;
            case 0x1:
                binaryStr = "0001";
                break;
            case 0x2:
                binaryStr = "0010";
                break;
            case 0x3:
                binaryStr = "0011";
                break;
            case 0x4:
                binaryStr = "0100";
                break;
            case 0x5:
                binaryStr = "0101";
                break;
            case 0x6:
                binaryStr = "0110";
                break;
            case 0x7:
                binaryStr = "0111";
                break;
            case 0x8:
                binaryStr = "1000";
                break;
            case 0x9:
                binaryStr = "1001";
                break;
            case 0xa:
                binaryStr = "1010";
                break;
            case 0xb:
                binaryStr = "1011";
                break;
            case 0xc:
                binaryStr = "1100";
                break;
            case 0xd:
                binaryStr = "1101";
                break;
            case 0xe:
                binaryStr = "1110";
                break;
            case 0xf:
                binaryStr = "1111";
                break;
            default:
                System.err.println("Ungültige hexadezimale Zahl!");
                return;
        }
        String hexStr = String.format("0x%X", hexNumber);
        System.out.println(hexStr + " entspricht " + binaryStr);

    }
}

