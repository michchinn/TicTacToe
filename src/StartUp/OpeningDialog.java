package StartUp;
import javax.swing.*;

import tictactoe.TicTacToeFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpeningDialog extends JDialog{

	private JPanel mainPanel;
	private JButton startButton;
	
	class ColorPanel extends JPanel{
		public ColorPanel(){
			add(new JLabel("Select your color"));
			
			JPanel pan1 = new JPanel();
			pan1.add(new HumanColorPanel(Color.GREEN));
			pan1.add(new HumanColorPanel(Color.RED));
			pan1.add(new HumanColorPanel(Color.BLUE));
			pan1.add(new HumanColorPanel(Color.YELLOW));
			pan1.add(new HumanColorPanel(Color.BLACK));
			pan1.add(new HumanColorPanel(Color.ORANGE));
			
			add(pan1);
			
			add(new JLabel("Select the computer's color"));
			
			JPanel pan2 = new JPanel();
			pan2.add(new ComputerColorPanel(Color.GREEN));
			pan2.add(new ComputerColorPanel(Color.RED));
			pan2.add(new ComputerColorPanel(Color.BLUE));
			pan2.add(new ComputerColorPanel(Color.YELLOW));
			pan2.add(new ComputerColorPanel(Color.BLACK));
			pan2.add(new ComputerColorPanel(Color.ORANGE));
			
			add(pan2);
			
			setLayout(new GridLayout(2,2));
			setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		}
	}
	
	public OpeningDialog(){
		this.setTitle("Tic Tac Toe");
		ImageIcon icon = new ImageIcon("./images/mainIcon");
		mainPanel = new JPanel();
		JLabel titleLabel = new JLabel("Welcome to Tic-Tac-Toe");
		titleLabel.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
		titleLabel.setAlignmentX(CENTER_ALIGNMENT);
		mainPanel.add(titleLabel);
		mainPanel.add(new JSeparator(SwingConstants.HORIZONTAL));
		mainPanel.add(new ColorPanel());
		mainPanel.add(new JSeparator(SwingConstants.HORIZONTAL));
		startButton = new JButton("START");
		startButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				TicTacToeFrame f  = new TicTacToeFrame();
				
				if(f.computerColor == null)
					f.computerColor = Color.RED;
				if(f.humanColor == null)
					f.humanColor = Color.BLUE;
				if(f.humanColor.equals(f.computerColor)){
					if(!f.humanColor.equals(Color.RED)){
						f.humanColor = Color.RED;
					}
					else
						f.humanColor = Color.BLUE;
				}
				f.pack();
				f.setSize(new Dimension(400,400));
				f.setResizable(false);
				f.setVisible(true);
				tictactoe.Main.d.dispose();
			}
			
		});
		mainPanel.add(startButton);
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		add(mainPanel);
	}
	
}
