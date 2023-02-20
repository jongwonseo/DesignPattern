package Adaptor;

public class TigerAdapter extends Animal{	
	private Tiger tiger;

	public TigerAdapter(String name) {
		super(name);
		this.tiger = new Tiger();
		this.tiger.setName(name);
	}

	@Override
	public void sound() {
		System.out.println(tiger.getNmme()+" ");
		tiger.roar();
	}

}
