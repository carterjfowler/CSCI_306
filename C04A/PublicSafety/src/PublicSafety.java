
public class PublicSafety {
	//create city station
	Station cityStation;
	//create university station
	Station universityStation;
	
	public PublicSafety(String cityName, String universityName) {
		super();
		cityStation = new Station(universityName);
		universityStation = new Station(universityName);
	}
	
	/*
	 *  Using an enumerated type would be better - we'll learn that soon 
	 *  For now, the PublicSafety class should have a doHire method. 
	 *  The parameter to doHire is a boolean. 
	 *  - If true, tell the city station to hire one detective. 
	 *  - If false, tell the university station to hire one detective.
	 */
	
	//THIS IS A PLACE HOLDER!!!!!!!
	public void doHire(boolean city) {
		if (city) {
			cityStation.hireDetective();
		} else {
			universityStation.hireDetective();
		}
	}
	
	
	//add printDetectiveLists();
	
}
