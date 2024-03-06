package org.jfree.data.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.ArrayComparisonFailure;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.Values2D; 


	public class DataUtilitiesTest  { 
	 private Values2D values2D; 
	 
	 @Before 
	 public void setUp() { 
		 DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		 values2D = testValues; 
		 testValues.addValue(1, 0, 0); 
		 testValues.addValue(4, 1, 0); 
	}
	 
	 
	 @After 
	 public void tearDown() { 
		 values2D = null; 
	 } 
	  
	 
	 @Test 
	 public void testValidDataAndColumnColumnTotal() { 
		 assertEquals("Wrong sum returned. It should be 5.0",  
				 5.0, DataUtilities.calculateColumnTotal(values2D, 0), 0.0000001d); 
	 } 
	 
	 @Test
	 public void testNullDataColumnTotal() { 
	  try { 
	   DataUtilities.calculateColumnTotal(null, 0); 
	   fail("No exception thrown. The expected outcome was: a thrown exception of type: IllegalArgumentException"); 
	  } 
	  catch (Exception e) { 
	   assertTrue("Incorrect exception type thrown",  
	    e.getClass().equals(IllegalArgumentException.class)); 
	  } 
	 }
	 
	 
	 // calculateColumnTotal(Values2D data, int column) method test cases
	 @Test
	 public void testCalculateColumnTotalWithValueOne() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  assertEquals("The column total should equal 5.6 ",
				  5.6, DataUtilities.calculateColumnTotal(values2D, 1), 0d);
	 }
	 
	 @Test
	 public void testCalculateColumnTotalWithValueZero() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  assertEquals("The column total should equal -3 ",
				  -3, DataUtilities.calculateColumnTotal(values2D, 0), 0d);
	}
	 
	@Test(expected=IndexOutOfBoundsException.class)
	 public void testCalculateColumnTotalWithValueNegativeOne() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  DataUtilities.calculateColumnTotal(values2D, -1);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	 public void testCalculateColumnTotalWithValueTwo() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  assertEquals("The column total should equal 15 ",
				  15, DataUtilities.calculateColumnTotal(values2D, 2), 0d);	
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	 public void testCalculateColumnTotalWithValueJustOverMaxValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  DataUtilities.calculateColumnTotal(values2D, 3);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	 public void testCalculateColumnTotalWithValueUnderMinValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  DataUtilities.calculateColumnTotal(values2D, -8);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	 public void testCalculateColumnTotalWithValueOverMaxValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  DataUtilities.calculateColumnTotal(values2D, 23);
	}
	
	@Test(expected=IllegalArgumentException.class)
	 public void testCalculateColumnTotalWithNullAndDoubleStringValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(null, "Hello", null);
		  
		  DataUtilities.calculateColumnTotal(values2D, -20);
	}
	
	@Test(expected=IllegalArgumentException.class)
	 public void testCalculateColumnTotalWithNullAndBooleanStringValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(null, false, null);
		  
		  DataUtilities.calculateColumnTotal(values2D, 22);
	}
	
	@Test(expected=IllegalArgumentException.class)
	 public void testCalculateColumnTotalWithNullAndSingleStringValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(null, 'Z', null);
		  
		  DataUtilities.calculateColumnTotal(values2D, 0);
	}
	
	 
	// calculateRowTotal(Values2D data, int row) method test cases
	@Test 
	public void testCalculateRowTotalWithValueOne() {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		values2D = testValues; 
		testValues.addValue(1, 2, 3); 
		testValues.addValue(-4, 3.6, 12); 
			  
			assertEquals("The column total should equal 11.6 ",
					11.6, DataUtilities.calculateColumnTotal(values2D, 1), 0d);	
	}
		
	@Test 
	public void testCalculateRowTotalWithValueZero() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  assertEquals("The column total should equal 6 ",
				  6, DataUtilities.calculateColumnTotal(values2D, 0), 0d);	
	}
 
 
	@Test(expected=IndexOutOfBoundsException.class)
	 public void testCalculateRowTotalWithValueJustUnderMinValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  DataUtilities.calculateColumnTotal(values2D, -1);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	 public void testCalculateRowTotalWithValueJustOverMaxValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  DataUtilities.calculateColumnTotal(values2D, 2);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	 public void testCalculateRowTotalWithValueUnderMinValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  DataUtilities.calculateColumnTotal(values2D, -8);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	 public void testCalculateRowTotalWithValueOverMaxValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(1, 2, 3); 
		  testValues.addValue(-4, 3.6, 12); 
		  
		  DataUtilities.calculateColumnTotal(values2D, 23);
	}
 
	@Test(expected=IllegalArgumentException.class)
	 public void testCalculateRowTotalWithNullAndDoubleStringValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(null, "This is a string", null);
		  
		  DataUtilities.calculateColumnTotal(values2D, -20);
	}
	
	@Test(expected=IllegalArgumentException.class)
	 public void testCalculateRowTotalWithNullAndBooleanStringValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(null, false, null);
		  
		  DataUtilities.calculateColumnTotal(values2D, -20);
	}
	
	@Test(expected=IllegalArgumentException.class)
	 public void testCalculateRowTotalWithNullAndSingleStringValue() {
		  DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
		  values2D = testValues; 
		  testValues.addValue(null, 'Z', null);
		  
		  DataUtilities.calculateColumnTotal(values2D, -20);
	}
 	
	
	// createNumberArray(double[] data) method test cases 
	@Test 
	public void testCreateNumberArrayWithValidValues() {
		double[] inputValues = {2.0, 4.2, 6.5, 4.8, 10.12};
		Number[] expectedValue = {2.0, 4.2, 6.5, 4.8, 10.12};
		
		assertArrayEquals("The expected outcome should be {2, 4.2, 6.5, 4.8, 10.12} ",
				expectedValue, DataUtilities.createNumberArray(inputValues));	
	}
	
	/*
	@Test(expected=IllegalArgumentException.class)
	public void testCreateNumberArrayWithNullValues() {
		double[] inputValues = {null};
		Number[] expectedValue = {null};
		
		assertArrayEquals("The expected outcome should be {null} ",
				expectedValue, DataUtilities.createNumberArray(inputValues));	
	}
 	*/
 
	@Test 
	public void testCreateNumberArrayWithNotDoubleValues() {
		double[] inputValues = {10, 11 ,12};
		Number[] expectedValue = {10.0, 11.0 ,12.0};
		
		assertArrayEquals("The expected outcome should be {10, 11 ,12} ",
				expectedValue, DataUtilities.createNumberArray(inputValues));	
	}

	/*
	@Test(expected=IllegalArgumentException.class)
	public void testCreateNumberArrayWithNullAndDoubleQuoteValues() {
		double[] inputValues = {"Hello"};
		Number[] expectedValue = {null};
		
		DataUtilities.createNumberArray(inputValues);	
	}
	*/
	
	@Test(expected=ArrayComparisonFailure.class)
	public void testCreateNumberArrayWithValueZero() {
		double[] inputValues = {0};
		Number[] expectedValue = {0};
		
		assertArrayEquals("The expected outcome should be {0} ",
				expectedValue, DataUtilities.createNumberArray(inputValues));	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCreateNumberArrayWithNullValues() {
		double[] inputValues = {'p', 'u', 'a'};
		//Number[] expectedValue = {null};
		
		DataUtilities.createNumberArray(inputValues);	
	}

	/*
	@Test(expected=IllegalArgumentException.class)
	public void testCreateNumberArrayWithBooleanValues() {
		double[] inputValues = {false, true, false};
		//Number[] expectedValue = {null};
		
		DataUtilities.createNumberArray(inputValues);	
	}
	*/
	
	 // createNumberArray2D(double[][] data) method test cases
	@Test
	public void testCreateNumberArray2DWithValidValues() {
		 double[][] inputValues = {
					{2.0, 4.2, 6.5},
					{5.5, 7.64, 1.0}
					};
		 Number[] expectedValues = {2.0, 4.2, 6.5, 5.5, 7.64, 1.0};
	
			assertArrayEquals("The expected outcome should be 2.0, 4.2, 6.5, 5.5, 7.64, 1.0} ",
					expectedValues, DataUtilities.createNumberArray2D(inputValues));	
		}
	 
	
	@Test(expected=ArrayComparisonFailure.class)
	public void testCreateNumberArrayWithZeroValues() {
		 double[][] inputValues = {
				 {0},
				 {0}
				 };
		 Number[] expectedValues = {0.0, 0.0};
		 
		 assertArrayEquals("The expected outcome should be {0.0, 0.0} ",
					expectedValues, DataUtilities.createNumberArray2D(inputValues));	
		
		 //DataUtilities.createNumberArray2D(inputValues);	
	}
	
	/*
	@Test(expected=IllegalArgumentException.class)
	public void testCreateNumberArrayWithNullValues() {
		 double[][] inputValues = {
				 {null, null},
				 {null, null}
				 };
		 Number[] expectedValues = {null, null, null, null};
		 
		 assertArrayEquals("The expected outcome should be {null, null, null, null} ",
					expectedValues, DataUtilities.createNumberArray2D(inputValues));	
		
		 //DataUtilities.createNumberArray2D(inputValues);	
	}
	*/
	
	@Test(expected=ArrayComparisonFailure.class)
	public void testCreateNumberArrayWith3DArray() {
		 double[][] inputValues = {
				 {2.2, 3.3, 4.4},
				 {4.4, 3.3, 2.2},
				 {3.3, 2.2, 4.4}
				 };
		 Number[] expectedValues = {2.2, 3.3, 4.4, 4.4, 3.3, 2.2, 3.3, 2.2, 4.4};
		 
		 assertArrayEquals("The expected outcome should be {2.2, 3.3, 4.4, 4.4, 3.3, 2.2, 3.3, 2.2, 4.4} ",
					expectedValues, DataUtilities.createNumberArray2D(inputValues));	
		}

	@Test(expected=ArrayComparisonFailure.class)
	public void testCreateNumberArrayWithSingleArray() {
		 double[][] inputValues = {
				 {10.6, 4.2}};
		 Number[] expectedValues = {10.6, 4.2};
		 
		 assertArrayEquals("The expected outcome should be {10.6, 4.2} ",
					expectedValues, DataUtilities.createNumberArray2D(inputValues));
	}
	
	@Test(expected=ArrayComparisonFailure.class)
	public void testCreateNumberArrayWithSingleNumber() {
		 double[][] inputValues = {{5}};
		 Number[] expectedValues = {5};
		 
		 assertArrayEquals("The expected outcome should be {5} ",
					expectedValues, DataUtilities.createNumberArray2D(inputValues));
	}
	
	/*
	@Test(expected=ArrayComparisonFailure.class)
	public void testCreateNumberArrayWithDoubleQuoteValue() {
		 double[][] inputValues = {{"Hello"}};
		 
		 DataUtilities.createNumberArray2D(inputValues);
	}

	@Test(expected=ArrayComparisonFailure.class)
	public void testCreateNumberArrayWithSingleQuoteValue() {
		 double[][] inputValues = {{'o'}};
		 
		 DataUtilities.createNumberArray2D(inputValues);
	}
	
	@Test(expected=ArrayComparisonFailure.class)
	public void testCreateNumberArrayWithSingleQuoteValue() {
		 double[][] inputValues = {{false}};
		 
		 DataUtilities.createNumberArray2D(inputValues);
	}
	*/
	
	// getCumulativePercentages(KeyedValues data) method test cases
	@Test
	public void testCumulativePercentagesValidData() {

		DefaultKeyedValues testValues = new DefaultKeyedValues();
		testValues.addValue("0", 4);
		testValues.addValue("1", 6);
		testValues.addValue("2", 8);
		
		List<Double> expectedValues = new ArrayList<>();
		expectedValues.add(0, 0.22);
		expectedValues.add(1, 0.56);
		expectedValues.add(2, 1.0);
		  
		assertEquals("The expected outcome should be 0=0.22, 1=0.56, 2=1.0 ",
				 expectedValues, DataUtilities.getCumulativePercentages(testValues));
	}
	
	
	@Test(expected=AssertionError.class)
	public void testCumulativePercentagesNullValues() {

		DefaultKeyedValues testValues = new DefaultKeyedValues();
		testValues.addValue("0", null);
		testValues.addValue("1", null);
		testValues.addValue("2", null);

		DataUtilities.getCumulativePercentages(testValues);
	}
	

	@Test(expected=AssertionError.class)
	public void testCumulativePercentagesZeroValues() {

		DefaultKeyedValues testValues = new DefaultKeyedValues();
		testValues.addValue("0", 0);
		testValues.addValue("1", 0);
		testValues.addValue("2", 0);

		DataUtilities.getCumulativePercentages(testValues);
	}
	
	
	@Test(expected=AssertionError.class)
	public void testCumulativePercentagesInvalidValues() {

		DefaultKeyedValues testValues = new DefaultKeyedValues();
		testValues.addValue("0", 4);
		testValues.addValue("2", 8);
		testValues.addValue("3", 5);
	
		  
		DataUtilities.getCumulativePercentages(testValues);
	}
	
	
	@Test(expected=AssertionError.class)
	public void testCumulativePercentagesOneInvalidValue() {

		DefaultKeyedValues testValues = new DefaultKeyedValues();
		testValues.addValue("5", 4);
		  
		DataUtilities.getCumulativePercentages(testValues);
	}
	
	/*
	@Test(expected=AssertionError.class)
	public void testCumulativePercentagesDoubleQuoteValue() {

		DefaultKeyedValues testValues = new DefaultKeyedValues();
		testValues.addValue("5", "Hello");
		  
		DataUtilities.getCumulativePercentages(testValues);
	}
	*/
	
	@Test(expected=AssertionError.class)
	public void testCumulativePercentagesSingleQuoteValue() {

		DefaultKeyedValues testValues = new DefaultKeyedValues();
		testValues.addValue("5", 'f');
		  
		DataUtilities.getCumulativePercentages(testValues);
	}
	
	/*
	@Test(expected=AssertionError.class)
	public void testCumulativePercentagesBooleanValue() {

		DefaultKeyedValues testValues = new DefaultKeyedValues();
		testValues.addValue("5", true);
		  
		DataUtilities.getCumulativePercentages(testValues);
	}
	*/
}
