package application;

import javafx.beans.property.SimpleStringProperty;

public class Worker{
	private SimpleStringProperty type, name;
	private int maxVisits;
	
	public Worker(String type, String name) {
		this.type = new SimpleStringProperty(type);
		this.name = new SimpleStringProperty(name);
		this.maxVisits = getMaxVisits(type);
	}
	
	public String getType() {
		return type.get();
	}
	
	public String getName() {
		return name.get();
	}

	public int getMaxVisits(String type) {
		
		if (type == "nurse") {
			maxVisits = 4;
		}
		else {
			maxVisits = 6;
		}

		return maxVisits;
	}

}
