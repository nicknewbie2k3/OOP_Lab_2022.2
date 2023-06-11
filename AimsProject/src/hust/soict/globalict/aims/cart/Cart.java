package hust.soict.globalict.aims.cart;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = 0;
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) System.out.println("The cart is almost full!");
			System.out.println("Added DVD(s) to cart successfully!");
		} else System.out.println("The cart is full!");
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	    boolean found = false;
	    int index = -1;
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i].equals(disc)) {
	            found = true;
	            index = i;
	            break;
	        }
	    }
	    if (found) {
	        for (int i = index; i < qtyOrdered - 1; i++) {
	            itemsOrdered[i] = itemsOrdered[i + 1];
	        }
	        itemsOrdered[qtyOrdered - 1] = null;
	        qtyOrdered--;
	        System.out.println("Disc removed successfully.");
	    } else System.out.println("Disc not found in the cart.");
	}
	public float totalCost() {
		float a = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			a += itemsOrdered[i].getCost();
		}
		return a;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		for (int i = 0; i < dvdList.length; i++) {
			addDigitalVideoDisc(dvdList[i]);
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
}
