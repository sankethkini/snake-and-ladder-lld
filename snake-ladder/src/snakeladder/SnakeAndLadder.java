package snakeladder;

import java.util.Scanner;

public class SnakeAndLadder extends Game{

	public SnakeAndLadder() {
	
		super(new Boardof10(),new Dice());
		
	}
	public void PlayGame() {
		Scanner sc=new Scanner(System.in);
		int numOfPlayers;
		System.out.println("enter number of players");
		System.out.println("name");
		numOfPlayers=sc.nextInt();
		System.out.println(numOfPlayers);
		for(int i=0;i<numOfPlayers;i++)
		{
			String name=sc.next();
			Player player=new Player(name);
			super.addPlayer(player);
		}
		super.start();
		System.out.println("1.Play --- 2.stop");
		while(true)
		{
			int move=sc.nextInt();
			if(move==1)
			{
				super.Play();
			}
			else
			{
				super.stop();
				break;
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		SnakeAndLadder s=new SnakeAndLadder();
		s.PlayGame();
	}
}
