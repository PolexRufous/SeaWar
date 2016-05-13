
public class PersonConsolePlayer extends Player {

	public PersonConsolePlayer(int fieldSize)
	{
		this.ownField = new Field(fieldSize);
		this.enemyField = new Field(fieldSize);
		ownField.setAllCellsVisible();
		ownField.placeShip(4, 3, 3, 2, 2, 2, 1, 1, 1, 1);
	}

	@Override
	public boolean hasAliveShips() {
		return ownField.hasAliveShips();
	}
	
	@Override
	public String toString()
	{
		return "Person player";
	}

	@Override
	public int makeMove() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getMove(int cell) {
		// TODO Auto-generated method stub
		
	}
	
	public void drawFields(){
		Cell[] cells = ownField.getCells();
		System.out.println("Your field:");
		drawCells(cells);
		System.out.println();
		
		cells = enemyField.getCells();
		System.out.println("Enemy field:");
		drawCells(cells);
		System.out.println();
	}
	
	private void drawCells(Cell[] cells)
	{
		int rowSize = (int)Math.sqrt(cells.length);
		
		for(int i = 0; i < rowSize; i ++){
			if((i / 10) < 0){
				System.out.print(" " + i + " ");
			} else if(i / 100 < 0){
				System.out.print(" " + i);
			} else{
				System.out.print(i);
			}
		}
		System.out.println();
		
		for(int i = 0; i < cells.length; i ++){
			
			if(i % rowSize == 0){
			
				if((i / 10) < 0){
					System.out.print(" " + i/rowSize + " ");
				} else if((i / 100) < 0){
					System.out.print(" " + i/rowSize);
				} else{
					System.out.print(i/rowSize);
				}
			}
			
			if(cells[i].isVisible()){
				if(cells[i].isVisited()){
					if(cells[i].isEmpty()){
						System.out.print(" x ");
					} else{
						System.out.print("[x]");
					}
				} else{
					if(cells[i].isEmpty()){
						System.out.print(" o ");
					} else{
						System.out.print("[o]");
					}
				}
					
			} else{
				System.out.print(" O ");
			}
			
			if ((i + 1) % rowSize == 0){
				System.out.println("");
			}
		}
	}
}
