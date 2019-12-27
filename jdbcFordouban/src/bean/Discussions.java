package bean;

public class Discussions {
	private int Dis_id;
	private int Dis_parent_id;
	private int U_id;
	private int M_id;
	private String Dis_title;
	private String Dis_content;
	public Discussions(int dis_id, int dis_parent_id, int u_id, int m_id, String dis_title, String dis_content) {
		super();
		Dis_id = dis_id;
		Dis_parent_id = dis_parent_id;
		U_id = u_id;
		M_id = m_id;
		Dis_title = dis_title;
		Dis_content = dis_content;
	}
	public Discussions() {
		super();
	}
	@Override
	public String toString() {
		return "Discussions [Dis_id=" + Dis_id + ", Dis_parent_id=" + Dis_parent_id + ", U_id=" + U_id + ", M_id="
				+ M_id + ", Dis_title=" + Dis_title + ", Dis_content=" + Dis_content + "]";
	}
	public int getDis_id() {
		return Dis_id;
	}
	public void setDis_id(int dis_id) {
		Dis_id = dis_id;
	}
	public int getDis_parent_id() {
		return Dis_parent_id;
	}
	public void setDis_parent_id(int dis_parent_id) {
		Dis_parent_id = dis_parent_id;
	}
	public int getU_id() {
		return U_id;
	}
	public void setU_id(int u_id) {
		U_id = u_id;
	}
	public int getM_id() {
		return M_id;
	}
	public void setM_id(int m_id) {
		M_id = m_id;
	}
	public String getDis_title() {
		return Dis_title;
	}
	public void setDis_title(String dis_title) {
		Dis_title = dis_title;
	}
	public String getDis_content() {
		return Dis_content;
	}
	public void setDis_content(String dis_content) {
		Dis_content = dis_content;
	}
	
	
}
