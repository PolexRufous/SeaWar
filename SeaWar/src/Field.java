
public class Field {

	private Cell[] cells;
	int rowSize;
	int aliveShips;
	
	public Field(int size){
		this.cells = new Cell[size * size];
		this.rowSize = size;
		for (int i = 0; i < cells.length; i++)
		{
			cells[i] = new Cell();
		}
	}
	
	public Cell getCell(int index){
		return cells[index];
	}
	
	public void setAllCellsVisible(){
		for (Cell each : cells)
		{
			each.setVisible(true);
		}
	}
	
	public boolean placeShip(int... ships){
		aliveShips = ships.length;
		return new SimpleShipPlacer().plaseShips(cells, ships);
	}
	
		
	public boolean hasAliveShips(){
		return aliveShips > 0;
	}
	
	public Cell[] getCells(){
		return cells;
	}
	
	
}
