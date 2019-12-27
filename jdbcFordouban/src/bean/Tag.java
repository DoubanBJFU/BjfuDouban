package bean;

public class Tag {	
	private int Tag_id;
	private int Tag_name;
	public Tag(int tag_id, int tag_name) {
		super();
		Tag_id = tag_id;
		Tag_name = tag_name;
	}
	public Tag() {
		super();
	}
	@Override
	public String toString() {
		return "Tag [Tag_id=" + Tag_id + ", Tag_name=" + Tag_name + "]";
	}
	public int getTag_id() {
		return Tag_id;
	}
	public void setTag_id(int tag_id) {
		Tag_id = tag_id;
	}
	public int getTag_name() {
		return Tag_name;
	}
	public void setTag_name(int tag_name) {
		Tag_name = tag_name;
	}
	
}
