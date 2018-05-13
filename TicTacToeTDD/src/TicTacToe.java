public class TicTacToe {

    private Character[][] board = new Character[][]{
            {'\0', '\0', '\0'},
            {'\0', '\0', '\0'},
            {'\0', '\0', '\0'}
    };
    private static final int SIZE = 3;

    private char lastPlayer = '\0';


    public String play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        lastPlayer = nextPlayer();
        setBox(x, y);

        if (isWin())
            return lastPlayer + " is the winner";
        else if (isDraw())
            return "The result is draw";
        else
            return "No winner";
    }

    private boolean isWin() {
        int playerTotal = lastPlayer * 3;
        char diagonal1 = '\0';
        char diagonal2 = '\0';

        for (int i = 0; i < SIZE; i++) {
            diagonal1 += board[i][i];
            diagonal2 += board[i][SIZE - i - 1];
            if (board[0][i] + board[1][i] + board[2][i] == playerTotal)
                return true;

            if (board[i][0] + board[i][1] + board[i][2] == playerTotal)
                return true;
        }
        if (diagonal1 == playerTotal || diagonal2 == playerTotal)
            return true;
        return false;
    }

    private boolean isDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '\0')
                    return false;
            }
        }
        return true;
    }

    private void checkAxis(int axis) {
        if (axis < 1 || axis > 3) throw new RuntimeException("Is outside board");
    }

    private void setBox(int x, int y) {
        if (board[x - 1][y - 1] != '\0')
            throw new RuntimeException("Box is occupied");
        else
            board[x - 1][y - 1] = lastPlayer;
    }

    public char nextPlayer() {
        return lastPlayer == 'X' ? '0' : 'X';
    }
}
