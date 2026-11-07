package lab5;

public class TemperatureSensor extends Sensor {
	
	public TemperatureSensor(String location, double reading) {
		super(location, reading);
	}
	
	@Override 
	public boolean needsAttention() {
		return getReading() < 5 || getReading() > 35;
	}
	
	@Override
	public String summary() {
		return super.summary() + " degrees C";
	}
}
