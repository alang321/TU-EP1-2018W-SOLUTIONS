/*
    Aufgabe 1) Zweidimensionale Arrays und Rekursion - Mini-Paint
*/

import java.awt.*;

public class Aufgabe1 {
    
    private static void floodFill(int[][] picArray, int sx, int sy) {
        if (sy < 0) return;
        if (sy > picArray.length - 1) return;
        if (sx < 0) return;
        if (sx + 1 > picArray.length - 1) return;

        if (picArray[picArray.length - 1 - sy][sx] == 1) return;

        StdDraw.point(sx, sy);
        picArray[picArray.length - 1 - sy][sx] = 1;

        floodFill(picArray, sx+1, sy);
        floodFill(picArray, sx-1, sy);
        floodFill(picArray, sx, sy+1);
        floodFill(picArray, sx, sy-1);
    }

    private static void paintLine(int[][] picArray, int[] xClick, int[] yClick) {
        int x0 = xClick[0];
        int x1 = xClick[1];
        int y0 = yClick[0];
        int y1 = yClick[1];
        
        int dx = Math.abs(x1 - x0);
        int dy = Math.abs(y1 - y0);
        int xd = x0 < x1 ? 1 : -1;
        int yd = y0 < y1 ? 1 : -1;
        
        int e = dx - dy;
        int et;
        
        picArray[picArray.length - 1 - y0][x0] = 1;
        StdDraw.point(x0, y0);
        System.out.println("Point: x:" + x0 + " y:" + y0);
        
        while (x0 != x1 || y0 != y1) {
            et = 2 * e;
            if (et > -dy) {
                e -= dy;
                x0 += xd;
            }
            if (et < dx) {
                e += dx;
                y0 += yd;
            }
            picArray[picArray.length - 1 - y0][x0] = 1;
            StdDraw.point(x0, y0);
            System.out.println("Point: x:" + x0 + " y:" + y0);
        }
    }
    
    public static void main(String[] args) {
        int width = 300;
        int height = 250;
        int squareSize = 50;
        StdDraw.setCanvasSize(width - 1, height - 1);
        StdDraw.setXscale(0, width - 1);
        StdDraw.setYscale(0, height - 1);
        StdDraw.setPenRadius(0.001);
        
        //draw color buttons
        Color[] colors = new Color[]{StdDraw.RED, StdDraw.GREEN, StdDraw.BLUE, StdDraw.YELLOW, StdDraw.CYAN};

        for (int i = 0; i < colors.length; i++) {
            StdDraw.setPenColor(colors[i]);
            StdDraw.filledSquare(width - squareSize / 2 - 1, squareSize / 2 + i * squareSize , squareSize / 2);
        }
        
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.0082);
        StdDraw.line(width - squareSize + 1, 0, width - squareSize + 1, height - 1);
        for (int i = 1; i < 5; i++) {
            StdDraw.line(width - squareSize + 1, i * squareSize - 1, width - 1, i * squareSize - 1);
        }
        StdDraw.setPenRadius(0.001);
        
        int[] xClick = new int[2];
        int[] yClick = new int[2];
        int[][] picArray = new int[height][width - squareSize];
        boolean isRunning = true;

        while (isRunning) {
            if (StdDraw.isMousePressed()) {
                if ((int)StdDraw.mouseX() >= 250)
                {
                    if      ((int)StdDraw.mouseY() <= 50)   StdDraw.setPenColor(colors[0]);
                    else if ((int)StdDraw.mouseY() <= 100)  StdDraw.setPenColor(colors[1]);
                    else if ((int)StdDraw.mouseY() <= 150)  StdDraw.setPenColor(colors[2]);
                    else if ((int)StdDraw.mouseY() <= 200)  StdDraw.setPenColor(colors[3]);
                    else if ((int)StdDraw.mouseY() <= 250)  StdDraw.setPenColor(colors[4]);

                    continue;
                }

                if (StdDraw.getPenColor() == StdDraw.BLACK)
                {
                    xClick[0] = xClick[1];
                    yClick[0] = yClick[1];

                    xClick[1] = (int)StdDraw.mouseX();
                    yClick[1] = (int)StdDraw.mouseY();

                    paintLine(picArray, xClick, yClick);
                }
                else
                {
                    floodFill(picArray, (int)StdDraw.mouseX(), (int)StdDraw.mouseY());
                    StdDraw.setPenColor(StdDraw.BLACK);
                }
                StdDraw.pause(100);
            }
        }
    }
    
}


