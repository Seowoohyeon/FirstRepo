package myobj.item;


public class Inventory {
	Item[] inventory;
	int size;
	
	public Inventory(int size) {
		inventory = new Item[size];
	}
	
	public boolean put(Item item) {
		for(int i = 0;i < inventory.length; i++) {
			if(inventory[i] == null) {
				inventory[i] = item;
				return true;
			}
		}
		System.out.println("가방이 꽉참");
		return false;
	}
	
	public void useAllItems() {
		for(Item item : inventory) {
			if(item  != null) {
				item.use();
			}
		}
	} 
	
		
	public static void main(String[] args) {
		Inventory inven1 = new Inventory(3);
			
		inven1.put(new Shampoo("헤어좋아",8900));
		inven1.put(new Spear("사냥창",30000));
		inven1.put(new Sword("기본 검",1000));
		
		inven1.useAllItems();
	}	
}

