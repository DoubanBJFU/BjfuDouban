package bean;

public class Users {
	private int U_id;
	private String U_name;
	private String U_pwd;
	private String U_tel;
	private String U_email;
	public Users(int u_id, String u_name, String u_pwd, String u_tel, String u_email) {
		super();
		U_id = u_id;
		U_name = u_name;
		U_pwd = u_pwd;
		U_tel = u_tel;
		U_email = u_email;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [U_id=" + U_id + ", U_name=" + U_name + ", U_pwd=" + U_pwd + ", U_tel=" + U_tel + ", U_email="
				+ U_email + "]";
	}
	public int getU_id() {
		return U_id;
	}
	public void setU_id(int u_id) {
		U_id = u_id;
	}
	public String getU_name() {
		return U_name;
	}
	public void setU_name(String u_name) {
		U_name = u_name;
	}
	public String getU_pwd() {
		return U_pwd;
	}
	public void setU_pwd(String u_pwd) {
		U_pwd = u_pwd;
	}
	public String getU_tel() {
		return U_tel;
	}
	public void setU_tel(String u_tel) {
		U_tel = u_tel;
	}
	public String getU_email() {
		return U_email;
	}
	public void setU_email(String u_email) {
		U_email = u_email;
	}
	
}
