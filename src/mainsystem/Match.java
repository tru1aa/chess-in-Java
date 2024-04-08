package mainsystem;

import boardsystem.Board;
import chesspieces.King;
import chesspieces.Rook;

public class Match {
	
	private Board board;
	
	public Match() {
		board = new Board(8, 8);
		initialSetup();
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
	
	public void placeNewPiece(char column, int row, PieceMain piece) {
		board.placePiece(piece, new PositionMain(column, row).toPosition());
	}
	
	public void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('h', 3, new King(board, Color.BLACK));
	}
}
