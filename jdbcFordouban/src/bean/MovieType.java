package bean;

public class MovieType {
	private int MT_id;
	private String MT_name;
	public MovieType(int mT_id, String mT_name) {
		super();
		MT_id = mT_id;
		MT_name = mT_name;
	}
	public MovieType() {
		super();
	}
	@Override
	public String toString() {
		return "MovieType [MT_id=" + MT_id + ", MT_name=" + MT_name + "]";
	}
	public int getMT_id() {
		return MT_id;
	}
	public void setMT_id(int mT_id) {
		MT_id = mT_id;
	}
	public String getMT_name() {
		return MT_name;
	}
	public void setMT_name(String mT_name) {
		MT_name = mT_name;
	}
	
	
}
