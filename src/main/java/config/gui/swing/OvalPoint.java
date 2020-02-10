package config.gui.swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class OvalPoint extends Canvas  {

	public OvalPoint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(20, 20, 10 , 10 );
	}
	
}
