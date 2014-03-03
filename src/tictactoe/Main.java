package tictactoe;

import javax.swing.*;
import StartUp.*;
import java.awt.*;

public class Main {
	public static OpeningDialog d;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		d = new OpeningDialog();
		d.pack();
		d.setVisible(true);
	}

}
