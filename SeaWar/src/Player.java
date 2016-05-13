
public abstract class Player {

	protected Field ownField;
	protected Field enemyField;
	
	public abstract int makeMove();
	public abstract void getMove(int cell);
	
	public Field getOwnField()
	{
		return ownField;
	}
	
	public Field getenemyField()
	{
		return enemyField;
	}
			
	public abstract boolean hasAliveShips();
	
}
