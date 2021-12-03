package snakeladder;

import java.util.ArrayList;
import java.util.List;

public abstract class Board {
	private int size;
	private List<Cell> cells;
	Board(int size)
	{
		this.size=size;
		this.cells=new ArrayList<Cell>();
	}
	public Cell move(Cell cell,int positions)
	{	
		int value=cell.getValue();
		if(value+positions>=size)
		{
			return cells.get(size);
		}
		int res=cells.get(value+positions).getValue();
		return cells.get(res);
	}
	public Cell getFirstCell()
	{
		return cells.get(1);
	}
	public void addCell(Cell c)
	{
		cells.add(c);
	}
}
