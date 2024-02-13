package tests;

import model.Transaction;

import java.util.Date;

public class TransactionTest {
	
	public static void main(String[] args) {
		Date date = new Date();
		Transaction testTransaction = new Transaction("1234", 40.00, date);
		
		System.out.println(testTransaction);
	}
	
}
