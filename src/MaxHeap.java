
public class MaxHeap {
	
	private Node[] elements ;
	public int length , heap_size ;
	
	public MaxHeap(int maxSize)
	{
		
		elements = new Node[maxSize];
		this.heap_size =0;
		length = maxSize;
	}
	
	public MaxHeap(){}
	
	
	/******************** private methods ******************/
	private int parent(int i){
		
		return (int)(Math.ceil(i/2.0)-1) ;
	}
	
	private int leftChild(int i){
		
		return (i<<1) +1 ;
	}
	
	private int rightChild(int i)
	{
		return (i<<1)+2 ;
	}
	
	private void swap(int i ,int j)
	{
		Node temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp ;
	}
	
	private void siftUp(int i)
	{
		int parent = parent(i);
		while(parent >= 0 && elements[i].getKey()>elements[parent].getKey())
		{
			swap(i,parent);
			i=parent;
			parent = parent(i);
		}
	}
	
	private void maxHeapify(int i){
		
		int max = i ;
		int left = leftChild(i) ;
		int right= rightChild(i) ;
		
		if(left < heap_size && elements[left].getKey() > elements[max].getKey() )
			max = left ;
		
		if(right < heap_size && elements[right].getKey() > elements[max].getKey())
			max = right ;
		
		if(max != i)
		{
			swap(i,max);
			maxHeapify(max);
		}
		
		
	}
	
	private void build_heap(int i)
	{
		int left =leftChild(i) ;
		int right =rightChild(i);
		
		if(left<heap_size)
		{
			build_heap(left);
			if(elements[i].getKey() < elements[left].getKey())
				swap(i,left);
		}
		
		if(right<heap_size)
		{
			build_heap(right);
			if(elements[i].getKey() < elements[right].getKey())
				swap(i,right);
		}
		
	}
	
	
	
	/****************** public methods *******************/
	
	public void setSize(int maxSize)
	{
		elements = new Node[maxSize];
		this.heap_size =0;
		length = maxSize;
	}
	public void buildMaxHeap_iterative(Node[] x){
		
		heap_size = x.length;
		length = x.length;
		elements = x ;
		
		for (int i = parent(heap_size-1); i >=0 ; i--) {
			maxHeapify(i);
		}
		
	}
	
	public void buildMaxHeap_recursive(Node[] x){
		
		heap_size = x.length;
		length = x.length;
		elements = x ;		
		build_heap(0);
	}
	
	public Node extractMax() throws Exception{
		
		if(heap_size==0)
			throw new Exception("Heap is Empty !");
		
		Node max = elements[0];
		
		elements[0] = elements[heap_size-1];
		heap_size --;
		maxHeapify(0);
		
		return max ;
	}


	public Node retrieveMax() throws Exception{
		
		if(heap_size>0)
			return elements[0];
		
		throw new Exception("Heap is Empty !");
	}
	
	public void insert(Node e) throws Exception
	{
		if(elements == null)
			throw new Exception("Set heap size first ");
		if(heap_size==length)
			throw new Exception("Heap is full !");
		
		elements[heap_size] = e ;
		siftUp(heap_size);
		heap_size++;
		
	}
	
	public void print()
	{
		
		for (int i = 0; i < heap_size; i++) {
			System.out.println(elements[i].getKey());
		}
	}

	
}


