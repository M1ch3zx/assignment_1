package edu.monmouth.problemSet1;

import edu.monmouth.campusvehicle.CampusVehicle;

public class ProblemSet1 {

	public static void main(String[] args) {

		// 4a
		CampusVehicle vehicle1 = new CampusVehicle("V001", "Library", true); // id , location and available

		// 4b
		System.out.println("Vehicle1");
		System.out.println("ID:" + vehicle1.getId());
		System.out.println("Location:" + vehicle1.getLocation());
		System.out.println("Available:" + vehicle1.isAvailable());

		// 4c

		CampusVehicle vehicle2 = new CampusVehicle();
		CampusVehicle vehicle3 = new CampusVehicle();

		// 4d

		System.out.println("Vehicle2");
		System.out.println("ID:" + vehicle2.getId());
		System.out.println("Location: " + vehicle2.getLocation());
		System.out.println("Available: " + vehicle2.isAvailable());

		System.out.println("Vehicle3");
		System.out.println("ID:" + vehicle3.getId());
		System.out.println("Location: " + vehicle3.getLocation());
		System.out.println("Available: " + vehicle3.isAvailable());
		// 4e

		vehicle2.setId("V002");
		vehicle2.setLocation("Spruce Hall");
		vehicle2.setAvailable(false);

		vehicle3.setId("V003");
		vehicle3.setLocation("Parking Lot");
		vehicle3.setAvailable(true);

		// 4f

		System.out.println("Vehicle2");
		System.out.println("ID:" + vehicle2.getId());
		System.out.println("Location: " + vehicle2.getLocation());
		System.out.println("Available: " + vehicle2.isAvailable());

		System.out.println();

		System.out.println("Vehicle3");
		System.out.println("ID:" + vehicle3.getId());
		System.out.println("Location: " + vehicle3.getLocation());
	}

}
