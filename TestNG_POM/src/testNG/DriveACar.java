package testNG;

import org.testng.annotations.Test;

public class DriveACar {
	  @Test(priority = 4)
	    public void startaCar() {
	        System.out.println("Car Started");
	    }
	    
	    @Test(priority = 1)
	    public void firstGear() {
	    	System.out.println("Put first Gear");
	    
	    }
	    
	    
	    @Test(priority = 2)
	    public void secondGear() {
	        System.out.println("Put Second Gear");
	    }
	    
	    @Test(priority = 3)
	    public void thirdGear() {
	        System.out.println("Put Third Gear");
	    }
	    @Test(priority = 0)
	    public void putFourthGear() {
	        System.out.println("Put fourth Gear");
	    }
	    
	 
	    
	    
	    
	    
	    
}