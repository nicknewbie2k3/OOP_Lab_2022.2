package mypackage;
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
	public void showCart() {
		System.out.println("*****************CART*****************");
		System.out.println("Ordered items:");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(i+". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory()
					+ " - " +itemsOrdered[i].getDirector()+ " - "+ itemsOrdered[i].getLength() + ":" + itemsOrdered[i].getCost() + "$");
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("**************************************");
	}
	
	public void showCartByID(int idSearch){
		System.out.println("*****************CART*****************");
		System.out.println("Ordered items sorted by the ID " + idSearch + ":");
		if (idSearch <= qtyOrdered)
			System.out.println(idSearch+". DVD - " + itemsOrdered[idSearch].getTitle() + " - " + itemsOrdered[idSearch].getCategory()
					+ " - " +itemsOrdered[idSearch].getDirector()+ " - "+ itemsOrdered[idSearch].getLength() + ":" + itemsOrdered[idSearch].getCost() + "$");
		else System.out.println("No item with the ID given is found.");
		System.out.println("**************************************");
	}
	
	public void showCartByTitle (String titleSearch) {
		System.out.println("*****************CART*****************");
		System.out.println("Ordered items sorted by the title " + titleSearch + ":");
		int count = 0;
		for (int i = 0; i < qtyOrdered && itemsOrdered[i].getTitle() == titleSearch; i++) {
			System.out.println(i+". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory()
					+ " - " +itemsOrdered[i].getDirector()+ " - "+ itemsOrdered[i].getLength() + ":" + itemsOrdered[i].getCost() + "$");
			count++;
		}
		if (count == 0) System.out.println("No item with the title given is found.");
		System.out.println("**************************************");
	}
}
