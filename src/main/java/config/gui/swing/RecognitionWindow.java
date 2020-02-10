package config.gui.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import java.awt.Point;

import javax.swing.JPanel;

import SignalProcessing.SignalController;
import constantsAndConfiguration.ConfigurationConstants;

public class RecognitionWindow extends JPanel implements MouseMotionListener, MouseListener {
	
	private SignalController member_SignalController = new SignalController();
	private Vector<Point> clickVisualization;
	
	
	public RecognitionWindow() {
		super();
		setBackground(ConfigurationConstants.recognitionColor);
		addMouseListener(this);
		addMouseMotionListener(this);
		setVisible(true);
		setBounds(10, 10, 480, 380);
		clickVisualization = new Vector<Point>();
	}
	
	//the 'override' method for swing graphics
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int j = 0; j < clickVisualization.size(); j++) {
			((Graphics2D) g).drawOval((int) clickVisualization.get(j).getX(), (int) clickVisualization.get(j).getY(), 5, 5);
		}
	}
	
	public RecognitionWindow createStandardInstance() {
		RecognitionWindow standardRecWin = new RecognitionWindow();
		
		standardRecWin.setBackground(ConfigurationConstants.recognitionColor);
		standardRecWin.addMouseListener(this);
		standardRecWin.addMouseMotionListener(this);
		standardRecWin.setVisible(true);
		standardRecWin.setBounds(10, 10, 480, 380);
        return standardRecWin;
	}
	
	public void mousePressed(MouseEvent e) {
		//give event to other class that should handle execution
		member_SignalController.mousePressed(e);
		
		//also update old visualization with the start of a new sequence
		clickVisualization.clear();
	}
	
	public void mouseDragged(MouseEvent e) {
		//give event to other class that should handle execution
		member_SignalController.mouseDragged(e);
		
		//handle graphical output
        clickVisualization.add(new Point(e.getX(),e.getY()));
        this.paintImmediately(getBounds());
	}

	public void mouseReleased(MouseEvent e) {
		//give event to other class that should handle execution
		member_SignalController.mouseReleased(e);
	}

	public RecognitionWindow(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
	}

	public RecognitionWindow(LayoutManager arg0) {
		super(arg0);
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mouseMoved(MouseEvent arg0) {
		
	}
	
}
