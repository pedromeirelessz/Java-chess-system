package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;

//-----------------------------------------------------------------------------------------------------------

	public ChessMatch() {
		board = new Board(8, 8);
	}

//-----------------------------------------------------------------------------------------------------------

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

		for (int rows = 0; rows < board.getRows(); rows++) {
			for (int column = 0; column < board.getColumns(); column++) {
				mat[rows][column] = (ChessPiece) board.piece(rows, column);
			}
		} 

		return mat;
	}

}
