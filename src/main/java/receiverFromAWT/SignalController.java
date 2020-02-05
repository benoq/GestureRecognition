package receiverFromAWT;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class SignalController {
	
	private SignalSequence memberSequence;

	public SignalSequence getMemberSequence() {
		return memberSequence;
	}

	public void setMemberSequence(SignalSequence memberSequence) {
		this.memberSequence = memberSequence;
	}

	public void mousePressed(MouseEvent e) {
		
		Signal startSignal = new Signal (System.currentTimeMillis(),  e.getPoint());
		SignalSequence sequenceInitialisation = new SignalSequence();
		setMemberSequence(sequenceInitialisation);
		
        // in the beta: log on the console  		
		System.out.println("Sequence created: "+ sequenceInitialisation.toString());		
		System.out.println("Pressed on x: "+e.getX() + ", y:"+e.getY());	
	}
	
	public void mouseDragged(MouseEvent e) {
		SignalSequence sequenceThatCouldBeGesture = getMemberSequence(); 
		Point currentPoint = new Point(e.getPoint());
		
		//core: the path of the mouse/signal
		sequenceThatCouldBeGesture.addSignal(System.currentTimeMillis(), currentPoint);
		
		//visualize the dragging
		

        // in the beta: log on the console  
		System.out.println("Dragging x: "+e.getX() + ", y:"+e.getY());
//		System.out.println("   Point saved in sequence: "+sequenceThatCouldBeGesture);	
	}
	
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released on x: "+e.getX() + ", y:"+e.getY());
		SignalSequence completedSequence = getMemberSequence();
		
		//TODO process signal further
		
	}

	public void mouseMoved(MouseEvent arg0) {
		//currently not needed 
	}

	public void mouseClicked(MouseEvent arg0) {
		//currently not needed 
		
	}

	public void mouseEntered(MouseEvent arg0) {
		//currently not needed 
		
	}

	public void mouseExited(MouseEvent arg0) {
		//currently not needed 		
	}





}
