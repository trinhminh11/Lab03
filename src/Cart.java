public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

	public void addDigitalVideoDisc(DigitalVideoDisc disc){
		if (qtyOrdered >= MAX_NUMBERS_ORDERED){
			System.out.println("Cart is out of space!");
		}
		else{
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc){
		int removeidx = -1;

		for (int i = 0; i < qtyOrdered; i++){
			if (itemOrdered[i] == disc){
				removeidx = i;
				break;
			}
		}

		if (removeidx == -1){
			System.out.println("Cannot find disc");
		}

		else{
			qtyOrdered--;

			for (int i = removeidx; i < qtyOrdered; i++){
				itemOrdered[i] = itemOrdered[i+1];
			}

			System.out.println("Removed at index " + removeidx);
		}


	}

	public float totalCost(){
		float res = 0;
		for (int i = 0; i < qtyOrdered; i++){
			res += itemOrdered[i].getCost();
		}

		return res;
	}

}


