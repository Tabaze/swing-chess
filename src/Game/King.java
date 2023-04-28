package Game;

public class King implements Piece {

    private final String color;

    public King(String color) {
        this.color = color;
    }

    @Override
    public int[][] getLegalMoves() {
        return new int[0][];
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
