package chesspieces;

import boardsystem.Board;
import mainsystem.Color;
import mainsystem.PieceMain;

public class Rook extends PieceMain{

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}
}
