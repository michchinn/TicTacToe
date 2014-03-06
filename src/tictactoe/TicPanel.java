package tictactoe;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class TicPanel extends JPanel implements MouseListener{

	public TicPanel(){
		this.setBackground(Color.WHITE);
		//setPreferredSize(new Dimension(40,40));
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(this.getBackground().equals(Color.WHITE)){
			if(TicTacToeFrame.turn % 2 == 0){
				this.setBackground(TicTacToeFrame.humanColor);
			}
			else
				this.setBackground(TicTacToeFrame.computerColor);
			TicTacToeFrame.turn+=2;
			TicTacToePanel p = (TicTacToePanel)this.getParent();
			if(p.getComputerWin(p)){
				JOptionPane.showMessageDialog(new JFrame(), "I WIN");
				JFrame f = (JFrame) p.getParent().getParent().getParent();
				f.dispose();
				PlayAgainWindow w = new PlayAgainWindow();
				return;
			}
			if(p.getHumanWin(p)){
				JOptionPane.showMessageDialog(new JFrame(), "YOU WIN");
				JFrame f = (JFrame) p.getParent().getParent().getParent();
				f.dispose();
				PlayAgainWindow w = new PlayAgainWindow();
				return;
			}
			if(p.boardIsFull()){
				JOptionPane.showMessageDialog(new JFrame(), "It's a tie!");
				JFrame f = (JFrame) p.getParent().getParent().getParent();
				f.dispose();
				PlayAgainWindow w = new PlayAgainWindow();
				return;
			}
			try{
				p.getComponent(p.chooseMove(p.getCharBoard())).setBackground(TicTacToeFrame.computerColor);
			}
			catch(Exception ex){}
			if(p.getComputerWin(p)){
				JOptionPane.showMessageDialog(new JFrame(), "I WIN");
				JFrame f = (JFrame) p.getParent().getParent().getParent();
				f.dispose();
				PlayAgainWindow w = new PlayAgainWindow();
				return;
			}
			if(p.getHumanWin(p)){
				JOptionPane.showMessageDialog(new JFrame(), "YOU WIN");
				JFrame f = (JFrame) p.getParent().getParent().getParent();
				f.dispose();
				PlayAgainWindow w = new PlayAgainWindow();
				return;
			}
			if(p.boardIsFull()){
				JOptionPane.showMessageDialog(new JFrame(), "It's a tie!");
				JFrame f = (JFrame) p.getParent().getParent().getParent();
				f.dispose();
				PlayAgainWindow w = new PlayAgainWindow();
				return;
			}
			
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
}

