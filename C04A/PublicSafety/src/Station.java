
public class Station {
	
	
	public Station(String stationName) {
		super();
		this.stationName = stationName;
	}
	//station name
	private String stationName;
	//max number of detectives
	private final static int maxDetective = 5;
	//last badge number
	public static int lastBadgeNum = 1;
	//array of detectives
	private Detective [] detectiveList = new Detective [maxDetective];
	
	//print detectives????
	
	//hire function
	private int i = 0;
	public void hireDetective() {
		if (i >= maxDetective) {
			System.out.println("Can't Hire any more detectives for " + stationName);
		} else {
			//FIX!!!!!
			detectiveList[i].setName(name);
			detectiveList[i].setBadgeNum(lastBadgeNum);
			lastBadgeNum++;
			i++;
			
		}

	}
}
