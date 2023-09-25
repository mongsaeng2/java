package ExpressionsStatementsAndMore;

// 2023. 09. 25. # 3-10

public class codingExercises {
	
	/* Barking Dog
	 * We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
	 * Write a method shouldWakeUp that has 2 parameters.
	 * 1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
	 * 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
	 * We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
	 * In all other cases return false.
	 * If the hourOfDay parameter is less than 0 or greater than 23 return false.
	 * */
	
	/* Leap Year Calculator
	 * 
		Write a method isLeapYear with a parameter of type int named year.
		
		The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
		
		If the parameter is not in that range return false.
		
		Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.
		
		To determine whether a year is a leap year, follow these steps: 
		1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
		2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
		3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
		4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
		5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
	*/

	public static void main(String[] args) {
        int year = 2016;
        boolean leapYearResult = isLeapYear(year);
        System.out.println(leapYearResult);
    }
		
		
	    public static boolean isLeapYear(int year){
	        
	        if(year < 1 || year > 9999){
	            return false;            
	        }else{
	            if(year % 4 ==0){
	                if(year % 100 == 0){
	                    if(year % 400 == 0){
	                        return true;
	                    } else{
	                        return false;
	                    }
	                } else{
	                    return false;
	                }
	            }else{
	                return false;
	            }
	        
	        }
	        
	    }

	    	    
	}
	
