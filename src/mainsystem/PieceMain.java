package mainsystem;

import boardsystem.Board;
import boardsystem.Piece;

public class PieceMain extends Piece {

	private Color color;
	
	public PieceMain(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
