package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Cucumber_Hooks {
	
	@Before("@TC001")
	public void b()
	{
		System.out.println("Before hook");
	}
	@After(order =1)
	public void a()
	{
		System.out.println("after hook");
	}
	
	@Before(order =2)
	public void b1()
	{
		System.out.println("Before second priority hook");
	}
	@After(order =2)
	public void a1()
	{
		System.out.println("after second priority hook");
	}

}
