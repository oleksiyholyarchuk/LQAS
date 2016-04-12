package junits;

import static org.junit.Assert.*;

import org.junit.Test;

import application.MathProvider;

public class JunitMathProvider_2 {

MathProvider provider;
	
	public JunitMathProvider_2() {
		provider = new MathProvider();
	}
	
	@Test
	public void multiply() {
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
		assertEquals(firstNumber * secondNumber, provider.Multiply(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void devide() {
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 20;
		int secondNumber = 10;
		assertEquals(firstNumber / secondNumber, provider.Devide(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
