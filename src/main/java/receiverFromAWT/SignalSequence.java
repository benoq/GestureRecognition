package receiverFromAWT;

import java.awt.Point;
import java.util.Vector;

public class SignalSequence {
	
	private Vector<Double> timeline;
	private Vector<Point> way; // if there is performance needed -> think about using ArrayList instead of vector even tho thread safety is lost
	
	public void addSignal(double time, Point point) {
		timeline.add(time);
		way.add(point);
	}
	
	

}
