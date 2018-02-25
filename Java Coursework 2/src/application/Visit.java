package application;

import javafx.beans.property.SimpleStringProperty;

public class Visit {
	
	private SimpleStringProperty id, name, address, city, postcode, type;
	
	Visit(String id, String name, String address, String city, String postcode, String type) {
		this.id = new SimpleStringProperty(id);
		this.name = new SimpleStringProperty(name);
		this.address =  new SimpleStringProperty(address);
		this.city = new SimpleStringProperty(city);
		this.postcode = new SimpleStringProperty(postcode);
		this.type = new SimpleStringProperty(type);
	}
	
	public String getID() {
		return id.get();
	}
	public String getName() {
		return name.get();
	}
	public String getAddress() {
		return address.get();
	}
	public String getCity() {
		return city.get();
	}
	public String getPostcode() {
		return postcode.get();
	}
	public String getType() {
		return type.get();
	}
	
	public String toString() {
		String s = id + " " + name + " " + address + " " + city + " " + postcode + " " + type;
		return s;
	}
	
	
	

}
