package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void accept(Visitor v) {
		for (Item i : items) {
			i.accept(v); 
		}
	}
}