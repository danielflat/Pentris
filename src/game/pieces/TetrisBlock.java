package game.pieces;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class TetrisBlock {
	
	private List<int[][]> block;
	private int colorNumber;
	private int x;
	private int y;
	private int rotationState;
	
	public TetrisBlock(int colorNumber,
			int x, int y, int[][]... block) {
		this.block = Arrays.asList(block);
		this.colorNumber = colorNumber;
		this.x = x;
		this.y = y;
		this.rotationState = 0;
	}
	
	public TetrisBlock(TetrisBlock block) {
		this.block = block.getAllBlocks();
		this.colorNumber = block.getColorNumber();
		this.x = block.getX();
		this.y = block.getY();
		this.rotationState = block.getRotationState();
	}
	
	public List<int[][]> getAllBlocks() {
		return block;
	}

	public int[][] getBlock() {
		return block.get(rotationState);
	}
	
	public int getColorNumber() {
		return colorNumber;
	}
	
	public int getWidth() {
		return block.get(rotationState).length;
	}
	
	public int getHeight() {
		return block.get(rotationState)[0].length;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	private int getRotationState() {
		return rotationState;
	}
	
	public void moveDown() {
		y++;
	}
	
	public void moveLeft() {
		x--;
	}
	
	public void moveRight() {
		x++;
	}

	public void rotateLeft() {
		if(block.size() != 0) {
			if(rotationState == 0) {
				rotationState = block.size() - 1;
			}
			else {
				rotationState--;
			}
		}
		
	}

	public void rotateRight() {
		if(block.size() != 0) {
			if(rotationState == block.size() - 1) {
				rotationState = 0;
			}
			else {
				rotationState++;
			}
		}
	}

	public void instantDrop() {
		// TODO Auto-generated method stub
		
	}
}
