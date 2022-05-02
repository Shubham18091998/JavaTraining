package com.cts.application;
import com.cts.domain.Vehicle;
import com.cts.domain.Auto;
import com.cts.domain.Car;
public class VehiceApplication {
	public static void print(Vehicle vehicle) {
		System.out.println("------------------------");
		vehicle.start();
		vehicle.stop();
		vehicle.display();
		System.out.println("------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Car(101,"Tata",500000,true);
		((Car) vehicle).setAirBag(false);
		print(vehicle);
		vehicle=new Auto(102, "Bajaj", 25000, "CNG");
		print(vehicle);
		if (vehicle instanceof Auto)
			System.out.println("It is referring to Auto object");
		else
			System.out.println("It is referring to Car object");
	}

}
