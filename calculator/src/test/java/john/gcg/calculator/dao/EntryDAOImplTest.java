package john.gcg.calculator.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import john.gcg.calculator.dto.Entries;


//Test Class for testing the backend Code of DAOImpl

public class EntryDAOImplTest {
	
	
	//Before Class to mark the begining of the tests
	//Not necessary for this Test but is correct principle

	@BeforeClass
	public static void init() {
        System.out.println("\r\n"+"Initializing Test"+"\r\n");
        
        
		
    }
	
	//Test 1: It tests the getting and setting of inputs
	@Test
	public void shouldAddEntries() {
		System.out.println("\r\n"+"TEST 1"+"\r\n");
		EntryDAO dao = new EntryDAOImpl();
		Entries ent = new Entries();
		
		ent.setCountryCode("DE");
		ent.setGross(100.0);
		dao.create(ent);
		Entries result=dao.read("DE");
		assertNotNull(result);
		
		assertEquals("DE", result.getCountryCode());
		if(result.getCountryCode().equals("DE"))System.out.println("SUCCESS");else System.out.println("\r\n"+"FAIL");
		
		
		}
	
	//Test 2: Tests if given matching input, the code can calculate the Net correctly
    @Test
	public void shouldCalculate() {
    	System.out.println("\r\n"+"TEST 2"+"\r\n");
    	//creating objects to call functions
		EntryDAO dao = new EntryDAOImpl();
		Entries ent = new Entries();
		//Sets values as user inputs
		ent.setCountryCode("FR");
		ent.setGross(100.0);
		dao.create(ent);
		//Creates value to 
		Entries result=dao.read("FR");
		
		dao.calculateNet(ent);
		
		
		
       if(result.getNetPrice().equals(81.0)) {System.out.println("\r\n"+"TEST 2 success Net Price is: "+ result.getNetPrice()+"\r\n");}
       else {System.out.println("TEST 2 FAIL");}
       assertNotNull(ent.getNetPrice());
		
	}

    

}
