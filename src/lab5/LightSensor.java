package lab5;

public class LightSensor extends Sensor{
	
	public LightSensor(String location, double reading) {
		super(location, reading);
	}
	
	@Override 
	public boolean needsAttention() {
		return getReading() < 20;
	}
}
