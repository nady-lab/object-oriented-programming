/*
 * Nadyla da Cunha Barbosa
 * OOP - CMPU2016
 * lab 4_appliance
 * */
package lab4_appliance;

public class Dryer extends Appliance {
	
	// attributes
	private boolean sensorDry;
	
	// methods
	public void startDry() {
		System.out.println("Dryer is running.");
	}
	
	public void stopDry() {
		System.out.println("Dryer cycle finished.");
	}

	// getters and setters 
	public boolean getSensorDry() {
		return sensorDry;
	}
	
	public void setSensorDry(boolean sensorDry) {
		this.sensorDry = sensorDry;
	}
	
	// constructor
	public Dryer(String brand, String model, double capacityKg, boolean sensorDry) {
		super(brand, model, capacityKg); 
		setSensorDry(sensorDry);
	}
		
	// toString using all four getters
	@Override
	public String toString() {
		return super.toString() + ", sensorDry=" + getSensorDry()
				+ "]";
	}
}
