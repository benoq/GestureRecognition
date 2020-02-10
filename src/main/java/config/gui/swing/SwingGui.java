package config.gui.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import constantsAndConfiguration.Constants;

public class SwingGui {

	private JFrame mainStage;
	
	//JStuff
	private JPanel panel;
	private JComponent banner;
	
	//fillers JStuff
	private RecognitionWindow recognitionWindow;

	//core window: assigning elements
	public void createStage() {

		if (mainStage == null) {
			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame jFrame = new JFrame();		
			jFrame.setSize(600, 600);
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setTitle("GestureRecognitionApp");
			jFrame.setVisible(true);

			// add components to frame
			jFrame.add(bringBanner());
			jFrame.add(bringButton_Config());
			jFrame.add(bringPanel_Main());	
			
		}
	}
	
	private JComponent bringPanel_Main() {
		if (true) {//(panel == null) {
			JPanel mainPanel = new JPanel();
			mainPanel.setBounds(40, 100, 500, 400);
			mainPanel.setBackground(Color.CYAN);
			mainPanel.setLayout(new FlowLayout());
			mainPanel.add(bringRecognitionWindow());
			
//			JFrame test = new JFrame();
//			mainPanel.add(new JFrame ());
			return mainPanel;
		}
		return panel;
	}
	
    private void drawsomthing(JPanel p) {
    	OvalPoint op = new OvalPoint();		
    	p.add(op);
    	p.setVisible(true);
    }

	private JPanel bringRecognitionWindow() {
		if (recognitionWindow== null) {
			RecognitionWindow recognitionWindow = new RecognitionWindow();
			
			return recognitionWindow.createStandardInstance();
		}
		return recognitionWindow;
	}
	
	private JComponent bringButton_Config() {
		JButton configButton = new JButton("Configuration");
		configButton.setBounds(200, 20, 200, 50);
		return configButton;
	}

	private JComponent bringBanner() {
		if (banner == null) {
			JLabel titleInFormOfLabel = new JLabel("Hand");
			titleInFormOfLabel.setBounds(20, 20, 206, 27);
			titleInFormOfLabel.setFont(Constants.Heading_1);
			return titleInFormOfLabel;
		}
		return banner;
	}
	
	private JTabbedPane bringTab() {
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		return tabbedPane;
	}
}
