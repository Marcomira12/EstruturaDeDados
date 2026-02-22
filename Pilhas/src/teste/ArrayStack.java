package teste;

public class ArrayStack implements Stack{
	public static final int CAPACITY=1000;
	private int capacity;
	private Object S[];
	private int top=-1;
	
	public ArrayStack(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object top() throws StackEmptyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		return null;
	}

}
