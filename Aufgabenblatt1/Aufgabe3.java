/*
    Aufgabe 3) StdDraw Bibliothek anwenden und erste Schleifen
*/
public class Aufgabe3 {

    public static void main(String[] args) {
        StdDraw.setCanvasSize(400, 400);
        StdDraw.setScale(0, 400);

        //Red Diamond
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.line(200, 0, 0, 200);
        StdDraw.line(0, 200, 200, 400);
        StdDraw.line(200, 400, 400, 200);
        StdDraw.line(400, 200, 200, 0);

        //Filled Shapes
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.filledEllipse(100, 300, 40, 20);
        StdDraw.filledEllipse(300, 100, 20, 40);
        StdDraw.setPenColor(StdDraw.CYAN);
        StdDraw.filledRectangle(100, 100, 40, 20);
        StdDraw.filledRectangle(300, 300, 20, 40);

        //Orange Circle
        StdDraw.setPenColor(StdDraw.ORANGE);
        for (int i = 1; i <= 7; i++) {
            if (i != 4) {
                StdDraw.filledCircle(50 * i, 200, 15);
            }
        }

        //Double Arcs
        for (int i = 1; i <= 7; i++) {
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.arc(200, 50 * i, 15, 45 * i % 360, (180 + 45 * i) % 360);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.arc(200, 50 * i, 15, (180 + 45 * i) % 360, 45 * i % 360);
        }

    }
}

