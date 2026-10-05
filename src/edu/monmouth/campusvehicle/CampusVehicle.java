package edu.monmouth.campusvehicle;

public class CampusVehicle {
	
	private String id;
	private String location;
	private boolean available;
	private final String DEFAULT_ID="UNKNOWN", DEFAULT_LOCATION="UNKNOWN";
	private final boolean DEFAULT_AVAILABLE=true;
	
	public CampusVehicle() {
		setId(DEFAULT_ID);
		setLocation(DEFAULT_LOCATION);
		setAvailable(DEFAULT_AVAILABLE);
	}
	public CampusVehicle(String id, String location, boolean available) {
		setId(id);
		setLocation(location);
		setAvailable(available);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void checkOut() {
		available = false;
	}
	public void returnVehicle() {
		available = true;
	}

}
