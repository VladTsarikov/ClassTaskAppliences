package by.htp.applience.launcher;

import by.htp.applience.entity.ElectricalAppliances;
import by.htp.applience.logic.Operations;

public class Main {

	public static void main(String[] args){
		ElectricalAppliances appliances[] = new ElectricalAppliances[4];
		appliances[0] = new ElectricalAppliances("Kettle",1500);
		appliances[1] = new ElectricalAppliances("MicrowaveOven",1200);
		appliances[2] = new ElectricalAppliances("Refrigerator",800);
		appliances[3] = new ElectricalAppliances("CoffeeMaker",1000);
		
		Operations apl = new Operations(appliances);
		apl.counUpPowerConsuption();
		apl.addAppliences(new ElectricalAppliances("ElectricStove",2500));
		apl.counUpPowerConsuption();
		apl.showAppliences();
		apl.appliencesSort();
		apl.findAppliences();
		
		
}
}
