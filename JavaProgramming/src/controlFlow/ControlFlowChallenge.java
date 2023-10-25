package controlFlow;

public class ControlFlowChallenge {

	public static void main(String[] args) {
		
	printYearsAndDays(1440);
	}
	
	public static void printYearsAndDays(long minutes){
        
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
        	int YY = (int) minutes / (365*24*60);
        	int ZZ = (int) minutes / 60 / 24 % 365;
        	
        	System.out.printf("%d min = %d y and %d d", minutes, YY, ZZ);
            
            /*
            1h = 60min
            1day = 24h = 24*60min
            1year = 365days = 365*24*60min
            */
            
        }
    }

}
