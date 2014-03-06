package tictactoe;

import javax.swing.*;

import java.awt.event.*;

public class PlayAgainWindow extends JFrame implements ActionListener{

	JButton yButton;
	JButton nButton;
	
	public PlayAgainWindow(){
		JPanel mPanel = new JPanel();
		mPanel.add(new JLabel("Play Again?"));
		yButton = new JButton("Yes");
		nButton = new JButton("No");
		mPanel.add(nButton);
		nButton.addActionListener(this);
		yButton.addActionListener(this);
		mPanel.add(yButton);
		mPanel.setLayout(new BoxLayout(mPanel,BoxLayout.LINE_AXIS));
		this.setContentPane(mPanel);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource() == nButton ){
			this.dispose();
		}
		else{
			this.dispose();
			Main.d.setVisible(true);
		}
	}

}
