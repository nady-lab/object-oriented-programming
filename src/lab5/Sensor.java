/**
 * Class to collect location + readings from different sensors
 * 
 * @author nadyla
 */
package lab5;

abstract class Sensor {
	
	private String location;
	private double reading;
	private static int sensorCount = 0;
	
	/**
	 * Constructor that passes down location, reading and increments the sensor count
	 * 
	 * @param location
	 * @param reading
	 */
	public Sensor(String location, double reading) {
		this.location = location;
		this.reading = reading;
		sensorCount++;
	}

	public String getLocation() {
		return location;
	}

	public double getReading() {
		return reading;
	}

	public static int getSensorCount() {
		return sensorCount;
	}

	public String summary() {
		return "Location: " + getLocation() + " - Reading: " + getReading();
	}
	
	/**
	 * checks if sensor needs attention
	 * 
	 * @return boolean
	 */
	public abstract boolean needsAttention();
	
	// part 3
	public void updateReading(double newReading) {
		this.reading = newReading;
	}
	
}
