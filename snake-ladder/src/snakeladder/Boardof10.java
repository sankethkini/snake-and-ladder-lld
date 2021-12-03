package snakeladder;

public class Boardof10 extends Board{

	Boardof10() {
		super(10);
		super.addCell(new Cell(0,false));
		super.addCell(new Cell(1,false));
		super.addCell(new Cell(2,false));
		super.addCell(new Cell(1,false));
		super.addCell(new Cell(4,false));
		super.addCell(new Cell(5,false));
		super.addCell(new Cell(9,false));
		super.addCell(new Cell(7,false));
		super.addCell(new Cell(8,false));
		super.addCell(new Cell(1,false));
		super.addCell(new Cell(10,true));
	}

}
