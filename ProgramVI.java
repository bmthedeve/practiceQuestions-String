import java.util.*;

public class ProgramVI{
	public static void main(String args[]){
		
		Game g = new Game("Balamurugan- ","Ajay- ");

		System.out.println(PlayMonitor.matchWin("3,2:5,2:2,0"));
		System.out.println(PlayMonitor.playerValidate("3,2:5,2:2,0",g));
	}
}

class Game{
	private String player1;
	private String player2;

	public Game(String player1, String player2){
		this.player1 = player1;
		this.player2 = player2;
	}

	public void setPlayer1(String player1){
		this.player1 = player1;
	}
	public void setPlayer2(String player2){
		this.player2 = player2;
	}
	public String getPlayer1(){
		return player1;
	}
	public String getPlayer2(){
		return player2;
	}

	@Override
	public String toString(){
		return "Game [player1= "+player1+", player2= "+player2+"]";
	}
}

class PlayMonitor{
	private Game game;
	private String winningTracking;

	public static int matchWin(String winningTracking){
		int matches=0;
		int wins=0;
		String arr[] = winningTracking.split(",|:");
		int intArr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			intArr[i] = Integer.parseInt(arr[i]);
		}
		for(int i=0;i<intArr.length;i++){
			if(i%2==0){matches+=intArr[i];}
			else if(i%2!=0){wins+=intArr[i];}
		}
		double ans = ((double)wins/(double)matches)*100;
		return (int)ans;
	}

	public static int playerValidate(String winningTracking, Game game){
		if(game.getPlayer1().matches("[A-Z][a-z]*-?\\s?")) return 5;
		else if(game.getPlayer1().matches("[A-Z][a-z]*-?\\s?") && game.getPlayer2().matches("[A-Z][a-z]*-?\\s?")) return 10;
		else return 0;
	}
}