/* List of Seasons, Monthes and amount of days in monthes
 * @author Oleksandr Semochko
 * @param Season.Seasons.WINTER  - name of the season
 * @param Season.Seasons.Month.FEBRUARY  - name of the month
 * @param Season.Seasons.Month.FEBRUARY.inDays  - amount of days in month
 */

package year;

import year.Season.Seasons.Month;

public class Season {
	

	public enum Seasons {
		
		WINTER, 
		SPRING, 
		SUMMER, 
		AUTUMN;
	
	
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

		public int inDays;
		
		public String inSeasons;
		
		Month(int inDays, String inSeasons) {
			
			this.inDays = inDays;
			this.inSeasons = inSeasons;
			
		}
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

