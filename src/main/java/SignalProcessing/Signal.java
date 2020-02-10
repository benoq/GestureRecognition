package SignalProcessing;

import java.awt.Point;

// adjust this class when the interpretation of the signals needs more/different input
public class Signal {

	double currentTime;
	Point point;
	
	public Signal(double currentTime, Point point) {
		super();
		this.currentTime = currentTime;
		this.point = point;
	}
	
	public Signal() {
		super();
	}

	public double getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(double currentTime) {
		this.currentTime = currentTime;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
}
