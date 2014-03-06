package tictactoe;

import javax.swing.*;


import java.awt.*;

public class TicTacToePanel extends JPanel{
	
	public TicTacToePanel(){
		
		for( int i = 0; i < 9; i++ ){
			add(new TicPanel());
		}
		setLayout(new GridLayout(3,3));
	}

	public boolean getHumanWin(JPanel panel){
		if( panel.getComponent(0).getBackground().equals(panel.getComponent(1).getBackground()) && panel.getComponent(0).getBackground().equals(panel.getComponent(2).getBackground()) && panel.getComponent(2).getBackground().equals(TicTacToeFrame.humanColor))
			return true;
		if( panel.getComponent(3).getBackground().equals(panel.getComponent(4).getBackground()) && panel.getComponent(3).getBackground().equals(panel.getComponent(5).getBackground()) && panel.getComponent(5).getBackground().equals(TicTacToeFrame.humanColor) )
			return true;
		if( panel.getComponent(6).getBackground().equals(panel.getComponent(7).getBackground()) && panel.getComponent(6).getBackground().equals(panel.getComponent(8).getBackground()) && panel.getComponent(8).getBackground().equals(TicTacToeFrame.humanColor) )
			return true;
		if( panel.getComponent(0).getBackground().equals(panel.getComponent(3).getBackground()) && panel.getComponent(0).getBackground().equals(panel.getComponent(6).getBackground()) && panel.getComponent(6).getBackground().equals(TicTacToeFrame.humanColor) )
			return true;
		if( panel.getComponent(1).getBackground().equals(panel.getComponent(4).getBackground()) && panel.getComponent(1).getBackground().equals(panel.getComponent(7).getBackground()) && panel.getComponent(7).getBackground().equals(TicTacToeFrame.humanColor) )
			return true;
		if( panel.getComponent(2).getBackground().equals(panel.getComponent(5).getBackground()) && panel.getComponent(2).getBackground().equals(panel.getComponent(8).getBackground()) && panel.getComponent(8).getBackground().equals(TicTacToeFrame.humanColor) )
			return true;
		if( panel.getComponent(0).getBackground().equals(panel.getComponent(4).getBackground()) && panel.getComponent(0).getBackground().equals(panel.getComponent(8).getBackground()) && panel.getComponent(8).getBackground().equals(TicTacToeFrame.humanColor) )
			return true;
		if( panel.getComponent(2).getBackground().equals(panel.getComponent(4).getBackground()) && panel.getComponent(2).getBackground().equals(panel.getComponent(6).getBackground()) && panel.getComponent(6).getBackground().equals(TicTacToeFrame.humanColor) )
			return true;
		return false;
	}
	public boolean getComputerWin(JPanel panel){
		if( panel.getComponent(0).getBackground().equals(panel.getComponent(1).getBackground()) && panel.getComponent(0).getBackground().equals(panel.getComponent(2).getBackground()) && panel.getComponent(2).getBackground().equals(TicTacToeFrame.computerColor))
			return true;
		if( panel.getComponent(3).getBackground().equals(panel.getComponent(4).getBackground()) && panel.getComponent(3).getBackground().equals(panel.getComponent(5).getBackground()) && panel.getComponent(5).getBackground().equals(TicTacToeFrame.computerColor) )
			return true;
		if( panel.getComponent(6).getBackground().equals(panel.getComponent(7).getBackground()) && panel.getComponent(6).getBackground().equals(panel.getComponent(8).getBackground()) && panel.getComponent(8).getBackground().equals(TicTacToeFrame.computerColor) )
			return true;
		if( panel.getComponent(0).getBackground().equals(panel.getComponent(3).getBackground()) && panel.getComponent(0).getBackground().equals(panel.getComponent(6).getBackground()) && panel.getComponent(6).getBackground().equals(TicTacToeFrame.computerColor) )
			return true;
		if( panel.getComponent(1).getBackground().equals(panel.getComponent(4).getBackground()) && panel.getComponent(1).getBackground().equals(panel.getComponent(7).getBackground()) && panel.getComponent(7).getBackground().equals(TicTacToeFrame.computerColor) )
			return true;
		if( panel.getComponent(2).getBackground().equals(panel.getComponent(5).getBackground()) && panel.getComponent(2).getBackground().equals(panel.getComponent(8).getBackground()) && panel.getComponent(8).getBackground().equals(TicTacToeFrame.computerColor) )
			return true;
		if( panel.getComponent(0).getBackground().equals(panel.getComponent(4).getBackground()) && panel.getComponent(0).getBackground().equals(panel.getComponent(8).getBackground()) && panel.getComponent(8).getBackground().equals(TicTacToeFrame.computerColor) )
			return true;
		if( panel.getComponent(2).getBackground().equals(panel.getComponent(4).getBackground()) && panel.getComponent(2).getBackground().equals(panel.getComponent(6).getBackground()) && panel.getComponent(6).getBackground().equals(TicTacToeFrame.computerColor) )
			return true;
		return false;
	}
	boolean getWin (char board[], char player)
	{
		if( board[0] == board[1] && board[1] == board[2] && board[0] == player )
			return true;
		if( board[3] == board[4] && board[3] == board[5] && board[3] == player )
			return true;
		if( board[6] == board[7] && board[6] == board[8] && board[6] == player )
			return true;
		
		if( board[0] == board[3] && board[0] == board[6] && board[0] == player )
			return true;
		if( board[1] == board[4] && board[1] == board[7] && board[1] == player )
			return true;
		if( board[2] == board[5] && board[2] == board[8] && board[2] == player )
			return true;

		if( board[0] == board[4] && board[0] == board[8] && board[0] == player )
			return true;
		if( board[2] == board[4] && board[2] == board[6] && board[2] == player )
			return true;

		return false;

	}
	
	public boolean boardIsFull(){
		boolean full = true;
		for( int i = 0; i < 9; i++ ){
			full &= !getComponent(i).getBackground().equals(Color.WHITE);
		}
		return full;
	}
	public char[] getCharBoard(){
		char[] b = { ' ' , ' ',' ',' ',' ',' ',' ',' ',' '};
		for( int i = 0; i < 9; i++ ){
			if( this.getComponent(i).getBackground().equals(Color.WHITE) ){
				b[i] = '-';
			}
			else if( this.getComponent(i).getBackground().equals(TicTacToeFrame.humanColor) ){
				b[i] = 'X';
				
			}
			else{
				b[i] = 'O';
			}
			
		}
		
		return b;
	}
	public JPanel getPanelFromBoard(char[] b){
		JPanel ret = new JPanel();
		JComponent c;
		for( int i = 0; i < 9; i++ ){
			if( b[i] =='-' ){
				c = new JPanel();
				c.setBackground(Color.WHITE);
				ret.add(c);
			}
			else if( b[i] == 'X'){
				c = new JPanel();
				c.setBackground(TicTacToeFrame.humanColor);
				ret.add(c);
			}
			else{
				c = new JPanel();
				c.setBackground(TicTacToeFrame.computerColor);
				ret.add(c);
			}
			
		}
		return ret;
	}
	int chooseMove( char board[] )
	{
		int compMove = -1;
		
		int numCount = 0;
		for( int i = 0; i < 9; i++ )
			if( board[i] != '-' )
				numCount++;
		if( numCount == 1 )
			if( board[0] != '-' || board[2] != '-' || board[6] != '-' ||board[8] != '-' )
				return 4;
		

		for( int i = 0; i < 9; i++ )
		{	
				char[] tempBoard = getCharBoard().clone();

				if( tempBoard[i] == '-' )
				{
					tempBoard[i] = 'O';
					if( getWin(tempBoard,'O') )
						compMove = i;
				}
		}

		if( compMove == -1 ){
				for( int i = 0; i < 9; i++ )
			{
				for( int j = i + 1; j < 9; j++ )
				{
					char[] tempBoard = getCharBoard().clone();
			
					if( tempBoard[i] == '-' )
					{
						tempBoard[i] = 'X';
					}
					if( tempBoard[j] == '-' )
					{
						tempBoard[j] ='X';
					}
					if( getWin(tempBoard,'X') )
					{
						tempBoard[j] = board[j];
						if( getWin(tempBoard,'X') )
						{
							compMove = i;
						}
						else
						{
							tempBoard[j] = 'X';
							tempBoard[i] = board[i];
							if( getWin(tempBoard,'X') )
							{
								compMove = j;
							}
						}
						if( compMove == -1 )
						{
							compMove = i;
						}
						break;
					}
	
				}
			}
		}	
					
		return compMove;
	}
}
//	int chooseMove()
//	{
//		int compMove = -1;
//		int numCount = 0;
//		for( int i = 0; i < 9; i++ )
//			if( getCharBoard()[i] != '-' )
//				numCount++;
//		if( numCount == 1 )
//			if( getCharBoard()[0] != '-' || getCharBoard()[2] != '-' || getCharBoard()[6] != '-' ||getCharBoard()[8] != '-' )
//				return 4;
//			
//		char[] tempBoard = new char[9];
//		
//		for( int i = 0; i < 9; i++ ){
//			tempBoard = getCharBoard();
//			if(tempBoard[i] == '-'){
//				tempBoard[i] = 'O';
//				if(getComputerWin(getPanelFromBoard(tempBoard))){
//					compMove =  i;
//				}
//				else{
//					tempBoard[i] = '-';
//				}
//			}
//		}
//		
//		if( compMove != -1 ){
//			return compMove;
//		}
//		
//		for( Integer index = 0; index < 9; index++ )
//		{	
//				tempBoard = getCharBoard();
//				if( tempBoard[index] == '-' )
//				{
//					tempBoard[index] = 'X';
//					if( getHumanWin(getPanelFromBoard(tempBoard)) ){
//						return index;
//
//					}
//				}
//		}
//
//		for( int i = 0; i < 9; i++ )
//		{	
//				tempBoard = getCharBoard();
//				if( tempBoard[i] == '-' )
//				{
//					tempBoard[i] = 'O';
//					if( getComputerWin(getPanelFromBoard(tempBoard)) )
//						return i;
//				}
//		}
//		
//		if( compMove == -1 )
//				for( int i = 0; i < 9; i++ )
//		{
//			for( int j = i + 1; j < 9; j++ )
//			{
//				tempBoard = getCharBoard();
//
//				if( tempBoard[i] == '-' )
//				{
//					tempBoard[i] = 'X';
//				}
//				if( tempBoard[j] == '-' )
//				{
//					tempBoard[j] ='X';
//				}
//				if( getHumanWin(getPanelFromBoard(tempBoard)) )
//				{
//					tempBoard[j] = getCharBoard()[j];
//					if( getHumanWin(getPanelFromBoard(tempBoard)) )
//					{
//						compMove = i;
//					}
//					else
//					{
//						tempBoard[j] = 'X';
//						tempBoard[i] = getCharBoard()[i];
//
//						if( getHumanWin(getPanelFromBoard(tempBoard)) )
//						{
//							compMove = j;
//						}
//					}
//					if( compMove == -1 )
//					{
//						compMove = i;
//					}
//					break;
//				}
//			}
//		}
//		return compMove;
//

