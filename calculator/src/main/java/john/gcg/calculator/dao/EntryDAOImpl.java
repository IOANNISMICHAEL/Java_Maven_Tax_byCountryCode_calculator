package john.gcg.calculator.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//DAOImpl Implements the DAO classes to make the code more dynamic, Testable & resistant to change 
//separating the code to upper/lower levels
import john.gcg.calculator.dto.Entries;

public class EntryDAOImpl implements EntryDAO {
    //Create variables
	Double netPrice;
	Double percentage;
	
	//Create storage unit to store the Users Input
	public static Map<String, Entries> storage = new HashMap<>();
	
	//Create "database" for Country Codes and respective tax rates
	public static Map<String, Double> taxRateProvider;
	static {
		taxRateProvider = new HashMap<>();
		taxRateProvider.put("DE", 0.16);
		taxRateProvider.put("FR", 0.19);
	}
	
	//Stores Users input to storage unit
	@Override
	public void create(Entries ent) {
		storage.put(ent.getCountryCode(), ent);}
		

	//Reads Country Code value 
	@Override
	public Entries read(String countryCode) {
		
		return storage.get(countryCode);}
	
	
	//Calculates the NET amount 
	@Override
	public Double calculateNet(Entries ent) {
		
		//Iterates the "database" with CCs and TaxRates to find a match with user's input
		for(Entry<String, Double> pair: taxRateProvider.entrySet()) {
			
			//taxRateProvider.forEach((key, value) -> System.out.println(key + " : " + value));
			
			//In case a match is found, it calculates the Net,outputs the Net, and returns the Net amount back to the Class 
		      if(pair.getKey().equals(ent.getCountryCode())) {
		    	  
		    	 percentage=pair.getValue();
		    	 Double temp = ent.getGross()*percentage;
		    	 netPrice=ent.getGross()-temp;
		    	 ent.setNetPrice(netPrice);
		        System.out.println("\r\n"+"From DAOImpl: "+" CC Found "+"The CC is "+ent.getCountryCode()+" The net price is  " + netPrice + "\r\n");
		        break;
		       }else System.out.println("Not Found");//print not Found at every position of Map where input was no match
		      
		       
	}  
	return ent.getNetPrice();
			
	}}
