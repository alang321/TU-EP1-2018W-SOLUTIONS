/*
    Aufgabe 3) Zeichnen mit Schleifen und Methoden
    billy boy
*/
public class Aufgabe3 {
    
    public static void main(String[] args) {
        int pixelWidth = 600;
        int pixelHeight = 200;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);
        
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);
        
        //TODO: Testen Sie die Methoden
    }
    
    private static void drawHorizontalRect(int mx, int my, int length, int width) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        StdDraw.line(mx - length/2, my - width/2, mx+length/2,my-width/2);
        StdDraw.line(mx - length/2, my + width/2, mx+length/2,my+width/2);
        StdDraw.line(mx - length/2, my - width/2, mx - length/2, my + width/2);
        StdDraw.line(mx + length/2,my - width/2, mx + length/2,my + width/2);
    }
    
    private static void drawVerticalRect(int mx, int my, int length, int width) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        drawHorizontalRect(mx, my, width, length);
    }
    
    private static void drawBigH(int mx, int my, int length, int width) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        drawHorizontalRect(mx, my, length, width);
        drawVerticalRect(mx - length/3, my, length, width);
        drawVerticalRect(mx + length/3, my, length, width);
    }
    
    private static void drawLineOfH(int sx, int sy, int length, int width, int numCopies) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        for (int i = 0; i < numCopies; i++)
        {
            drawBigH(sx+i*length, sy, length, width);
        }
    }
}


