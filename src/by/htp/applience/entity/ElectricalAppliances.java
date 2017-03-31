package by.htp.applience.entity;
import java.util.Scanner;


public class ElectricalAppliances {

	private String name;
	private int powerConsuption;

	public static ElectricalAppliances appliances[];
	
	public ElectricalAppliances(String name, int powerConsuption) {
		this.name = name;
		this.powerConsuption = powerConsuption;
	}

	public ElectricalAppliances(ElectricalAppliances appliances[]) {
		this.appliances=appliances;
		}
	
	public int getPowerConsuption() {
		return powerConsuption;
	}

	public void setPowerConsuption(int powerConsuption) {
		this.powerConsuption = powerConsuption;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLenth() {
		return appliances.length;
	}
	
	@Override
	public String toString() {
		return "ElectricalAppliances [name=" + getName() + ", powerConsuption="
				+ getPowerConsuption() + "]";
	}
	
}
	

