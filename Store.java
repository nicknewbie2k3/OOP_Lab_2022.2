package hust.soict.globalict.aims.store;

public class Store {
	DigitalVideoDisc itemsInStore[];
	int count = 0;
	public void addDVD(DigitalVideoDisc object) {
		itemsInStore[count] = object;
		count++;
		System.out.println("Added DVD to store successfully!");
	}
	public void removeDVD(int i) {
		int deleted = 0;
		while (i < count) {
			itemsInStore[i+1] = itemsInStore[i];
		}
		if (deleted == 0) {
			System.out.println("The requested ID is not found.");
		} else count--;
	}
}
