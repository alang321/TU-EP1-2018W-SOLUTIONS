import com.sun.deploy.util.StringUtils;

import java.util.Collection;

/*
    Aufgabe 2) Neugestaltung von Spaghetti-Code durch Methoden
*/
public class Aufgabe2 {
    
    public static void main(String[] args) {
        test();

        String text1 = "Have a great day!";
        String text2 = "This is a Teststring";
        int num1 = 35061;
        int num2 = 1010;
        
        for (int i = 0; i < text1.length()-1; i++) {
            System.out.print(text1.charAt(i));
            System.out.print('-');
        }
        System.out.println(text1.charAt(text1.length()-1));
        int decades = 1;
        int digitCount = 0;
        while(num1 > decades) {
            decades = decades * 10;
            digitCount++;
        }
        decades /= 10;
        while(num1 > 0) {
            System.out.print(num1 / decades);
            num1 %= decades;
            digitCount--;
            if (num1 > 0) {
                System.out.print('*');
            }
            else if(digitCount > 0){
              System.out.println("*0");
            }
            decades/=10;
        }
        System.out.println();
        int len = text2.length()-1;
        while (len > -1) {
            System.out.print(text2.charAt(text2.length()-1-len));
            if(len > 0) {
                System.out.print('.');
            }
            len--;
        }
        System.out.println();
        String separators = "#.+";
        for (int i = 0; i < separators.length(); i++) {
            for (int j = 0; j < text1.length()-1; j++) {
                System.out.print(text1.charAt(j));
                System.out.print(separators.charAt(i));
            }
            System.out.println(text1.charAt(text1.length()-1));
        }
        int dec = 1;
        int numDigits = 0;
        while(num2 > dec) {
            dec *= 10;
            numDigits += 1;
        }
        dec = dec / 10;
        while(num2 > 0) {
            numDigits--;
            System.out.print(num2 / dec);
            num2 = num2 % dec;
            if (num2 > 0) {
                System.out.print('#');
            }
            else if(numDigits > 0){
              System.out.print('#');
              System.out.println('0');
            }
            dec /= 10;
        }
        System.out.println();
    }

    private static void test() {
        String text1 = "Have a great day!";
        String text2 = "This is a Teststring";
        int num1 = 35061;
        int num2 = 1010;

        writeSeparated(text1, "-");
        writeSeparated(num1 + "", "*");
        writeSeparated(text2, ".");
        writeSeparated(text1, "#");
        writeSeparated(text1, ".");
        writeSeparated(text1, "+");
        writeSeparated(num2 + "", "#");
        System.out.println();
    }

    private static void writeSeparated(String text1, String s) {
        String output = "";
        for (char c : text1.toCharArray()) {
            output += c;
            output += s;
        }
        output = output.substring(0, output.length() - 1);
        System.out.println(output);
    }

    /*
     *  Zusatzfragen:
     *  1)  Spagetticode macht Programme unübersichtlich und macht es
     *      sehr schwer, die Ursache eines Fehlers zu finden.
     *
     *  2)  Wenn man eine Änderung in einem duplizierten Code durchführen will,
     *      muss man jedes Vorkommen einzeln bearbeiten.
     *
     *  3)  Die Namen von Methoden sollen ihre Funktionsweise erklären. Der Syntax ist camelCase.
     */
}
