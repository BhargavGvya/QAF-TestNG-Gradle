package com.qaf.testng.example;

import org.testng.annotations.Test;
import org.hamcrest.Matchers;
import org.testng.Reporter;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Validator;

public class MultiplyTest {

	@QAFTestStep(description = "if numbers are positive")
	public void checkNumbers()
	{
		Reporter.log("This is a dummy test");
	}
	
	@QAFTestStep(description = "multiply numbers")
	public void multiply()
	{
		System.out.println("This is from multiply test edited directly at github repo");
		Validator.assertThat(7, Matchers.greaterThan(9));
	}
	
	@Test
	public void dummyTest()
	{
		System.out.println("This test annotated with TestNG class");
		Reporter.log("Successfully invoked dummy test");
	}
}
