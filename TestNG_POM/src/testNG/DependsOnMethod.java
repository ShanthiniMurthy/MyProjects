package testNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	 //High School
    //Higher Sec School leaving
    //Engineering College admission
    @Test(priority = 0 )
    public void highSchool() {
        System.out.println("High school completed");
    }
    
    
    @Test(priority=1,dependsOnMethods = "highSchool")
    public void higherSecSchool() {
        System.out.println("Higher sec school completed");
    }
    
    
    @Test(priority = 2)
    public void enggAdmission() {
        System.out.println("Engineering college admission");
    }

}

