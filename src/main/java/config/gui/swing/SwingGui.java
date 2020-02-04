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

import constants.Constants;

public class SwingGui {

	private JFrame mainStage;
	private JPanel panel;
	private JComponent banner;
	private JPanel recognitionPanel;
	private GestureWindow gestureWindow;

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
			jFrame.add(bringPanel_Main());
		}
	}
	
	private JComponent bringPanel_Main() {
		if (panel == null) {
			JPanel mainPanel = new JPanel();
			mainPanel.setBounds(40, 100, 500, 400);
			mainPanel.setBackground(Color.CYAN);
			mainPanel.setLayout(new FlowLayout());
			mainPanel.add(bringButton_Config());
			mainPanel.add(bringPanel_Recognition());
			return mainPanel;
		}
		return panel;
	}

	private JTabbedPane bringTab() {
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		return tabbedPane;
	}

	private JPanel bringPanel_Recognition() {
		if (recognitionPanel == null) {
			JPanel recognitionPanel = new JPanel();
			recognitionPanel.setBounds(10, 10, 480, 380);
			recognitionPanel.setBackground(Color.GREEN);
			
			return recognitionPanel;
		}
		return recognitionPanel;
	}
	
	private JComponent bringButton_Config() {
		JButton configButton = new JButton("Configuration");
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

}
