/*
    Aufgabe 2) Neugestaltung von Spaghetti-Code durch Methoden
    billy boy
*/
public class Aufgabe2 {
    public static void main(String[] args) {
        
        String text1 = "Have a great day!"; // Creates and initializes a String variable (text1)
        String text2 = "This is a Teststring"; // Creates and initializes a String variable (text2)
        int num1 = 35061; // Creates and initializes an int variable (num1)
        int num2 = 1010; // Creates and initializes an int variable (num2)

        // same as foreach [char in str(text1)]
        // prints each char followed by an '-'
        for (int i = 0; i < text1.length()-1; i++) {
            System.out.print(text1.charAt(i));
            System.out.print('-');
        }
        System.out.println(text1.charAt(text1.length()-1)); // println's the last character of text1
        int decades = 1; // Creates and initializes an int variable (decades)
        int digitCount = 0; // Creates and initializes an int variable (digitCount)
        // loop assigns the number of digit places in num1 to digitCount
        while(num1 > decades) {
            decades = decades * 10;
            digitCount++;
        }
        decades /= 10; // divides decades by 10
        // this loop prints each digit of num 1 seperated by a *
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
        System.out.println(); // \n
        int len = text2.length()-1; // assigns the len-1 of text2 to a variable [len]
        // this loop prints text2 char by char with a . between each one
        while (len > -1) {
            System.out.print(text2.charAt(text2.length()-1-len));
            if(len > 0) {
                System.out.print('.');
            }
            len--;
        }
        System.out.println(); // \n
        String separators = "#.+"; // assigns separators to that value
        // this loop prints text1 char by char with a char from the string separators in between
        // i=0 -> #
        // i=1 -> .
        // i=2 -> +
        for (int i = 0; i < separators.length(); i++) {
            for (int j = 0; j < text1.length()-1; j++) {
                System.out.print(text1.charAt(j));
                System.out.print(separators.charAt(i));
            }
            System.out.println(text1.charAt(text1.length()-1));
        }
        int dec = 1; // self explanatory
        int numDigits = 0; // again
        // this loop finds the number of digits in num2
        while(num2 > dec) {
            dec *= 10;
            numDigits += 1;
        }
        dec = dec / 10; // divides dec by 10
        // this loop prints num2 digit by digit with a # in between each one
        // and then hits a println after the last one
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

        // ----------------- //
        // Spaghetti Code v2 //
        // ----------------- //

        String[][] asdfArray = new String[][] {
                {"Have a great day!", "-"},
                {"35061", "*"},
                {"This is a Teststring", "."},
                {"Have a great day!", "#.+"},
                {"1010", "#"}
        };
        for (String[] c : asdfArray)
            pSWS(c[0], c[1]);
    }
    
    //TODO: Implementieren Sie hier Ihre Methoden

    private static void pSWS(String a, String s)
    {
        for (char s_c : s.toCharArray())
            for (int i = 0; i < a.length(); i++)
                System.out.print(((i < a.length() - 1) ? "" + a.charAt(i) + s_c : a.charAt(i) + "\n"));
    }

    // ZUSATZFRAGEN
    // 1. It's easier to read / work on a team on readable code
    // 2. It wastes space
    // 3. Namen should have meaning, but not be too long (preferably) and should (preferably) follow common naming procedures
}
