package bean;

public class Awards {
	private int Award_id;
	private String Award_name;
	private int M_id;
	public Awards() {
		super();
	}
	public Awards(int award_id, String award_name, int m_id) {
		super();
		Award_id = award_id;
		Award_name = award_name;
		M_id = m_id;
	}
	public int getAward_id() {
		return Award_id;
	}
	public void setAward_id(int award_id) {
		Award_id = award_id;
	}
	public String getAward_name() {
		return Award_name;
	}
	public void setAward_name(String award_name) {
		Award_name = award_name;
	}
	public int getM_id() {
		return M_id;
	}
	public void setM_id(int m_id) {
		M_id = m_id;
	}
	@Override
	public String toString() {
		return "Awards [Award_id=" + Award_id + ", Award_name=" + Award_name + ", M_id=" + M_id + "]";
	}
	
	
}
