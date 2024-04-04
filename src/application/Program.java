package application;

import mainsystem.Match;

public class Program {

	public static void main(String[] args) {
		
		Match match = new Match();
		Interface.printBoard(match.getPieces());
		
	}

}
