package john.gcg.calculator.dto;


//Class that enables the input and usage of input data across the whole Project's classes
public class Entries {

	
	private String countryCode;
	private Double gross;
	private Double netPrice;

	//Getters and setters for all the needed given values 
	//The below classes are getting the input data and setting the values to the variables via constructors 
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Double getGross() {
		return gross;
	}
	public void setGross(Double gross) {
		this.gross = gross;
	}
	
	public Double getNetPrice() {
		return netPrice;
	}
	
	public void setNetPrice(Double netPrice) {
		this.netPrice=netPrice;
	}
	
	
	
	
	
	
}
