package config.gui.swing;

import java.awt.Color;
import java.awt.Event;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import constantsAndConfiguration.ConfigurationConstants;
import receiverFromAWT.SignalController;

public class RecognitionWindow extends JPanel implements MouseMotionListener, MouseListener {
	
	private SignalController member_SignalController = new SignalController();
	
	public RecognitionWindow() {
		super();
		setBackground(ConfigurationConstants.recognitionColor);
		addMouseListener(this);
		addMouseMotionListener(this);
		setVisible(true);
		setBounds(10, 10, 480, 380);
		setBackground(Color.RED);
	}
	
//	public RecognitionWindow createNewInstance() {
//	 
//	}
	
	public void mousePressed(MouseEvent e) {
		//give event to other class that should handle execution
		member_SignalController.mousePressed(e);
	}
	
	public void mouseDragged(MouseEvent e) {
		//give event to other class that should handle execution
		member_SignalController.mouseDragged(e);
		this.paintImmediately(this.getBounds());
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
