
public class CompPlayer extends Player {

	public CompPlayer(int fieldSize)
	{
		this.ownField = new Field(fieldSize);
		this.enemyField = new Field(fieldSize);
		ownField.setAllCellsVisible();
		ownField.placeShip(4, 3, 3, 2, 2, 2, 1, 1, 1, 1);
	}
	
	@Override
	public String toString()
	{
		return "Computer player";
	}

	@Override
	public boolean hasAliveShips() {
		return ownField.hasAliveShips();
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
	
}
