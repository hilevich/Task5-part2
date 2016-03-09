package Homework;

public class MethodsForComparison {
	/** The method below shows all the months with the specified number of days.
	 * @author SiaKovalina
	 * @param specifiedNumber
	 */
	public void withSpecifiedNumberOfDays(int specifiedNumber){
			for (Month m : Months.values()){
				if (m.inDays == specifiedNumber){
					System.out.println(m.toString());
				}
			}	
		}
	/**The method below shows all the months with number of days greater than the specified value.
	 *@author SiaKovalina
	 * @param specifiedNumber
	 */
		public void withGreaterNumberOfDays(int specifiedNumber){
			for (Month m : Months.values()){
				if (m.inDays > specifiedNumber){
					System.out.println(m.toString());
				}
			}	
		}
	/**The method below shows all the months with number of days smaller than specified number.
	 * @author SiaKovalina	
	 * @param specifiedNumber
	 */	
		public void withSmallerNumberOfDays(int specifiedNumber){
			for (Month m : Months.values()){
				if (m.inDays < specifiedNumber){
					System.out.println(m.toString());
				}
			}	
		}
}
