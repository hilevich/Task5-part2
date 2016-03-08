package year;

public class Season {
	

	public enum Seasons {
		
		WINTER, 
		SPRING, 
		SUMMER, 
		AUTHEM;
	}
	
	public enum Month {
		
		JANUARY(31, "WINTER"), 
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
		
		
		public int inDays;
		public String inSeasons;
		
		Month(int inDays, String inSeasons) {
			
			this.inDays = inDays;
			this.inSeasons = inSeasons;
			
		}
		
	}
	public int inDays;
	public Month month;
    public Seasons inSeasons;
    

    public Season(Month month, Seasons inSeasons, int inDays) {
        this.month = month;
        this.inSeasons = inSeasons;
        this.inDays = inDays; 
    	
    }

	
	
}