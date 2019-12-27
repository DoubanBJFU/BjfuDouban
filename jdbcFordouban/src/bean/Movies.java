package bean;

import java.sql.Date;

public class Movies {
	private int M_id;
	private String M_name;
	private String M_language;
	private java.sql.Timestamp M_date;
	private String M_length;
	private String M_othername;
	public Movies(int m_id, String m_name, String m_language, java.sql.Timestamp m_date, String m_length, String m_othername) {
		super();
		M_id = m_id;
		M_name = m_name;
		M_language = m_language;
		M_date = m_date;
		M_length = m_length;
		M_othername = m_othername;
	}
	public Movies() {
		super();
	}
	@Override
	public String toString() {
		return "Movies [M_id=" + M_id + ", M_name=" + M_name + ", M_language=" + M_language + ", M_date=" + M_date.toString()
				+ ", M_length=" + M_length + ", M_othername=" + M_othername + "]";
	}
	public int getM_id() {
		return M_id;
	}
	public void setM_id(int m_id) {
		M_id = m_id;
	}
	public String getM_name() {
		return M_name;
	}
	public void setM_name(String m_name) {
		M_name = m_name;
	}
	public String getM_language() {
		return M_language;
	}
	public void setM_language(String m_language) {
		M_language = m_language;
	}
	public java.sql.Timestamp getM_date() {
		return M_date;
	}
	public void setM_date(java.sql.Timestamp m_date) {
		M_date = m_date;
	}
	public String getM_length() {
		return M_length;
	}
	public void setM_length(String m_length) {
		M_length = m_length;
	}
	public String getM_othername() {
		return M_othername;
	}
	public void setM_othername(String m_othername) {
		M_othername = m_othername;
	}
	
}
