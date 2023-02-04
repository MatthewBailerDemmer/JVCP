package chapter10;

public class Car implements CarbonFootPrint {
	private double litersPerKilometer;
	private double kilometers;
	
	public Car(int l, int k) {
		this.setLitersPerKilometer(l);
		this.setKilometers(k);
	}

	public double getLitersPerKilometer() {
		return litersPerKilometer;
	}

	public void setLitersPerKilometer(double litersPerKilometer) {
		this.litersPerKilometer = litersPerKilometer;
	}

	public double getKilometers() {
		return kilometers;
	}

	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}

	@Override
	public double getCarbonFootPrint() {
		return getLitersPerKilometer() * getKilometers();
	}
	
	@Override
	public String toString() {
		return String.format("Car with %.2f l/k roading %.2f kilometers",
				this.getLitersPerKilometer(), this.getKilometers());
	}
}
