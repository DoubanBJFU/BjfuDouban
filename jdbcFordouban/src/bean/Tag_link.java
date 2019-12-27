package bean;

public class Tag_link {
	private int Tag_id;
	private int M_id;
	private int TL_id;
	public Tag_link(int tag_id, int m_id, int tL_id) {
		super();
		Tag_id = tag_id;
		M_id = m_id;
		TL_id = tL_id;
	}
	public Tag_link() {
		super();
	}
	@Override
	public String toString() {
		return "Tag_link [Tag_id=" + Tag_id + ", M_id=" + M_id + ", TL_id=" + TL_id + "]";
	}
	public int getTag_id() {
		return Tag_id;
	}
	public void setTag_id(int tag_id) {
		Tag_id = tag_id;
	}
	public int getM_id() {
		return M_id;
	}
	public void setM_id(int m_id) {
		M_id = m_id;
	}
	public int getTL_id() {
		return TL_id;
	}
	public void setTL_id(int tL_id) {
		TL_id = tL_id;
	}
	
}
