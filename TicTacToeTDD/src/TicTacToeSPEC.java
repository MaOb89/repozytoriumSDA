import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class TicTacToeSPEC {
    TicTacToe ticTacToe;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public final void before() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void whenXOutsideBoardThenRunTimeException() {
        exception.expect(RuntimeException.class); //konkretna tresc klasy - o jaka klase chodzi, tzw refleksja
        ticTacToe.play(5, 2);
    }

    @Test
    public void whenYOutsideBoardThenRunTimeException() {
        exception.expect(RuntimeException.class); //konkretna tresc klasy - o jaka klase chodzi, tzw refleksja
        ticTacToe.play(2, 5);
    }

    @Test
    public void whenOccupiedThenRunTimeException() {
        ticTacToe.play(2, 1);
        exception.expect(RuntimeException.class);
        ticTacToe.play(2, 1);
    }

    @Test
    public void givenFirstTurnWhenNextPlayerThenX() {
        assertEquals('X', ticTacToe.nextPlayer());
    }

    @Test
    public void givenLastTurnWasXWhenNextPlayerThenO() {
        ticTacToe.play(1, 1);
        assertEquals('0', ticTacToe.nextPlayer());
    }

    @Test
    public void givenLastTurnWasOWhenNextPlayerThenX() {
        ticTacToe.play(1, 1);
        ticTacToe.play(2, 1);
        assertEquals('X', ticTacToe.nextPlayer());
    }

    @Test
    public void whenPlayThenNoWinner() {
        String actual = ticTacToe.play(1, 1);
        assertEquals("No winner", actual);
    }

    @Test
    public void whenPlayAndWholeHorizontalLineThenWinner() {
        ticTacToe.play(1, 1);//X
        ticTacToe.play(1, 2);//0
        ticTacToe.play(2, 1);//X
        ticTacToe.play(2, 2);//0
        String actual = ticTacToe.play(3, 1);
        assertEquals("X is the winner", actual);
    }
    @Test

    public void whenPlayAndWholeVerticalLineThenWinner() {
        ticTacToe.play(2, 1); // X
        ticTacToe.play(1, 1); // O
        ticTacToe.play(3, 1); // X
        ticTacToe.play(1, 2); // O
        ticTacToe.play(2, 2); // X
        String actual = ticTacToe.play(1, 3); // O
        assertEquals("0 is the winner", actual);
    }
    @Test

    public void whenPlayAndTopBottomDiagonalLineThenWinner() {

        ticTacToe.play(1, 1); // X
        ticTacToe.play(1, 2); // O
        ticTacToe.play(2, 2); // X
        ticTacToe.play(1, 3); // O
        String actual = ticTacToe.play(3, 3); // X
        assertEquals("X is the winner", actual);
    }

    @Test

    public void whenPlayAndBottomTopDiagonalLineThenWinner() {

        ticTacToe.play(1, 3); // X
        ticTacToe.play(1, 1); // O
        ticTacToe.play(2, 2); // X
        ticTacToe.play(1, 2); // O
        String actual = ticTacToe.play(3, 1); // X
        assertEquals("X is the winner", actual);
    }

    @Test
    public void whenAllBoxesAreFilledThenDraw() {
        ticTacToe.play(1, 1);
        ticTacToe.play(1, 2);
        ticTacToe.play(1, 3);
        ticTacToe.play(2, 1);
        ticTacToe.play(2, 3);
        ticTacToe.play(2, 2);
        ticTacToe.play(3, 1);
        ticTacToe.play(3, 3);
        String actual = ticTacToe.play(3, 2);
        assertEquals("The result is draw", actual);
    }
}