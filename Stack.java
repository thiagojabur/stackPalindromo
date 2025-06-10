
public class Stack {
	protected Node head;
    protected Node tail; 	
    private int size=0;
	public Stack() {
		super();
	}
	public int getSize() {
		return size;
	}
	
	public void push(Node v) {
		if (size==0) {
			head = tail = v;
			size++;
			return;
		}
		tail.setNext(v);
		tail = v;
		size++;
	}
	
	public Node pop() {
		if (size ==0) return null;
		Node penultimate = head;
		Node returnPop = tail;
		for (int i=size-2; i>0; i--) 
			penultimate = penultimate.getNext();
		tail = penultimate;
		tail.setNext(null);
		size--;
		
		return returnPop;
	}
	
	public Node top() {
		if (size ==0) return null;
		return tail;
	}
	
	
	
	public String toString() {
		String retorno = "";
		Node aux = head;
		for (int i =0; i < size; i++) {
			retorno += aux.getElement() + "";
		    aux = aux.getNext();
		}
		return retorno;
	}

}