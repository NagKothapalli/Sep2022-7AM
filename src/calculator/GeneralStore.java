package calculator;

import org.junit.Test;

public class GeneralStore
{
	@Test
	public void customerBill()
	{
		int prod1 = 2232323;
		int prod2 = 1332244;
		//CasioCalculator calc = new CasioCalculator();
		CasioCalculator calc = new CasioCalculatorImpl();
		int bill = calc.addition(prod1, prod2);
		System.out.println("Customer Bill :" + bill);
	}

}
