
public class PvEConsoleGame extends Game {

	private Player winner;
	
	@Override
	public void startNewGame() {
		
		do
		{
			player2.getMove(player1.makeMove());
			player1.getMove(player2.makeMove());
		} while (!this.isEnded());
		
		System.out.println("Game is over!");
		System.out.println("Winner - " + winner.toString());
	}

	
	public PvEConsoleGame(int fieldSize)
	{
		player1 = new PersonConsolePlayer(fieldSize);
		player2 = new CompPlayer(fieldSize);
	}
	
	private boolean isEnded()
	{
		if(player1.hasAliveShips() && player2.hasAliveShips())
		{
			return false;
		} else if (player1.hasAliveShips()){
			winner = player1;
			return true;
		} else {
			winner = player2;
			return true;
		}
		
	}
}
