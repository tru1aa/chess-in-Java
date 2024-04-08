package chesspieces;

import boardsystem.Board;
import mainsystem.Color;
import mainsystem.PieceMain;

public class King extends PieceMain{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}
}
