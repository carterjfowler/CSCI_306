
public class Detective {
	private String name;
	private int badgeNum;
	
	public Detective() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBadgeNum() {
		return badgeNum;
	}
	public void setBadgeNum(int badgeNum) {
		this.badgeNum = badgeNum;
	}
	
	@Override
	public String toString() {
		return "Detective [Badge=" + badgeNum + ", Name=" + name +"]";
	}
	
}


//tentatively done