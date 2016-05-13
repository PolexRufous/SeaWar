
public abstract class Player {

	private Field ownField;
	private Field enemyField;
	
	public abstract void makeMove(int cell);
	
	public Field getOwnField()
	{
		return ownField;
	}
	
	public Field getenemyField()
	{
		return enemyField;
	}
			
}
