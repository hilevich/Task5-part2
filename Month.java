package year;

public enum Month {
	JANUARY(31,"WINTER"), 
	FEBRUARY(28,"SPRING"), 
	MARCH(31,"SPRING"), 
	APRIL(30,"SPRING"), 
	MAY(31,"SUMMER"), 
	JUNE(30,"SUMMER"), 
	JULY(31,"SUMMER"), 
	AUGUST(31,"AUTUMN"), 
	SEPTEMBER(30,"AUTUMN"), 
	OCTOBER(31,"AUTUMN"), 
	NOVEMBER(30,"WINTER"), 
	DECEMBER(31,"WINTER");
	
	
	int inDays;
	String inSeasons;
	public int getInDays() {
		return inDays;
	}

	public void setInDays(int inDays) {
		this.inDays = inDays;
	}

	public String getInSeasons() {
		return inSeasons;
	}

	public void setInSeasons(String inSeasons) {
		this.inSeasons = inSeasons;
	}
	
	private Month(int inDays,	String inSeasons) {
		
		this.inDays = inDays;
		this.inSeasons = inSeasons;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
