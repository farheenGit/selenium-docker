package com.newtours.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tests.BaseTest;

public class FarheenTest extends BaseTest {
	private String noOfPassengers;
    private String expectedPrice;
	
	@BeforeTest
    @Parameters({"noOfPassengers", "expectedPrice"})
    public void setupParameters(String noOfPassengers, String expectedPrice){
        this.noOfPassengers = noOfPassengers;
        this.expectedPrice = expectedPrice;
    }

    @Test
    public void registrationPage() throws InterruptedException {
    	this.driver.get("https://demo.guru99.com/selenium/newtours");
    	Thread.sleep(4000);
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(noOfPassengers);
        System.out.println(expectedPrice);
        
    }

}
