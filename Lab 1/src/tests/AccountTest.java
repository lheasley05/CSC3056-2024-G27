package tests;

import model.Account;
import utils.TestUtils;
import java.util.Date;

public class AccountTest {
	
	public static void testConstructor() {
		String test_account_number = "12345";
		String test_username_of_account_holder = "ktaylor";
		String test_account_type = "Standard";
		Date date = new Date();
		Date test_account_opening_date = date;
		
		Account testAccount = new Account (test_account_number, test_username_of_account_holder, test_account_type, test_account_opening_date);
		
		if (testAccount.getAccount_number() == test_account_number)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getAccount_number-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getAccount_number-FAILED"+ TestUtils.TEXT_COLOR_RESET);
		
		if (testAccount.getUsername_of_account_holder() == test_username_of_account_holder)
			System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getUsername_of_account_holder-Passed"+ TestUtils.TEXT_COLOR_RESET);
		else
			System.out.println(TestUtils.TEXT_COLOR_RED + "TC2-getUsername_of_account_holder-FAILED"+ TestUtils.TEXT_COLOR_RESET);
    }
	
	public static void testSetters() {
		
		String test_account_number = "12345";
		String test_username_of_account_holder = "ktaylor";
		String test_account_type = "Standard";
		Date date = new Date();
		Date test_account_opening_date = date;
		
		Account testAccount = new Account (test_account_number, test_username_of_account_holder, test_account_type, test_account_opening_date);
		
		testAccount.setAccount_number(test_account_number);
        if (testAccount.getAccount_number().equals(test_account_number)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC3-setAccount_Number-Passed" +
                    TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TestSetters-TC3 failed: setAccount_number did not set the value correctly" +
                    TestUtils.TEXT_COLOR_RESET);
        }
 
        testAccount.setUsername_of_account_holder(test_username_of_account_holder);
        if (testAccount.getUsername_of_account_holder().equals(test_username_of_account_holder)) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC4-setUsername_of_account_holder-Passed" +
                    TestUtils.TEXT_COLOR_RESET);
        } else {
            System.out.println(TestUtils.TEXT_COLOR_RED + "TestSetters-TC4 failed: setUsername_of_account_holder did not set the value correctly" +
                    TestUtils.TEXT_COLOR_RESET);
        }
    }

	public static void main(String[] args) {
		testConstructor();
		testSetters();
	}

}
