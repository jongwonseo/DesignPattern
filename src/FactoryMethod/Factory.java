package FactoryMethod;

public abstract class Factory {
	// name: 생성하고자 하는 item
	public Item create(String name) {
		boolean bCreatable = this.isCreatable(name);
		if(bCreatable) {
			Item item = this.createItem(name);
			postprocessItem(name);
			return item;
		}
		return null;
		
		
	}

	protected abstract boolean isCreatable(String name);
	protected abstract Item createItem(String name);
	public abstract void postprocessItem(String name);
	
}
