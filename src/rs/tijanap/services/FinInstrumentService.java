package rs.tijanap.services;

import rs.tijanap.model.FinInstrument;

public class FinInstrumentService {
	
	public FinInstrument findFi(String fiID){
		FinInstrument fi = new FinInstrument(fiID, "cfi", 2);		
		return fi;
		
	}

}
