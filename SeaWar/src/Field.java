
public class Field {

	private Cell[] cells;
	int rowSize;
	
	public Field(int size)
	{
		this.cells = new Cell[size * size];
		this.rowSize = size;
		for (int i = 0; i < cells.length; i++)
		{
			cells[i] = new Cell();
		}
	}
	
	public Cell getCell(int index)
	{
		return cells[index];
	}
	
	public void setAllCellsVisible()
	{
		for (Cell each : cells)
		{
			each.setVisible(true);
		}
	}
	
	public boolean placeShip(int... ships){
		return new SimpleShipPlacer().plaseShips(cells, ships);
	}
	
	public void drawCells()
	{
		for(int i = 0; i < cells.length; i ++)
		{
			if(cells[i].isEmpty()){
				System.out.print("O");
			} else{
				System.out.print("X");
			}
			if ((i + 1) % rowSize == 0){
				System.out.println("");
			}
		}
	}
	
}
