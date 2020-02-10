package config.gui.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import constantsAndConfiguration.Constants;

public class SwingGui extends JFrame {

	private JFrame mainStage;

	// JStuff
	private JPanel panel;
	private JComponent banner;

	// fillers of JStuff
	private RecognitionWindow recognitionWindow;
	private JTextField newGestureTXTFLD;
	private JButton button_AddNewGesture;

	// core window: assigning elements
	public void createStage() {

		if (mainStage == null) {
			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame jFrame = new JFrame();
			jFrame.setSize(750, 600);
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setTitle("GestureRecognitionApp");
			jFrame.setVisible(true);

			// add components to frame
			jFrame.add(bringBanner());
			jFrame.add(bringButton_Config());
			jFrame.add(bringTextfield_NewGesture());
			jFrame.add(bringButton_AddNewGesture());
			jFrame.add(bringPanel_Main());
		}
	}

	private JComponent bringPanel_Main() {
		if (panel == null) {
			JPanel mainPanel = new JPanel();
			mainPanel.setBounds(40, 100, 500, 400);
			mainPanel.setBackground(Color.CYAN);
			mainPanel.setLayout(new FlowLayout());
			mainPanel.add(bringRecognitionWindow());

			return mainPanel;
		}
		return panel;
	}

	private JPanel bringRecognitionWindow() {
		if (recognitionWindow == null) {
			RecognitionWindow recognitionWindow = new RecognitionWindow();
			return recognitionWindow.createStandardInstance();
		}
		return recognitionWindow;
	}

	private JComponent bringButton_Config() {
		JButton configButton = new JButton("Configuration");
		configButton.setBounds(400, 20, 200, 50);
		return configButton;
	}

	private JTextField bringTextfield_NewGesture() {
		newGestureTXTFLD = new JTextField();
		newGestureTXTFLD.setBounds(550, 100, 170, 25);
		newGestureTXTFLD.setColumns(10);
		return newGestureTXTFLD;
	}

	private JComponent bringButton_AddNewGesture() {
		if (button_AddNewGesture == null) {
			JButton button_AddNewGesture = new JButton("Add gesture to Library");
			button_AddNewGesture.setFont(Constants.ButtonText_1);
			button_AddNewGesture.setBounds(550, 150, 170, 25);
			return button_AddNewGesture;
		}
		return button_AddNewGesture;
	}

	private JComponent bringBanner() {
		if (banner == null) {
			JLabel titleInFormOfLabel = new JLabel("Recognition");
			titleInFormOfLabel.setBounds(20, 20, 206, 27);
			titleInFormOfLabel.setFont(Constants.Heading_1);
			return titleInFormOfLabel;
		}
		return banner;
	}

//	private JTabbedPane bringTab() {
//		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
//		return tabbedPane;
//	}

//	ActionListener capture_alBtns = new ActionListener() {
//
//		public void actionPerformed(ActionEvent e) {
//			if (e.getSource() == button_AddNewGesture) {
//				String newGesture = newGestureTXTFLD.getText();
//				// TODO add to library
//				
//				// clear textfield
//				newGestureTXTFLD.setText("");
//			}
//		}
//	};
}
