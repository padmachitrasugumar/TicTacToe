/**
 * Board for Tic Tac Toe
 */
public class Board {
    Character[][] board;

    // Create a Board with given Size
    Board(int size){
        if (size < 3 || size > 8){
            throw new RuntimeException("Expected size is 3 to 8");
        }
        board = new Character[size][size];
    }

    // Board with Default size
    Board(){
        board = new Character[3][3];
    }

    /*
     * Sets the given Character in board
     * Throws exception if given position is taken
     */
    public void setMove(int x, int y, Character c){
        if ( board[x][y] != null){
            throw new RuntimeException(" Position X, Y is not empty in board");
        }
        board[x][y] = c;
    }

    /*
    * Gets the board
     */
    public Character[][] getBoard(){
        return board;
    }

    /*
    * Check if  Game is over
    * Returns the Winning character if game is over, else, returns null
     */
    public Character getWinner(){
        return null;
    }

    /*
     * returns the size of the board
     */
    public int boardSize(){
        return board.length;
    }

    /*
    * Get the character at a given position
     */
    public Character getMove(int x,int y){
        return board[x][y];
    }
}
