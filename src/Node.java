
public class Node {

	private int key ;
	private Object element ;
	
	public Node(int key , Object value)
	{
		this.key = key ;
		this.element = value ;
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
}
