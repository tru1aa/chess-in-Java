package mainsystem;

import boardsystem.Board;

public class Match {
	
	private Board board;
	
	public Match() {
		board = new Board(8, 8);
	}
	
	public PieceMain[][] getPieces(){
		PieceMain[][] matriz = new PieceMain[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				matriz[i][j] = (PieceMain) board.piece(i, j);
			}
		}
		return matriz;
	}
	
}
