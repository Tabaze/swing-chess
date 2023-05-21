package Game;

import java.util.ArrayList;

/* @author nrileyfletcher
 * @brief King piece implementation
 */
public class King implements Piece {

    private final String color;

    public King(String color) {
        this.color = color;
    }

    @Override
    public ArrayList<Move> getLegalMoves(Piece[][] currentBoard, int row, int col) {
        ArrayList<Move> legalMoves = new ArrayList<>();
        return legalMoves;
    }

    @Override
    public int getPieceValue() {
        return 0;
    }

    @Override
    public String getPieceType() {
        return "KING";
    }

    @Override
    public String getPieceColor() {
        return this.color;
    }
}