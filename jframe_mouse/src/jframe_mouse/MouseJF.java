package jframe_mouse;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MouseJF extends JFrame {
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawLine(0, 0, 250, 250);
	}

}
