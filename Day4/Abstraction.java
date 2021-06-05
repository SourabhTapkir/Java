package Day4;

public class Abstraction {
	
	int fuel = 30;
	int maxFuelCapacity = 35;
			
	public static void main(String[] args) {
		Abstraction Bike = new Abstraction();
		Bike.fuelBike();
		Bike.fuelBike();
		Bike.fuelBike();
		Bike.fuelBike();
		Bike.fuelBike();
		Bike.fuelBike();
		Bike.runBike();
	}

	void fuelBike() {
		if (maxFuelCapacity > fuel) {
			fuel += 1;
			System.out.println("Fuel: " + fuel);
		} else {
			System.out.println("Fuel Capacity is reached: " + fuel);
		}
	}

	void runBike() {
		for (int i = fuel; i > 0; i--) {
			if (i > 1) {
				fuel--;
				System.out.println("Fuel: " + fuel);
			} else {
				System.out.println("Please Fuel Up Bike: ");
				break;
			}
		}
	}
}

