package tictactoe;
import javax.swing.*;


import java.awt.*;

public class TicTacToeFrame extends JFrame{
	
	public static int turn = 0;
	public static Color humanColor;
	public static Color computerColor;
	
	private TicTacToePanel pan;

	public TicTacToeFrame(){
		setTitle("Tic-Tac-Toe");
		turn = 0;
		pan = new TicTacToePanel();
		setContentPane(pan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void process(){
		if( pan.getHumanWin(pan) ){
			System.out.println("HUMAN WIN");
		}
		else if(pan.getComputerWin(pan))
			System.out.println("COMP WIN");
		else{
			System.out.println("NOT YET");
		}
		if(pan.boardIsFull()){
			System.out.println("FULL");
		}
	}
}
