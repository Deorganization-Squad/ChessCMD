
        import java.util.HashMap;
        import java.util.Scanner;
public class Board {
    public static int[][] gameBoard;
    public static Scanner in;
    public static HashMap<Integer,Integer> row;
    public static HashMap<Integer, String> piece;

    public static void startGame(){
        in = new Scanner(System.in);
        row = new HashMap<Integer, Integer>();
        piece = new HashMap<Integer, String>();
        row.put(1,7);
        row.put(2,6);
        row.put(3,5);
        row.put(4,4);
        row.put(5,3);
        row.put(6,2);
        row.put(7,1);
        row.put(8,0);
        piece.put(0,"empty");
        piece.put(1,"pn");
        piece.put(2,"pn");
        piece.put(3,"kt");
        piece.put(4,"kt");
        piece.put(5,"kt");
        piece.put(6,"kg");
        piece.put(7,"qn");
        piece.put(8,"qn");
        piece.put(9,"qn");
        piece.put(10,"bp");
        piece.put(11,"rk");
        piece.put(12,"rk");
        gameBoard = new int[][]{{8,-1,12,4,10,8,6,10,4,12},{7,-1,2,2,2,2,2,2,2,2},{6,-1,0,0,0,0,0,0,0,0,},{5,-1,0,0,0,0,0,0,0,0,},{4,-1,0,0,0,0,0,0,0,0,},{3,-1,0,0,0,0,0,0,0,0,},{2,-1,1,1,1,1,1,1,1,1},{1,-1,11,3,9,7,5,9,3,11},{-2,0,0,0,0,0,0,0,0,},{-2,-2,1,2,3,4,5,6,7,8}};
        System.out.println("make your move");
        System.out.println("White's move");
        printBoard();
        for (int i = 0; i < 1000; i++) {
            makeMove(in.nextInt(), in.nextInt());
            if (i % 2 == 0){
                System.out.println("Black's move");
            } else {
                System.out.println("White's move");
            }
            printBoard();
        }
    }

    public static void makeMove(int start, int end){
        int x1 = start%10;
        int y1 = start/10;
        int x2 = end%10;
        int y2 = end/10;
        gameBoard[row.get(x2)][y2] = gameBoard[row.get(x1)][y1];
        gameBoard[row.get(x1)][y1] = 0;
    }
    public static void printBoard(){
        System.out.println(" ");
        for (int i = 0; i<gameBoard.length; ++i) {
            for(int j = 0; j < gameBoard[i].length; ++j) {

                if (gameBoard[i][j] == 0){
                    System.out.print("__");
                } else if(gameBoard[i][j] == -1){
                    System.out.print("|");
                } else if(gameBoard[i][j] == -2){
                    System.out.print("  ");
                } else if (gameBoard[i][j]/10 == 0){
                    System.out.print(gameBoard[i][j] + " ");
                } else {
                    System.out.print(gameBoard[i][j]);
                }
                System.out.print(" ");
                if (j == 9){
                    System.out.println(" ");
                }
            }
        }
    }
/*    public static boolean moveCheck(int x1,int y1,int x2,int y2, int cPiece){
        switch (cPiece){
            case 0:
                return false;
            case 1:

        }
        return true;
    }*/
}