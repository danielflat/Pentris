package game.pieces.tetris;

import game.pieces.Block;

public class TSPiece extends Block{

	public TSPiece() {
		super(5, 3, 0, 
				new int[][] {{0, 1}, {1, 1}, {1, 0}}, 
				new int[][] {{1, 1, 0}, {0, 1, 1}}
				);
	}
}