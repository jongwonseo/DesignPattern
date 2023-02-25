package dummy;

public class concreteIterator implements Iterator{
	private Aggregator aggregator;
	
	public concreteIterator(Aggregator aggregator) {
		this.aggregator = aggregator;
	}
	
	@Override
	public void hasNext() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Aggregator getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
