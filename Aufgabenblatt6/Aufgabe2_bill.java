/*
    Aufgabe 2) Zweidimensionale Arrays und Methoden - Vier Gewinnt
*/

import java.awt.*;

public class Aufgabe2 {
    
    private static int[][] genGameBoard(int x, int y) {
        return new int[y][x];
    }
    
    private static void drawGameBoard(int[][] currentGameBoard, int oneSquareSize) {
        StdDraw.clear(StdDraw.BLUE);
        int y = oneSquareSize/2;
        for (int row[] : currentGameBoard)
        {
            int x = oneSquareSize/2;
            for (int i : row)
            {
                switch(i)
                {
                    case 0:
                        StdDraw.setPenColor(StdDraw.GRAY);
                        break;
                    case 1:
                        StdDraw.setPenColor(StdDraw.RED);
                        break;
                    case 2:
                        StdDraw.setPenColor(StdDraw.YELLOW);
                        break;
                    default:
                        StdDraw.setPenColor(StdDraw.MAGENTA);
                }

                StdDraw.filledCircle(x, y, oneSquareSize/3);

                x += oneSquareSize;
            }

            y += oneSquareSize;
        }
    }
    
    private static boolean move(int[][] currentGameBoard, int player, int col) {
        int t;
        for (t = currentGameBoard.length - 1; t >= 0; t--)
        {
            if (currentGameBoard[t][col] > 0) break;
        }

        if (t == currentGameBoard.length - 1) return false;

        currentGameBoard[t + 1][col] = player;

        return true;
    }
    
    private static boolean checkGameStatus(int[][] currentGameBoard, int player) {
        for (int i = 0; i < currentGameBoard.length; i++) //height
        {
            for (int j = 0; j < currentGameBoard[0].length; j++) //width
            {
                if (j < currentGameBoard[0].length - 3)
                {
                    // vert check
                    if (player == currentGameBoard[i][j] &&
                            player == currentGameBoard[i][j + 1] &&
                            player == currentGameBoard[i][j + 2] &&
                            player == currentGameBoard[i][j + 3])
                        return true;
                }

                if (i < currentGameBoard.length - 3) {
                    // hor check
                    if (player == currentGameBoard[i][j] &&
                            player == currentGameBoard[i + 1][j] &&
                            player == currentGameBoard[i + 2][j] &&
                            player == currentGameBoard[i + 3][j])
                        return true;
                }

                if (j >= 3 && i >= 3)
                {
                    // desc diag check
                    if (player == currentGameBoard[i][j] &&
                    player == currentGameBoard[i-1][j-1] &&
                    player == currentGameBoard[i-2][j-2] &&
                    player == currentGameBoard[i-3][j-3])
                        return true;
                }

                if (i >= 3 && j < currentGameBoard[0].length - 3)
                {
                    // asc diag check
                    if (player == currentGameBoard[i][j] &&
                            player == currentGameBoard[i-1][j+1] &&
                            player == currentGameBoard[i-2][j+2] &&
                            player == currentGameBoard[i-3][j+3])
                        return true;
                }
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        
        // canvas settings
        int rowsGameBoard = 6;
        int colsGameBoard = 7;
        int oneSquareSize = 50;
        int width = oneSquareSize * colsGameBoard;
        int height = oneSquareSize * rowsGameBoard;
        
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        StdDraw.setFont(new Font("Arial", Font.BOLD, 30));
        
        // game variables
        int[][] myGameBoard = genGameBoard(colsGameBoard, rowsGameBoard);
        boolean fullBoard = false;
        boolean isWon = false;
        int player = 1;
        int fieldsUsed = 0;
        
        // initial draw of the game board
        drawGameBoard(myGameBoard, oneSquareSize);
        
        // game play starts
        System.out.println("Player " + player + (player == 1 ? " (RED)" : " (YELLOW)") + " has to make a move!");
        while (!fullBoard && !isWon) {
            if (StdDraw.isMousePressed()) {
                if (move(myGameBoard, player, (int)(StdDraw.mouseX() / oneSquareSize))) {
                    drawGameBoard(myGameBoard, oneSquareSize);
                    fieldsUsed++;

                    isWon = checkGameStatus(myGameBoard, player);
                    fullBoard = fieldsUsed == rowsGameBoard * colsGameBoard;

                    if (!isWon && !fullBoard) {
                        player = (player == 1) ? 2 : 1;
                        System.out.println("Player " + player + (player == 1 ? " (RED)" : " (YELLOW)") + " has to make a move!");
                    }
                }
                else
                {
                    StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
                    StdDraw.text(width / 2, height / 2, "Column already full!");
                }

                StdDraw.pause(750);
            }
        }

        if (isWon) {
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.text(width / 2, height / 2, ((player == 1) ? "Player 1 (RED)" : "Player 2 (YELLOW)") + " won!");
        }
        else if (fullBoard)
        {
            StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
            StdDraw.text(width / 2, height / 2, "Board full!");
        }
    }
}



