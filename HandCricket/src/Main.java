import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.GameRound;
import model.Gesture;
import model.PlayerEnum;

public class Main {


	public static void main(String[] args) {

		
		int[] arr = {0, 1, 2, 3, 4 , 6};
		Random random = new Random();

		
		GameRound gameRound1 = new GameRound();
		
		Gesture playerAGesture1 = new Gesture(PlayerEnum.PLAYER_A, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		Gesture playerAGesture2 = new Gesture(PlayerEnum.PLAYER_A, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		Gesture playerAGesture3 = new Gesture(PlayerEnum.PLAYER_A, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		Gesture playerAGesture4 = new Gesture(PlayerEnum.PLAYER_A, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		Gesture playerAGesture5 = new Gesture(PlayerEnum.PLAYER_A, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		Gesture playerAGesture6 = new Gesture(PlayerEnum.PLAYER_A, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		
		List<Gesture> gesturesA = new ArrayList<Gesture>();
		gesturesA.add(playerAGesture1);
		gesturesA.add(playerAGesture2);
		gesturesA.add(playerAGesture3);
		gesturesA.add(playerAGesture4);
		gesturesA.add(playerAGesture5);
		gesturesA.add(playerAGesture6);

		gameRound1.setGestures(gesturesA);
		GameRound gameRound2 = new GameRound();

		List<Gesture> gesturesB = new ArrayList<Gesture>();
		
		Gesture playerBGesture1 = new Gesture(PlayerEnum.PLAYER_B, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		Gesture playerBGesture2 = new Gesture(PlayerEnum.PLAYER_B, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		Gesture playerBGesture3 = new Gesture(PlayerEnum.PLAYER_B, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		Gesture playerBGesture4 = new Gesture(PlayerEnum.PLAYER_B, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		Gesture playerBGesture5 = new Gesture(PlayerEnum.PLAYER_B, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		Gesture playerBGesture6 = new Gesture(PlayerEnum.PLAYER_B, arr[random.nextInt(arr.length)], arr[random.nextInt(arr.length)]);
		gesturesB.add(playerBGesture1);
		gesturesB.add(playerBGesture2);
		gesturesB.add(playerBGesture3);
		gesturesB.add(playerBGesture4);
		gesturesB.add(playerBGesture5);
		gesturesB.add(playerBGesture6);
		
		gameRound2.setGestures(gesturesB);
		List<GameRound> gameRounds = new ArrayList<GameRound>();
		
		gameRounds.add(gameRound1);
		gameRounds.add(gameRound2);
		HandCricketGame game1 = new HandCricketGame();
		
		
		System.out.println( game1.getResult(gameRounds) );
	}

}
