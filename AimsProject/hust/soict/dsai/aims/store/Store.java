package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUMBER_STORED = 20;
	private DigitalVideoDisc itemsinStore[] = new DigitalVideoDisc[MAX_NUMBER_STORED];;
	private int qtyOrdered = 0;

	public boolean addDVD(DigitalVideoDisc disc){
		if (qtyOrdered >= MAX_NUMBER_STORED){
			System.out.println("Cart is out of space!");
			return false;
		}

		itemsinStore[qtyOrdered] = disc;
		qtyOrdered++;
		return true;
	}

	public boolean addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2){
		boolean check = addDVD(disc1);
		if (!check){
			return false;
		}

		check = addDVD(disc1);

		if (!check){
			return false;
		}

		return true;
	}

	public boolean addDVD(DigitalVideoDisc... disc){
		for (DigitalVideoDisc d : disc){
			boolean check = addDVD(d);
			if (!check){
				return false;
			}
		}
		return true;
	}

	public boolean removeDVD(DigitalVideoDisc disc){
		int removeidx = -1;

		for (int i = 0; i < qtyOrdered; i++){
			if (itemsinStore[i] == disc){
				removeidx = i;
				break;
			}
		}

		if (removeidx == -1){
			System.out.println("Cannot find disc");
			return false;
		}

		qtyOrdered--;

		for (int i = removeidx; i < qtyOrdered; i++){
			itemsinStore[i] = itemsinStore[i+1];
		}

		System.out.println("Removed at index " + removeidx);

		return true;

	}
}
