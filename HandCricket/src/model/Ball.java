package model;

public class Ball {
	public BallResult getBallScore(Gesture gesture, PlayerEnum playerEnum) {
		BallResult ballResult = new BallResult();
		ballResult.setPlayer(playerEnum);
		
		if(gesture.getPlayerAGesture() != gesture.getPlayerBGesture()) {
				ballResult.setScore(gesture.getPlayerAGesture());
				return 	ballResult;
			} else {
				ballResult.setScore(0);
				return 	ballResult;
		}

	}
}
