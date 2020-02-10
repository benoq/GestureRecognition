package SignalProcessing;

import java.awt.Point;
import java.util.Vector;

public class SignalSequence {
	
	private Vector<Double> timeline = new  Vector<Double>();
	private Vector<Point> way = new Vector<Point>(); // if there is performance needed -> think about using ArrayList instead of vector even tho thread safety is lost
	
	public void addSignal(double time, Point point) {
		timeline.add(time);
		way.add(point);
	}
	
	

}
