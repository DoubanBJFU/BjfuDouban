package bean;

public class Country_link {
	private int Country_id;
	private int M_id;
	private int CL_id;
	
	public int getCountry_id() {
		return Country_id;
	}

	public void setCountry_id(int country_id) {
		Country_id = country_id;
	}

	public int getM_id() {
		return M_id;
	}

	public void setM_id(int m_id) {
		M_id = m_id;
	}

	public int getCL_id() {
		return CL_id;
	}

	public void setCL_id(int cL_id) {
		CL_id = cL_id;
	}

	public Country_link() {
		super();
	}

	public Country_link(int country_id, int m_id, int cL_id) {
		super();
		Country_id = country_id;
		M_id = m_id;
		CL_id = cL_id;
	}

	@Override
	public String toString() {
		return "Country_link [Country_id=" + Country_id + ", M_id=" + M_id + "]";
	}
	
}
