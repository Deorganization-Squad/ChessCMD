
        import java.util.HashMap;
        import java.util.Scanner;
public class Board {
    public static int[][] gameBoard;
    public static Scanner in;
    public static HashMap<Integer,Integer> row;
    public static HashMap<Integer, String> piece;
    public static HashMap<Integer,Integer> column;
    public static void startGame(){
        in = new Scanner(System.in);
        row = new HashMap<Integer, Integer>();
        piece = new HashMap<Integer, String>();
        column = new HashMap<Integer, Integer>();
        column.put(1,2);
        column.put(2,3);
        column.put(3,4);
        column.put(4,5);
        column.put(5,6);
        column.put(6,7);
        column.put(7,8);
        column.put(8,9);
        row.put(1,7);
        row.put(2,6);
        row.put(3,5);
        row.put(4,4);
        row.put(5,3);
        row.put(6,2);
        row.put(7,1);
        row.put(8,0);
        piece.put(0,"empty");
        piece.put(21,"pn");
        piece.put(10,"pn");
        piece.put(11,"kt");
        piece.put(12,"kt");
        piece.put(13,"kg");
        piece.put(14,"kg");
        piece.put(15,"qn");
        piece.put(16,"qn");
        piece.put(17,"qn");
        piece.put(18,"bp");
        piece.put(19,"rk");
        piece.put(20,"rk");
        gameBoard = new int[][]{{8,-1,20,12,18,16,14,18,12,20},{7,-1,10,10,10,10,10,10,10,10},{6,-1,0,0,0,0,0,0,0,0,},{5,-1,0,0,0,0,0,0,0,0,},{4,-1,0,0,0,0,0,0,0,0,},{3,-1,0,0,0,0,0,0,0,0,},{2,-1,21,21,21,21,21,21,21,2117},{1,-1,19,11,17,15,13,17,11,19},{-2,-2,1,2,3,4,5,6,7,8}};
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
        gameBoard[row.get(x2)][column.get(y2)] = gameBoard[row.get(x1)][column.get(y1)];
        gameBoard[row.get(x1)][column.get(y1)] = 0;
    }
    public static void printBoard(){
        System.out.println(" ");
        for (int i = 0; i < gameBoard.length; ++i) {
            for(int j = 0; j < gameBoard[i].length; ++j) {

                if (gameBoard[i][j] == 0){
                    System.out.print("__");
                } else if(gameBoard[i][j] == -1){
                    System.out.print("|");
                } else if(gameBoard[i][j] == -2){
                    System.out.print("  ");
                }
                 else if (gameBoard[i][j]/10 == 0){
                    System.out.print(gameBoard[i][j] + " ");
                }  else {
                    System.out.print(piece.get(gameBoard[i][j]));
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