/*
    Aufgabe 3) Verschachtelte Schleifen und Verzweigungen - Optische Täuschung
*/
public class Aufgabe3 {

    public static void main(String[] args) {

        int hCount = 10;
        int vCount = 11;
        int squareSize = 40;

        int crossH = 4;
        int crossW = 20;

        StdDraw.setCanvasSize(hCount * squareSize, vCount * squareSize);
        StdDraw.setXscale(0, hCount * squareSize);
        StdDraw.setYscale(0, vCount * squareSize);


        for (int h = 0; h < hCount; h++) {
            for (int v = 0; v < vCount; v++) {
                if ((h + v) % 2 == 1) StdDraw.setPenColor(90, 90, 0);
                else StdDraw.setPenColor(166, 166, 76);

                StdDraw.filledRectangle(h * squareSize + squareSize / 2, v * squareSize + squareSize / 2,
                        squareSize / 2, squareSize / 2);

                if (h >= 1 && v >= 1) {
                    int rowCountFromMiddle = (int) Math.floor(Math.abs(v - vCount/2f));
                    boolean crossRotated = ((h + rowCountFromMiddle) % 2 == 1);

                    StdDraw.setPenColor(255, 255, 255);
                    StdDraw.filledRectangle(h * squareSize, v * squareSize,
                            crossRotated ? crossW / 2 : crossH / 2,
                            crossRotated ? crossH / 2 : crossW / 2);
                    StdDraw.setPenColor(0, 0, 0);
                    StdDraw.filledRectangle(h * squareSize, v * squareSize,
                            crossRotated ? crossH / 2 : crossW / 2,
                            crossRotated ? crossW / 2 : crossH / 2);
                }

            }

        }
    }
}
