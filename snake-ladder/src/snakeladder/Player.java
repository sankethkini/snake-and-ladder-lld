package snakeladder;

public class Player {
	private Cell cell;
	private String name;
	public Player(String name) {
		this.name = name;
	}
	public Cell getCell() {
		return cell;
	}
	public void setCellid(Cell cell) {
		this.cell = cell;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
