/*
    Aufgabe 1) Verschachtelung von Schleifen - Harshad-Zahlen - String Manipulation
*/
public class Aufgabe1 {

    public static void main(String[] args) {

        //Teilaufgabe 1
        int maxNumber = 1000;
        for (int i = 1; i <= maxNumber; i++) {
            int sumOfDigits = 0;
            int r = i;
            do {
                sumOfDigits += (r % 10);
                r /= 10;
            } while (r != 0);
            if (i % sumOfDigits == 0) System.out.println(i);

        }

        //Teilaufgabe B
        String divisableBy15 = "#";
        for (int i=1; i<=500; i++){
            if (i%15==0) {
                divisableBy15 += (i+"#");
            }
        }
        System.out.println(divisableBy15);

        String replaced1 = "";
        for (int pos=0; pos<divisableBy15.length(); pos++) {
            if (divisableBy15.charAt(pos)=='1') replaced1+='!';
            else replaced1+=divisableBy15.charAt(pos);
        }
        System.out.println(replaced1);
        //Z2
        /*
        String replaced2 = "";
        for (int pos=0; pos<divisableBy15.length()-1; pos++) {
            if (divisableBy15.charAt(pos)=='1'&&divisableBy15.charAt(pos+1)=='0') {
                replaced2+='+';
                pos++;
            }
            else replaced2+=divisableBy15.charAt(pos);
        }
        System.out.println(replaced2);
        */

    }
}

