package FactoryMethod;
import java.util.HashMap;

public class ItemFactory extends Factory {
	
	private class ItemData{
		int maxCount;
		int currentCount;
		ItemData(int maxCount){
			this.maxCount =maxCount;
		}
	}

	
	// 아이템, 생산가능개수
	private HashMap<String ,ItemData> repository;
	
	public ItemFactory() {
		repository = new HashMap<>();
		
		repository.put("sword", new ItemData(3));
		repository.put("shield", new ItemData(2));
		repository.put("bow", new ItemData(1));
		
	}
	
	@Override
	protected boolean isCreatable(String name) {
		ItemData itemData = repository.get(name);
		
		if(itemData == null) {
			System.out.println(name+"is unknwon item");
			return false;
		}
		if(itemData.currentCount >= itemData.maxCount) {
			System.out.println(name+" is sold out item");
			return false;
		}
		return true;
		
	}

	@Override
	protected Item createItem(String name) {
		Item item = null;
		
		if(name == "sword") item = new Sword();
		if(name == "shield") item = new Sword();
		if(name == "bow") item = new Sword();
		
		return item;
	}

	@Override
	public void postprocessItem(String name) {
		ItemData itemData = repository.get(name);
		if(itemData != null) itemData.currentCount++;
		
	}

}
