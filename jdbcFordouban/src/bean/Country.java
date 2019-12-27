package bean;

public class Country {
	private int Country_id;
	private String Country_name;
	public Country(int country_id, String country_name) {
		super();
		Country_id = country_id;
		Country_name = country_name;
	}
	public Country() {
		super();
	}
	@Override
	public String toString() {
		return "Country [Country_id=" + Country_id + ", Country_name=" + Country_name + "]";
	}
	public int getCountry_id() {
		return Country_id;
	}
	public void setCountry_id(int country_id) {
		Country_id = country_id;
	}
	public String getCountry_name() {
		return Country_name;
	}
	public void setCountry_name(String country_name) {
		Country_name = country_name;
	}
	
	
}
