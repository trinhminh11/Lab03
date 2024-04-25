public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

	public boolean addDigitalVideoDisc(DigitalVideoDisc disc){
		if (qtyOrdered >= MAX_NUMBERS_ORDERED){
			System.out.println("Cart is out of space!");
			return false;
		}

		itemOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		return true;
	}

	public boolean addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2){
		boolean check = addDigitalVideoDisc(disc1);
		if (!check){
			return false;
		}

		check = addDigitalVideoDisc(disc1);

		if (!check){
			return false;
		}

		return true;
	}

	public boolean addDigitalVideoDisc(DigitalVideoDisc... disc){
		for (DigitalVideoDisc d : disc){
			boolean check = addDigitalVideoDisc(d);
			if (!check){
				return false;
			}
		}
		return true;
	}

	public boolean removeDigitalVideoDisc(DigitalVideoDisc disc){
		int removeidx = -1;

		for (int i = 0; i < qtyOrdered; i++){
			if (itemOrdered[i] == disc){
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
			itemOrdered[i] = itemOrdered[i+1];
		}

		System.out.println("Removed at index " + removeidx);

		return true;


	}

	public float totalCost(){
		float res = 0;
		for (int i = 0; i < qtyOrdered; i++){
			res += itemOrdered[i].getCost();
		}

		return res;
	}


	public void SearchDVD(int id){
		for (int i = 0; i < qtyOrdered; i++){
			if (itemOrdered[i].isMatch(id)){
				System.out.println(itemOrdered[i].toString());
				return;
			}
		}

		System.out.println("No Match found");
	}
	
	public String toString(){
		String res = "";

		res += "*****************************CART*****************************\n";
		for (int i = 0; i < qtyOrdered; i++){
			DigitalVideoDisc current = itemOrdered[i];
			res += current.toString() + "\n";
		}

		res += "Total cost: " + totalCost() + "\n";
		res += "**************************************************************";

		return res;
	}

	public void print(){
		System.out.println(toString());
	}

}


