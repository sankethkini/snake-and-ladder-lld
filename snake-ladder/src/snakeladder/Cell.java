package snakeladder;

public class Cell {
	private int value;
	private boolean winCell;
	Cell(int value,boolean winCell)
	{
		this.value=value;
		this.winCell=winCell;
	}
	public int getValue() {
		return value;
	}
	public boolean isWinCell() {
		return winCell;
	}
	
}
