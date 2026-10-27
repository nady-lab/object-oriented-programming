/*
 * Nadyla da Cunha Barbosa
 * OOP - CMPU2016
 * lab 4
 * */
package lab4;

public class Dryer {

	// attributes
	private String brand;
	private String model;
	private double capacityKg;
	private boolean sensorDry;
	
	// methods
	public void startDry() {
		System.out.println("Dryer is running.");
	}
	
	public void stopDry() {
		System.out.println("Dryer cycle finished.");
	}

	// getters and setters 
	public String getBrand() {
		return brand;
	}
	
		// special requirements needed to retrieve brand
	public void setBrand(String brand) {
		if(brand == null || brand.isEmpty()) {
			System.out.println("ERROR - Brand can't be null");
		} else {
			this.brand = brand;
		}
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getCapacityKg() {
		return capacityKg;
	}
	
	public void setCapacityKg(double capacityKg) {
		this.capacityKg = capacityKg;
	}
	
	public boolean getSensorDry() {
		return sensorDry;
	}
	
	public void setSensorDry(boolean sensorDry) {
		this.sensorDry = sensorDry;
	}
	
	public Dryer(String brand, String model, double capacityKg, boolean sensorDry) {
		this.brand = brand;
		this.model = model;
		this.capacityKg = capacityKg;
		this.sensorDry = sensorDry;
	}
		
	// toString using all four getters
	@Override
	public String toString() {
		return "Dryer [brand=" + getBrand() + ", model=" + getModel() + ", capacityKg=" + getCapacityKg() + ", sensorDry=" + getSensorDry()
				+ "]";
	}
	
}
