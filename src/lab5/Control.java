package lab5;

public class Control {

	public static void main(String[] args) {
		
		Sensor ts = new TemperatureSensor("Glasshouse A", 34); 
		Sensor ms = new MoistureSensor("Bed 2", 42);
		
		Sensor[] sensors = {ts, ms}; 

		System.out.println("Initial readings:");
		for (Sensor sensor : sensors) {
			System.out.println(sensor.summary() + "\nNeeds Attention: " + sensor.needsAttention());
		}
		
		// part 3
		ms.updateReading(28);
		
		System.out.println("\nAfter updating moisture:");
		for (Sensor sensor : sensors) {
			System.out.println(sensor.summary() + "\nNeeds Attention: " + sensor.needsAttention());
		}
		
		Sensor ls = new LightSensor("North Window", 12);
		
		Sensor[] setOfSensors = {ts, ms, ls};
		
		System.out.println("\nAll three sensors:");
		for (Sensor setOfSensor : setOfSensors) {
			System.out.println(setOfSensor.summary() + "\nNeeds Attention: " + setOfSensor.needsAttention());
		}
		
		System.out.println("\nSensor count: " + Sensor.getSensorCount());
		
		// part 4 - experiment A
		// Sensor test = new Sensor("A", 20); <- compiler error as you can't instantiate an abstract class
		
	}

}
