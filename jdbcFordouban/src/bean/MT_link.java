package bean;

public class MT_link {
	private int SL_id;
	private int MT_id;
	private int M_id;
	public MT_link(int mL_id, int mT_id, int m_id) {
		super();
		SL_id = mL_id;
		MT_id = mT_id;
		M_id = m_id;
	}
	public MT_link() {
		super();
	}
	@Override
	public String toString() {
		return "MT_link [ML_id=" + SL_id + ", MT_id=" + MT_id + ", M_id=" + M_id + "]";
	}
	public int getML_id() {
		return SL_id;
	}
	public void setML_id(int mL_id) {
		SL_id = mL_id;
	}
	public int getMT_id() {
		return MT_id;
	}
	public void setMT_id(int mT_id) {
		MT_id = mT_id;
	}
	public int getM_id() {
		return M_id;
	}
	public void setM_id(int m_id) {
		M_id = m_id;
	}
	
}
