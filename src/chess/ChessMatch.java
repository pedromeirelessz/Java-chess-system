package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

//-----------------------------------------------------------------------------------------------------------

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
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

	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}

	private void initialSetup() {
		placeNewPiece('c', 7, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}

}
