package StartUp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;

import tictactoe.TicTacToeFrame;

public class ComputerColorPanel  extends JPanel implements MouseListener {

	public ComputerColorPanel(Color c){
		setPreferredSize(new Dimension(30,30));
		setBackground(c);
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		TicTacToeFrame.computerColor = this.getBackground();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
	
	
}
