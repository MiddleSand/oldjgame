package root.framework.screen;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import root.framework.Util;
import root.framework.rendering.RenderScreen;
import root.framework.rendering.ScreenManager;

public class JgameScreen {
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void start(ScreenManager scmg) {
		/**
		 * @wbp.parser.entryPoint
		 */
		ImageIcon image = new ImageIcon(Util.getDesktopDirectory()+"\\logo.png");
		JFrame frame = new JFrame("Jgame");
		frame.getContentPane().add(scmg.rs);
		frame.setIconImage(new ImageIcon(Util.getDesktopDirectory()+"\\logo.png").getImage());
		JLabel label = new JLabel(image);
		label.setIcon(image);
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1000, 800));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		Util.printNotice("Stage ready.", JgameScreen.class);
	}
}
