package nix.baseeducation.seawar;

import nix.baseeducation.seawar.controller.PvEConsoleGame;
import nix.baseeducation.seawar.controller.Game;

public class Runner {

	public static void main(String[] args) {

		Game game = new PvEConsoleGame(10);
		game.startNewGame();
		
	}
	
}
