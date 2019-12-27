package bean;

public class Staff_link {
	private int SL_id;
	private int Staff_id;
	private int M_id;
	private String Character_name;
	private String Staff_postion;
	@Override
	public String toString() {
		return "Staff_link [SL_id=" + SL_id + ", Staff_id=" + Staff_id + ", M_id=" + M_id + ", Character_name="
				+ Character_name + ", Staff_postion=" + Staff_postion + "]";
	}
	public Staff_link(int sL_id, int staff_id, int m_id, String character_name, String staff_postion) {
		super();
		SL_id = sL_id;
		Staff_id = staff_id;
		M_id = m_id;
		Character_name = character_name;
		Staff_postion = staff_postion;
	}
	public Staff_link() {
		super();
	}
	public int getSL_id() {
		return SL_id;
	}
	public void setSL_id(int sL_id) {
		SL_id = sL_id;
	}
	public int getStaff_id() {
		return Staff_id;
	}
	public void setStaff_id(int staff_id) {
		Staff_id = staff_id;
	}
	public int getM_id() {
		return M_id;
	}
	public void setM_id(int m_id) {
		M_id = m_id;
	}
	public String getCharacter_name() {
		return Character_name;
	}
	public void setCharacter_name(String character_name) {
		Character_name = character_name;
	}
	public String getStaff_postion() {
		return Staff_postion;
	}
	public void setStaff_postion(String staff_postion) {
		Staff_postion = staff_postion;
	}
	
}
