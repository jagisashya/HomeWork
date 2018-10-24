
public class GameBoard {
	private char[][] gameBoard = new char[3][3];

	public GameBoard() {
		// super();
		int num = 49;
		for (int line = 0; line < gameBoard.length; line++) {
			for (int col = 0; col < gameBoard[line].length; col++) {

				gameBoard[line][col] = (char) num++;
			}
		}
	}

	public void Print() {
		for (int line = 0; line < gameBoard.length; line++) {
			for (int col = 0; col < gameBoard[line].length; col++) {
				System.out.print(gameBoard[line][col] + "  ");
			}
			System.out.println();
		}
	}

	public int ChangePosition(char simbol, char position) {
		boolean swError = VerifyValue(position);
		if (!swError)
			return 1;
		int number = (int) (position) - 1;
		int line = position / 3;
		int col = position % 3;

		if (gameBoard[line][col] == 88 || gameBoard[line][col] == 86) {
			return 2;
		}
		gameBoard[line][col] = simbol;
		return 0;
		// if

	}

	private boolean VerifyValue(char position) {
		if (position < 49 || position > 57)
			return false;
		else
			return true;
	}

	public boolean VerifyWin(char simbol, char position) {
		int number = (int) (position) - 1;
		int line = position / 3;
		int col = position % 3;

		if (line == col) {
			for (int i = 0; line < gameBoard.length; i++) {
				if (gameBoard[i][i] != simbol) {
					return false;
				}
			}
			return true;
		}

		if ((line == 0 && col == 2) || line == 2 && col == 0) {
			for (int i = 0, j = 2; line < gameBoard.length; i++, j--) {
				if (gameBoard[i][i] != simbol) {
					return false;
				}
			}
			return true;
		}
		// line fix
		for (int y = 0; y < gameBoard.length; y++) {
			if (gameBoard[line][y] != simbol) {
				for (int z = 0; y < gameBoard[line].length; z++) {
					if (gameBoard[z][col] != simbol) {
						return false;
					}
				}
				return false;
			}
		}
		return true;

	}

	public boolean EndGame() {
		for (int line = 0; line < gameBoard.length; line++) {
			for (int col = 0; col < gameBoard[line].length; col++) {
				if (gameBoard[line][col] != 88 && gameBoard[line][col] != 89 ) {
					return false;
				}
			}
		}
		return true;
	}
}
