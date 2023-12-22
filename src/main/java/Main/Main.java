package Main;

import Controller.ChessController;
import Game.Board;
import Graphics.BoardView;
import Graphics.ChessBoard;

public class Main {

    public static void main(String[] args) {

        Board boardStatus = new Board();
        BoardView boardView = new BoardView(new ChessBoard(boardStatus.getCurrentBoardStatus(), boardStatus.getValidMoves()));
        ChessController chessController = new ChessController(boardStatus, boardView);

    }
}
