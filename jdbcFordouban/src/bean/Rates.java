package bean;

public class Rates {
	private int R_id;
	private int U_id;
	private int M_id;
	private String R_type;
	private String R_comments;
	private String R_stars;
	public int getR_id() {
		return R_id;
	}
	public void setR_id(int r_id) {
		R_id = r_id;
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
	public String getR_type() {
		return R_type;
	}
	public void setR_type(String r_type) {
		R_type = r_type;
	}
	public String getR_comments() {
		return R_comments;
	}
	public void setR_comments(String r_comments) {
		R_comments = r_comments;
	}
	public String getR_stars() {
		return R_stars;
	}
	public void setR_stars(String r_stars) {
		R_stars = r_stars;
	}
	@Override
	public String toString() {
		return "Rates [R_id=" + R_id + ", U_id=" + U_id + ", M_id=" + M_id + ", R_type=" + R_type + ", R_comments="
				+ R_comments + ", R_stars=" + R_stars + "]";
	}
	public Rates(int r_id, int u_id, int m_id, String r_type, String r_comments, String r_stars) {
		super();
		R_id = r_id;
		U_id = u_id;
		M_id = m_id;
		R_type = r_type;
		R_comments = r_comments;
		R_stars = r_stars;
	}
	public Rates() {
		super();
	}
	
}
