package dummy;

public class concreteAggregator implements Aggregator {

	@Override
	public Iterator createIterator(Aggregator aggregator) {
		
		return new concreteIterator(this);
	}

}
