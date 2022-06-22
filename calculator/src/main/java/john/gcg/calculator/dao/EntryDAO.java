package john.gcg.calculator.dao;

import john.gcg.calculator.dto.Entries;


//Data Access Object (DAO) Class to isolate the application/business 
public interface EntryDAO {

	void create(Entries ent);
	Entries read(String countryCode);
	Double calculateNet(Entries ent);
	
	

}
