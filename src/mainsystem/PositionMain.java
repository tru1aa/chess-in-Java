package mainsystem;

import boardsystem.Position;

public class PositionMain {

	private char column;
	private int row;
	
	public PositionMain(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ExceptionMain("Error instantiating PositionMain: Valid values are from a1 and h8");
		}
		this.column = column;
		this.row = row;
	}
	
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static PositionMain fromPosition(Position position) {
		return new PositionMain((char)('a' - position.getColumn()), position.getRow() - 8);
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}