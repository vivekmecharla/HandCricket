import java.util.List;

import model.Ball;
import model.BallResult;
import model.GameRound;
import model.Gesture;
import model.PlayerEnum;

public class HandCricketGame {


	
	public String getResult(List<GameRound> gameRounds) {


			int playerAScore = getRoundScore(gameRounds.get(0).getGestures()); 
			int playerBScore = getRoundScore(gameRounds.get(1).getGestures()); 
			
			if(playerAScore > playerBScore) {
				return PlayerEnum.PLAYER_A.toString();
			} else if(playerAScore < playerBScore) {
				return PlayerEnum.PLAYER_B.toString();
			} else {
				return "Tie";
			}
		
	}

	public int getRoundScore(List<Gesture> gestures){

		int score =0;
		Ball ball = new Ball();
		
		for (Gesture gesture : gestures) {
			BallResult currentScore =  ball.getBallScore(gesture, gesture.getBattingPlayer()) ;
			if(currentScore.getScore() != 0) {
				score+=currentScore.getScore();	
			} else {
				break;
			}
			
		}
		return score;
	}

	
}
