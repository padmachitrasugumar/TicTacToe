import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * TestClass for Board
 */
public class BoardTest {

    @Test
    public void shouldTestBoardSize(){

        // Size - 3. Expected size - 3
        Board b=new Board(7);
        assertTrue(b.boardSize() == 7);

        // Check if default board size is 3
        Board defaultBoard = new Board();
        assertTrue(defaultBoard.boardSize() == 3);
    }

    @Test(expected = java.lang.RuntimeException.class)
    public void shouldCheckBoardSizeLimits(){
        
    }

    @Test
    public void shouldTestBoardSetMove(){
        //  Set within limits
        // 3, 3 -> 3, 4
        // Row and Column should be within limit

        // Free?
        // 2,3 -> Set. Again, 2,3 -> Set -> Expected Exceptions

        // Make someone winner..
        // Set a move. --> Expected Exception --> Game over
    }

    @Test
    public void shouldTestBoardStatus(){

        // 2,3 -> X ;
        // getMove(2,3) ->X

        // Set some positions
        //getBoard; -> [][]

    }

    @Test
    public void shouldTestWinner(){
        // Make entire column X.
        // Check for winner -> X

        //  New Board
        // don't make anyone win
        //Check for Winner -> Null.
    }

}