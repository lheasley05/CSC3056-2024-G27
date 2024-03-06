package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RangeTest {

	private Range rangeObjectUnderTest;

	@Before
	public void setUp() throws Exception {
		//rangeObjectUnderTest = new Range(-1, 1);
		rangeObjectUnderTest = new Range(2, 4);
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	// getLowerBound() method test cases
	@Test
	public void testGetLowerBoundWithPostiveValues() {
		rangeObjectUnderTest = new Range(4, 6);
		assertEquals("The lower bound should be 4 ", 
				4, rangeObjectUnderTest.getLowerBound(), 0d); 
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetLowerBoundWithLowerBoundGreaterThanUpperBound() {
		rangeObjectUnderTest = new Range(12, 6);
		rangeObjectUnderTest.getLowerBound();
	}
	
	
	/*
	@Test(expected=InvalidParameterException.class)
	public void testGetLowerBoundWithNullValue() {
		rangeObjectUnderTest = new Range(null, 2);
		assertEquals(0.0, rangeObjectUnderTest.getLowerBound(), 0.0001);
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testGetLowerBoundWithStringValues() {
		rangeObjectUnderTest = new Range('m', 2);
		rangeObjectUnderTest.getLowerBound();
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testGetLowerBoundWithDoubleStringValues() {
		rangeObjectUnderTest = new Range("Hello", 2);
		rangeObjectUnderTest.getLowerBound();
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testGetLowerBoundWithSingleValue() {
		rangeObjectUnderTest = new Range(67);
		rangeObjectUnderTest.getLowerBound();
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testGetLowerBoundWithBooleanValue() {
		rangeObjectUnderTest = new Range(true);
		rangeObjectUnderTest.getLowerBound();
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testGetLowerBoundWithZeroValue() {
		rangeObjectUnderTest = new Range(0);
		rangeObjectUnderTest.getLowerBound();
	}
	*/
	

	// getUpperBound() method Test Cases
	@Test
	public void testGetUpperBoundPostiveValues() {
		rangeObjectUnderTest = new Range(10, 20);
		assertEquals("The upper bound should be 20 ", 
				20, rangeObjectUnderTest.getUpperBound(), 0d); 
	}
	
	@Test
	public void testGetUpperBoundNegativeValues() {
		rangeObjectUnderTest = new Range(-20, -10);
		assertEquals("The upper bound should be -10 ", 
				-10, rangeObjectUnderTest.getUpperBound(), 0d); 
	}
	
	/*
	@Test(expected=InvalidParameterException.class)
	public void testGetUpperBoundNullValues() {
		rangeObjectUnderTest = new Range(null, null);
		rangeObjectUnderTest.getUpperBound();
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testGetUpperBoundWithOneNegativeValue() {
		rangeObjectUnderTest = new Range(-1);
		rangeObjectUnderTest.getUpperBound();
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testGetUpperBoundWithZeroValue() {
		rangeObjectUnderTest = new Range(0);
		rangeObjectUnderTest.getUpperBound();
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testGetUpperBoundWithDoubleQuote() {
		rangeObjectUnderTest = new Range("Hello");
		rangeObjectUnderTest.getUpperBound();
	}
	
	@Test(expected=InvalidParameterException.class)
	public void testGetUpperBoundWithSingleQuote() {
		rangeObjectUnderTest = new Range('d');
		rangeObjectUnderTest.getUpperBound();
	}
	*/
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetUpperBoundWithLowerBoundGreaterThanUpperBound() {
		rangeObjectUnderTest = new Range(20, 10);
		rangeObjectUnderTest.getUpperBound();
	}
	
	/*
	@Test(expected=InvalidParameterException.class)
	public void testGetUpperBoundWithBooleanValue() {
		rangeObjectUnderTest = new Range(true);
		rangeObjectUnderTest.getUpperBound();
	}
	*/
	
	
	// getLength() method test cases
	@Test
	public void testGetLengthPositiveValues() {
		rangeObjectUnderTest = new Range(5, 15);
		assertEquals("The upper bound should be 10 ", 
				10, rangeObjectUnderTest.getLength(), 0d); 
	}
	
	@Test
	public void testGetLengthPostiveAndNegativeValues() {
		rangeObjectUnderTest = new Range(-5, 10);
		assertEquals("The upper bound should be 15 ", 
				15, rangeObjectUnderTest.getLength(), 0d); 
	}
	
	@Test
	public void testGetLengthNegativeValues() {
		rangeObjectUnderTest = new Range(-10, -5);
		assertEquals("The upper bound should be 5 ", 
				5, rangeObjectUnderTest.getLength(), 0d); 
	}
	
	/*
	@Test(expected=IllegalArgumentException.class)
	public void testGetLengthInvalidRangeWithNullValues() {
		rangeObjectUnderTest = new Range(null, null);
		rangeObjectUnderTest.getLength();
	}
	*/
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetLengthInvalidRangeWithPositiveValues() {
		rangeObjectUnderTest = new Range(10, 5);
		rangeObjectUnderTest.getLength();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetLengthInvalidRangeWithNegativeValues() {
		rangeObjectUnderTest = new Range(10, -5);
		rangeObjectUnderTest.getLength();
	}
	
	/*
	@Test(expected=IllegalArgumentException.class)
	public void testGetLengthInvalidRangeDoubleQuoteValues() {
		rangeObjectUnderTest = new Range("Hello");
		rangeObjectUnderTest.getLength();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetLengthInvalidRangeWithSingleQuoteValues() {
		rangeObjectUnderTest = new Range('p');
		rangeObjectUnderTest.getLength();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetLengthInvalidRangeWithBooleanValues() {
		rangeObjectUnderTest = new Range(false));
		rangeObjectUnderTest.getLength();
	}
	*/
	
	
	// getCentralValue() method test cases 
	@Test
	public void testGetCentralValueWithPostiveAndNegative() {
		rangeObjectUnderTest = new Range(-7, 1);
		assertEquals("The central value should be -3 ", 
				-3, rangeObjectUnderTest.getCentralValue(), 0d); 
	}
	
	@Test
	public void testGetCentralValueWithNegativeValues() {
		rangeObjectUnderTest = new Range(-2, 9);
		assertEquals("The central value should be 3.5 ", 
				3.5, rangeObjectUnderTest.getCentralValue(), 0d); 
	}
	
	@Test
	public void testGetCentralValueWithPostiveValues() {
		rangeObjectUnderTest = new Range(5, 11);
		assertEquals("The central value should be 8 ", 
				8, rangeObjectUnderTest.getCentralValue(), 0d); 
	}
	
	/*
	@Test(expected=IllegalArgumentException.class)
	public void testGetCentralValueWithZeroValue() {
		rangeObjectUnderTest = new Range(0);
		rangeObjectUnderTest.getLength();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetCentralValueWithNullValue() {
		rangeObjectUnderTest = new Range(null, null);
		rangeObjectUnderTest.getLength();
	}
	*/
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetCentralValueWithLowerBoundGreaterThanUpper() {
		rangeObjectUnderTest = new Range(10, 5);
		rangeObjectUnderTest.getLength();
	}
	
	/*
	@Test(expected=IllegalArgumentException.class)
	public void testGetCentralValueWithDoubleQuoteValue() {
		rangeObjectUnderTest = new Range("Hello");
		rangeObjectUnderTest.getLength();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetCentralValueWithSingleQuoteValue() {
		rangeObjectUnderTest = new Range('n');
		rangeObjectUnderTest.getLength();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetCentralValueWithBooleanValue() {
		rangeObjectUnderTest = new Range(false);
		rangeObjectUnderTest.getLength();
	}
	*/
	
	
	// contains(double value) method test cases
	@Test
	public void testContainsNormalValueIsTrue() {
		rangeObjectUnderTest = new Range(-1, 5);		
		assertTrue("The central value should be True ", 
				rangeObjectUnderTest.contains(2.45)); 
	}
	
	@Test
	public void testContainsNegativeBoundaryValueIsTrue() {
		rangeObjectUnderTest = new Range(-1, 5);		
		assertTrue("The central value should be True ", 
				rangeObjectUnderTest.contains(-1)); 
	}
	
	@Test
	public void testContainsPositiveBoundaryValueIsTrue() {
		rangeObjectUnderTest = new Range(-1, 5);		
		assertTrue("The central value should be True ", 
				rangeObjectUnderTest.contains(5)); 
	}
	
	@Test
	public void testContainsPositiveValueIsFalse() {
		rangeObjectUnderTest = new Range(-1, 5);		
		assertFalse("The central value should be False ", 
				rangeObjectUnderTest.contains(10)); 
	}
	
	@Test
	public void testContainsNegativeValueIsFalse() {
		rangeObjectUnderTest = new Range(-1, 5);		
		assertFalse("The central value should be False ", 
				rangeObjectUnderTest.contains(-20)); 
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testContainsWithLowerBoundsGreaterThanUpperBound() {
		rangeObjectUnderTest = new Range(5, -1);		
		rangeObjectUnderTest.contains(2.45);
	}	

	/*
	@Test(expected=IllegalArgumentException.class)
	public void testContainsWithSingleRangeValue() {
		rangeObjectUnderTest = new Range(5);		
		rangeObjectUnderTest.contains(5);
	}
	 
	@Test(expected=IllegalArgumentException.class)
	public void testContainsWithContainsADoubleQuoteValue() {
		rangeObjectUnderTest = new Range(5, -1);		
		rangeObjectUnderTest.contains("Hello");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testContainsWithContainsASingleQuoteValu() {
		rangeObjectUnderTest = new Range(5, -1);		
		rangeObjectUnderTest.contains('m');
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testContainsWithContainsABooleanValue() {
		rangeObjectUnderTest = new Range(5, -1);		
		rangeObjectUnderTest.contains(True);
	}
	*/
	

}
