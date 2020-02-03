package config.gui.swing;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class SwingGui {
	
	private JFrame mainStage = new JFrame();
	private JPanel panel;
	private JComponent banner; 
	private JPanel recognitionPanel;
	private GestureWindow gestureWindow;

	public void createStage() {
		
	if(mainStage == null) {
		JFrame jFrame = new JFrame();
		jFrame.setSize(600, 600);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setTitle("GestureRecognitionApp");		
		jFrame.setVisible(true);			
		
		// add components to frame
		jFrame.add(bringBanner());
		jFrame.add(bringPanel());
	}
	}
	
   private JComponent bringBanner() {
	   if (banner == null) {
			JLabel titleInFormOfLabel = new JLabel("Hand", JLabel.LEADING);
			return titleInFormOfLabel;
	   }
	   return banner;
   }
   
   private JComponent bringPanel() {
	   if (panel == null) {
			JPanel panel = new JPanel();
			panel.add(bringTab());
			return panel;
	   }
	   return panel;
   }
   
   private JTabbedPane bringTab() {
	   JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	   return tabbedPane;
   }
   
   private JPanel bringRecognitionPanel() {
	   if (recognitionPanel == null) {
		JPanel recognitionPanel = new JPanel();  
		return recognitionPanel;  
		
	}
	   return recognitionPanel;
   }
   
   
 

}
