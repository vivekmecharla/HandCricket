package model;

public class Gesture {
	private PlayerEnum battingPlayer;
	private int playerAGesture;
	private int playerBGesture;

	public Gesture(PlayerEnum battingPlayer, int playerAGesture, int playerBGesture ){
		this.setBattingPlayer(battingPlayer);
		this.setPlayerAGesture(playerAGesture);
		this.setPlayerBGesture(playerBGesture);
	}

	public PlayerEnum getBattingPlayer() {
		return battingPlayer;
	}

	public void setBattingPlayer(PlayerEnum battingPlayer) {
		this.battingPlayer = battingPlayer;
	}

	public int getPlayerAGesture() {
		return playerAGesture;
	}

	public void setPlayerAGesture(int playerAGesture) {
		this.playerAGesture = playerAGesture;
	}

	public int getPlayerBGesture() {
		return playerBGesture;
	}

	public void setPlayerBGesture(int playerBGesture) {
		this.playerBGesture = playerBGesture;
	}


}
