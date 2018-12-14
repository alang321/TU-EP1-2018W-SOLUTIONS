/*
    Aufgabe 3) Rekursion - Kreuzmuster
*/
public class Aufgabe3 {
    
    private static void drawCrossPattern(int x, int y, int l, boolean c) {
        if (l < 16) return;
        StdDraw.setPenColor(c ? StdDraw.RED : StdDraw.BLUE);
        StdDraw.filledRectangle((x + l) / 2, (y + l) / 2, 0.5 * l, 0.5 * 0.05 * l);
        StdDraw.filledRectangle((x + l) / 2, (y + l) / 2, 0.5 * 0.05 * l, 0.5 * l);
        drawCrossPattern(x, y, l / 2, !c); // comment this line for version B
        drawCrossPattern(x+l, y, l / 2, !c);
        drawCrossPattern(x, y+l, l / 2, !c);
        drawCrossPattern(x+l, y+l, l / 2, !c);
    }
    
    public static void main(String[] args) {
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setXscale(0, 512);
        StdDraw.setYscale(0, 512);
        StdDraw.enableDoubleBuffering();

        drawCrossPattern(0, 0, 512, true);

        StdDraw.show();
    }
}

// ZUSATZ FRAGEN
// 1. So it doesnt go on forever
// 2. No. (Here it is until l < 16
// 3. 6
// 4. 4 ^ 5 = 1024
// 5. comment line 11
