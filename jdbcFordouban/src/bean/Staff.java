package bean;

import java.sql.Blob;

public class Staff {
	private int Staff_id;
	private String Staff_name;
	private Blob Staff_photo;
	public Staff(int staff_id, String staff_name, Blob staff_photo) {
		super();
		Staff_id = staff_id;
		Staff_name = staff_name;
		Staff_photo = staff_photo;
	}
	public Staff() {
		super();
	}
	@Override
	public String toString() {
		return "Staff [Staff_id=" + Staff_id + ", Staff_name=" + Staff_name + ", Staff_photo=" + Staff_photo + "]";
	}
	public int getStaff_id() {
		return Staff_id;
	}
	public void setStaff_id(int staff_id) {
		Staff_id = staff_id;
	}
	public String getStaff_name() {
		return Staff_name;
	}
	public void setStaff_name(String staff_name) {
		Staff_name = staff_name;
	}
	public Blob getStaff_photo() {
		return Staff_photo;
	}
	public void setStaff_photo(Blob staff_photo) {
		Staff_photo = staff_photo;
	}
	
}
