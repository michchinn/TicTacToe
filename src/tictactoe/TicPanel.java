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
			}
			if(p.getHumanWin(p)){
				JOptionPane.showMessageDialog(new JFrame(), "YOU WIN");
				JFrame f = (JFrame) p.getParent().getParent().getParent();
				f.dispose();
			}
			if(p.boardIsFull()){
				System.out.println("DONE");
				JFrame f = (JFrame) p.getParent().getParent().getParent();
				f.dispose();
			}
			try{
				p.getComponent(p.chooseMove()).setBackground(TicTacToeFrame.computerColor);
				System.out.println(p.chooseMove());
				if(p.getComputerWin(p)){
					System.out.println("COMP WIN");
				}
				if(p.getHumanWin(p)){
					System.out.println("HUM WIN");
				}
			}
			catch(Exception ex){}
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
