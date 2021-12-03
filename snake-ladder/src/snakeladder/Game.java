package snakeladder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
	private Board board;
	private List<Player> players;
	private Dice dice;
	private boolean start;
	Queue<Player> queue;
	List<Player> winners;
	public Game(Board board, Dice dice) {
		this.board = board;
		this.dice = dice;
		this.start=false;
		players=new ArrayList<Player>();
		queue=new LinkedList<Player>();
		winners=new LinkedList<Player>();
	}
	public void start() {
		start=true;
		queue.addAll(players);
	}
	public void addPlayer(Player p) {
		p.setCellid(board.getFirstCell());
		players.add(p);
	}
	public void stop() {
		this.start=false;
		queue.clear();
		winners.clear();
		players.clear();
	}
	public void Play() {
		if(!start)
			return;
		Player currentPlayer=queue.poll();
		int random=dice.rolldice();
		Cell c=board.move(currentPlayer.getCell(),random);
		currentPlayer.setCellid(c);
		if(c.isWinCell())
		{
			winners.add(currentPlayer);
			if(winners.size()==players.size())
			{
				System.out.println("winners are");
				
				for(Player p:winners)
				{
					
					System.out.println(p.getName());
				}
				this.stop();
			}
		}
		else
		{
			for(Player p:players)
				System.out.println(p.getName()+"-----"+p.getCell().getValue());
			queue.offer(currentPlayer);
		}
	}
}
