package StartUp;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import tictactoe.TicTacToeFrame;

public class HumanColorPanel extends JPanel implements MouseListener {

	public HumanColorPanel(Color c){
		setPreferredSize(new Dimension(30,30));
		setBackground(c);
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		TicTacToeFrame.humanColor = this.getBackground();
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
